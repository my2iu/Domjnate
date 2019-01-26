package com.user00.domjnate.javafx;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import org.junit.Test;

import com.user00.domjnate.api.CSSRule;
import com.user00.domjnate.api.EventListener;
import com.user00.domjnate.api.FrameRequestCallback;
import com.user00.domjnate.api.JSON;
import com.user00.domjnate.api.MouseEvent;
import com.user00.domjnate.api.MouseEventInit;
import com.user00.domjnate.api.TextDecoder;
import com.user00.domjnate.api.TextEncoder;
import com.user00.domjnate.api.URL;
import com.user00.domjnate.api.Uint8Array;
import com.user00.domjnate.api.Window;
import com.user00.domjnate.api.WindowOrWorkerGlobalScope;
import com.user00.domjnate.api.XMLHttpRequest;
import com.user00.domjnate.api.dom.Element;
import com.user00.domjnate.api.dom.Event;
import com.user00.domjnate.api.html.HTMLDivElement;
import com.user00.domjnate.api.html.HTMLElement;
import com.user00.domjnate.api.intl.NumberFormat;
import com.user00.domjnate.util.EmptyInterface;
import com.user00.domjnate.util.Js;

import javafx.scene.web.WebEngine;
import netscape.javascript.JSObject;

public class GeneralTest
{
   @Test
   public void testBasic()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsUrl = (JSObject)engine.executeScript("new URL('http://www.example.com/test')");
         URL url = DomjnateFx.createJsBridgeProxy(URL.class, jsUrl, null);
         Assert.assertEquals("www.example.com", url.getHost());
         Assert.assertEquals("/test", url.getPathname());
         Assert.assertEquals("", url.getPort());
         url.setPort("8080");
         Assert.assertEquals("http://www.example.com:8080/test", url.getHref());
      });
   }
   
   @Test
   public void testWindow()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Assert.assertEquals("", win.getStatus());
      });
   }
   
   @Test
   public void testStaticProperty()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Assert.assertEquals(6, CSSRule.PAGE_RULE(win), 0);
         
         // TODO: test static setting of properties
      });
      
   }
   
   @Test
   public void testConstructor()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         XMLHttpRequest xmlhttp = XMLHttpRequest._new(win);
         Assert.assertEquals("", xmlhttp.getResponseText());
         Assert.assertEquals(0, xmlhttp.getStatus(), 0);
      });
   }

   @Test
   public void testConstructorParameters()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         MouseEvent evt = MouseEvent._new(win, "click");
         Assert.assertEquals("click", evt.getType());
      });
   }
   
   @Test
   public void testStaticMethod()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Assert.assertEquals(Math.E, com.user00.domjnate.api.Math.E(win), 0.00001);
      });
   }
   
   @Test
   public void testStaticMethodSignature()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Assert.assertEquals(32, com.user00.domjnate.api.Number.call(win, 32), 0.00001);
      });
   }
   
   @Test
   public void testMethod()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Assert.assertEquals("aGVsbG8=", win.btoa("hello"));
      });
   }

   // JavaFx webview doesn't support the Intl namespace, so there's nothing to test
   // (In any case, the code for this isn't generated properly)
   @Test(expected=IllegalArgumentException.class)
   public void testConstructorNamespaced()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         NumberFormat nf = NumberFormat._new(win, "en-US");
         Assert.assertNotNull(nf);
      });
      
   }

   // JavaFx webview doesn't support the Intl namespace, so there's nothing to test
   // (In any case, the code for this isn't generated properly)
   @Test(expected=IllegalArgumentException.class)
   public void testFunctionGetterAsMethod()
   {
      // Tests NumberFormat.format (returns function object treated as method)
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         NumberFormat nf = NumberFormat._new(win, "en-US");
         Assert.assertEquals("52", nf.format(5.2));
      });
      
   }

   @Test
   public void testIndexSignature()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         TextEncoder textEncoder = TextEncoder._new(win);
         Uint8Array bytes = textEncoder.encode("hello");
         Assert.assertEquals(5, bytes.getLength(), 0);
         Assert.assertEquals(104.0, bytes.get(0), 0);
      });
   }

   @Test
   public void testWrappedObjectToMethod()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         TextEncoder textEncoder = TextEncoder._new(win);
         Uint8Array bytes = textEncoder.encode("hello");
         Assert.assertEquals(104.0, bytes.get(0), 0);
         Assert.assertEquals(5, bytes.getLength(), 0);
         
         TextDecoder textDecoder = TextDecoder._new(win);
         String hello = textDecoder.decode(bytes);
         Assert.assertEquals("hello", hello);
      });
   }

   @Test
   public void testBasicDom()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         HTMLElement body = win.getDocument().getBody();
         body.setInnerHTML("<div>hello</div>");
         HTMLElement el = Js.cast(body.querySelector("div"), HTMLElement.class);
         Assert.assertEquals("hello", el.getTextContent());
      });
   }
   
   @Test
   public void testNodeList()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         HTMLElement body = win.getDocument().getBody();
         body.setInnerHTML("<div>hello</div><div>hello2</div>");
         Element el = body.querySelectorAll("div").get(1, Element.class);
         Assert.assertEquals("hello2", el.getTextContent());
      });
   }
   
   // TODO: Test Date.toLocaleString() (pass wrapped object into method)
   
   @Test
   public void testReturnLangObject() throws NoSuchMethodException
   {
      // Tests returning a generic java.lang.Object from JavaScript that has no type
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Assert.assertEquals(java.lang.Object.class, JSON.class.getMethod("parse", new Class<?>[] {WindowOrWorkerGlobalScope.class, String.class}).getReturnType());
         Assert.assertTrue(JSON.parse(win, "[\"hello\"]") instanceof java.lang.Object);
         Assert.assertTrue(JSON.parse(win, "[\"hello\"]") instanceof EmptyInterface);
      });
   }
   
   static final int WAIT_TIME = 5;
   
   @Test
   public void testCallback() throws InterruptedException, ExecutionException, TimeoutException
   {
      CompletableFuture<Boolean> triggered = new CompletableFuture<>();
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         win.requestAnimationFrame((time) -> {
            triggered.complete(true);
         });
      });
      
      Assert.assertTrue(triggered.get(WAIT_TIME, TimeUnit.SECONDS).booleanValue());
   }
   
   /** Tests an event callback called from JavaScript, which is passed JS objects */
   @Test
   public void testEventCallback() throws InterruptedException, ExecutionException, TimeoutException
   {
      CompletableFuture<Double> triggered = new CompletableFuture<>();
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         win.getDocument().getBody().setInnerHTML("<div>text</div>");
         HTMLDivElement div = Js.cast(win.getDocument().querySelector("div"), HTMLDivElement.class);
         div.addEventListener("click", (evt) -> {
            div.setTextContent("hi");
            triggered.complete(Js.cast(evt, MouseEvent.class).getButton());
         });
         
         MouseEventInit meInit = Js.cast(com.user00.domjnate.api.Object._new(win), MouseEventInit.class);
         meInit.setButton(42.0);
         MouseEvent me = MouseEvent._new(win, "click", meInit);
         div.dispatchEvent(me);
      });
      
      Assert.assertEquals(42.0, triggered.get(WAIT_TIME, TimeUnit.SECONDS), 0.001);
   }
   
   @Test
   public void testAddRemoveEventHandler() throws Exception
   {
      AtomicInteger nextTrigger = new AtomicInteger(0);
      CompletableFuture<Boolean> [] triggered = new CompletableFuture [] {
         new CompletableFuture<Boolean>(), new CompletableFuture<Boolean>(), new CompletableFuture<Boolean>()
      };
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         win.getDocument().getBody().setInnerHTML("<div>text</div>");
         HTMLDivElement div = Js.cast(win.getDocument().querySelector("div"), HTMLDivElement.class);
         EventListener listener1 = (evt) -> {
            triggered[nextTrigger.get()].complete(true);
            nextTrigger.incrementAndGet();
            // Prevent the other event handler from firing
            evt.stopImmediatePropagation();
         };
         EventListener listener2 = (evt) -> {
            div.setTextContent("hi2");
            triggered[nextTrigger.get()].complete(true);
            nextTrigger.incrementAndGet();
         };
         div.addEventListener("click", listener1);
         div.addEventListener("click", listener2);
         
         // Send an event in, and only the first listener should fire
         MouseEvent me = MouseEvent._new(win, "click");
         div.dispatchEvent(me);
         triggered[0].get(WAIT_TIME, TimeUnit.SECONDS);
         Assert.assertEquals("text", div.getTextContent());
         
         // Try removing one of the event listeners
         div.removeEventListener("click", listener1);
         
         // Send an event in, and only the second event handler should fire
         Assert.assertEquals(1, nextTrigger.get());
         div.dispatchEvent(me);
         triggered[1].get(WAIT_TIME, TimeUnit.SECONDS);
         Assert.assertEquals(2, nextTrigger.get());
         Assert.assertEquals("hi2", div.getTextContent());
         triggered[2].complete(true);
      });
      
      Assert.assertTrue(triggered[2].get(WAIT_TIME, TimeUnit.SECONDS));
      Assert.assertEquals(2, nextTrigger.get());
   }
}
