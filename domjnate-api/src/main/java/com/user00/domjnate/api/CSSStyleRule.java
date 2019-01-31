package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSStyleRule")
public interface CSSStyleRule extends CSSRule
{
@JsProperty(name="selectorText")
String getSelectorText();
@JsProperty(name="selectorText")
void setSelectorText(String val);
@JsProperty(name="style")
CSSStyleDeclaration getStyle();
@JsOverlay
public static CSSStyleRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSStyleRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSStyleRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSStyleRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSStyleRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSStyleRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSStyleRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSStyleRule.class);
}
}
