package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSKeyframesRule")
public interface CSSKeyframesRule extends CSSRule
{
@JsProperty(name="cssRules")
CSSRuleList getCssRules();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsMethod(name="appendRule")
void appendRule(String rule);
@JsMethod(name="deleteRule")
void deleteRule(String select);
@JsMethod(name="findRule")
CSSKeyframeRule findRule(String select);
@JsOverlay
public static CSSKeyframesRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSKeyframesRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSKeyframesRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSKeyframesRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSKeyframesRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSKeyframesRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSKeyframesRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSKeyframesRule.class);
}
}
