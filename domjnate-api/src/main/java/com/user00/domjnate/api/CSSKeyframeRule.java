package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSKeyframeRule")
public interface CSSKeyframeRule extends CSSRule
{
@JsProperty(name="keyText")
String getKeyText();
@JsProperty(name="keyText")
void setKeyText(String val);
@JsProperty(name="style")
CSSStyleDeclaration getStyle();
@JsOverlay
public static CSSKeyframeRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSKeyframeRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSKeyframeRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSKeyframeRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSKeyframeRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSKeyframeRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSKeyframeRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSKeyframeRule.class);
}
}
