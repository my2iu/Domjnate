package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSFontFaceRule")
public interface CSSFontFaceRule extends CSSRule
{
@JsProperty(name="style")
CSSStyleDeclaration getStyle();
@JsOverlay
public static CSSFontFaceRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSFontFaceRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSFontFaceRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSFontFaceRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSFontFaceRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSFontFaceRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSFontFaceRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSFontFaceRule.class);
}
}
