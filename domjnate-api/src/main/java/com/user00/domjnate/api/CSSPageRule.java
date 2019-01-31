package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSPageRule")
public interface CSSPageRule extends CSSRule
{
@JsProperty(name="pseudoClass")
String getPseudoClass();
@JsProperty(name="selector")
String getSelector();
@JsProperty(name="selectorText")
String getSelectorText();
@JsProperty(name="selectorText")
void setSelectorText(String val);
@JsProperty(name="style")
CSSStyleDeclaration getStyle();
@JsOverlay
public static CSSPageRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSPageRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSPageRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSPageRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSPageRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSPageRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSPageRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSPageRule.class);
}
}
