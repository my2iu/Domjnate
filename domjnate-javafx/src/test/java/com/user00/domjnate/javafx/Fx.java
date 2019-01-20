package com.user00.domjnate.javafx;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;

public class Fx {

  /**
   * Awaits on a latch and do appropriate handling of exceptions
   */
  public static void awaitUninterruptibly(CountDownLatch latch) {
    try {
      latch.await();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
  
  /**
   * Creates a blank web page in a JavaFx WebView, waits for it to initialize, 
   * and then runs the provided code in a JavaFx thread that uses that web page.
   * Exceptions from the provided code will be propagated and rethrown.
   */
  public static <E extends Throwable> void runBlankWebPageInFx(final FxWebViewTestRunnable<E> runnable) throws E {
    final CountDownLatch wait = new CountDownLatch(1);
    final AtomicReference<WebEngine> createdWebEngine = new AtomicReference<>();

    // Create a web view and load a blank page in it.
    runInFx(new FxTestRunnable<E>() {
      @Override
      public void run() throws E {
        WebView browser = new WebView();
        WebEngine engine = browser.getEngine();
        createdWebEngine.set(engine);
        engine.setOnAlert(new EventHandler<WebEvent<String>>() {
          @Override
          public void handle(WebEvent<String> msg) {
            System.err.println(msg.getData());
          }});
        engine.getLoadWorker().stateProperty().addListener(
            new ChangeListener<Worker.State>() {
              @Override
              public void changed(ObservableValue<? extends State> ov,
                  State oldState, State newState) {
                if (newState == Worker.State.SUCCEEDED) {
                  wait.countDown();
                }
              }
            });
        engine.loadContent("<html></html>");
      }
    });
    
    // Wait until the blank web page is loaded.
    Fx.awaitUninterruptibly(wait);
    
    // Run some code that uses that WebView
    runInFx(new FxTestRunnable<E>() {
      @Override
      public void run() throws E {
        runnable.run(createdWebEngine.get());
      }
    });
  }
  
  public static interface FxWebViewTestRunnable<E extends Throwable> {
    public void run(WebEngine engine) throws E;
  }

  /**
   * Initializes JavaFx (if necessary) and runs some code in the JavaFx thread.
   * Exceptions from the provided code will be propagated and rethrown.
   */
  public static <E extends Throwable> void runInFx(final FxTestRunnable<E> runnable) throws E {
    final AtomicReference<Throwable> exceptionsThrown = new AtomicReference<>();
    final CountDownLatch wait = new CountDownLatch(1);
    
    new JFXPanel();
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        try {
          runnable.run();
        } catch (Throwable e) {
          // Save all exceptions since it's not possible to catch generic exceptions
          exceptionsThrown.set(e);
        } finally {
          wait.countDown();
        }
      }
    });
    
    // Wait for the code running the JavaFx thread finishes
    Fx.awaitUninterruptibly(wait);
    
    // Assume that exceptions are of type E or are RuntimeExceptions
    Throwable e = exceptionsThrown.get();
    if (e != null) {
      if (e instanceof RuntimeException)
        throw (RuntimeException)e;
      else
        throw (E)e;
    }
  }
  
  public static interface FxTestRunnable<E extends Throwable> {
    public void run() throws E;
  }

//  public static void main(String [] args)
//  {
//     JFrame a = new JFrame();
//     a.setLayout(new BorderLayout());
//     JFXPanel panel = new JFXPanel();
//     a.setSize(200,200);
//     a.show();
//     a.add(panel);
//     Platform.runLater( () -> {
//        WebView browser = new WebView();
//        WebEngine engine = browser.getEngine();
//        panel.setScene(new Scene(browser));
////        engine.loadContent("<html><div style='display:flex; justify-content: space-between; width: 150px;'><div>a</div><div>b</div></div></html>");
//        engine.loadContent("<html><div style='display:grid; grid-template-columns: 1fr 1fr 1fr'><div>a</div><div>b</div><div>c</div></div></html>");
//     });
// }
}