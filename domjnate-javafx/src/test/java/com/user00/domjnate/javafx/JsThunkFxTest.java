package com.user00.domjnate.javafx;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Test;

import com.user00.domjnate.api.Window;
import com.user00.domjnate.api.XMLHttpRequest;
import com.user00.domjnate.util.JsThunkAccess;

import javafx.scene.web.WebEngine;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

public class JsThunkFxTest
{
   @Test
   public void testConstructorThunk()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         Window win = DomjnateFx.createJsBridgeGlobalsProxy(Window.class, jsWin);
         Object constructor = ((JsThunkAccess)win).__DomjnateGetJsThunk().getConstructor("XMLHttpRequest");
         XMLHttpRequest xmlhttp = ((JsThunkAccess)win).__DomjnateGetJsThunk().construct(constructor, XMLHttpRequest.class);
         Assert.assertEquals("", xmlhttp.getResponseText());
         Assert.assertEquals(0, xmlhttp.getStatus(), 0);
      });
   }
   
   // Test for the presence of Intl namespace
   @Test(expected=AssertionError.class)
   public void testIntl()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         Object obj = engine.executeScript("window.Intl");
         Assert.assertNotNull(obj);
         Assert.assertNotEquals("undefined", obj);
      });
   }
   
   public int callbackFn()
   {
      return 5;
   }
   
   public static class FnClass
   {
      public int fn() { return 7; }
   }
   
   // Just checking how JS can call into Java
   @Test
   public void testCallback()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         jsWin.setMember("fn", this);
         Assert.assertEquals(5, jsWin.eval("fn.callbackFn();"));
         
         jsWin.setMember("fnobj", new FnClass());
         Assert.assertEquals(7, jsWin.eval("fnobj.fn();"));
      });
   }
      
   // Just checking how JS can call into Java
   @Test(expected=JSException.class)
   public void testCallbackWithInnerClass()
   {
      Fx.runBlankWebPageInFx((WebEngine engine) -> {
         JSObject jsWin = (JSObject)engine.executeScript("window");
         jsWin.setMember("fnobj", new Supplier<Integer>() {
            @Override public Integer get()
            {
               return 9;
            }});
         Assert.assertEquals(9, jsWin.eval("fnobj.get();"));
      });
   }
}
