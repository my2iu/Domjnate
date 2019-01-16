package com.user00.domjnate.javafx;

import org.junit.Assert;
import org.junit.Test;

import com.user00.domjnate.api.CSSRule;
import com.user00.domjnate.api.MouseEvent;
import com.user00.domjnate.api.TextDecoder;
import com.user00.domjnate.api.TextEncoder;
import com.user00.domjnate.api.URL;
import com.user00.domjnate.api.Uint8Array;
import com.user00.domjnate.api.Window;
import com.user00.domjnate.api.XMLHttpRequest;
import com.user00.domjnate.api.html.HTMLBodyElement;
import com.user00.domjnate.api.html.HTMLElement;
import com.user00.domjnate.api.intl.NumberFormat;
import com.user00.domjnate.util.Js;
import com.user00.domjnate.util.JsThunkAccess;

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
         Assert.assertEquals(6, CSSRule.getPAGE_RULE(win), 0);
         
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
         Assert.assertEquals(Math.E, com.user00.domjnate.api.Math.getE(win), 0.00001);
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
   
   // TODO: Test Date.toLocaleString() (pass wrapped object into method)
}
