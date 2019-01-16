package com.user00.domjnate.javafx;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.junit.Assert;
import org.junit.Test;

import com.user00.domjnate.api.Window;
import com.user00.domjnate.api.XMLHttpRequest;
import com.user00.domjnate.util.JsThunkAccess;

import javafx.scene.web.WebEngine;
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
}
