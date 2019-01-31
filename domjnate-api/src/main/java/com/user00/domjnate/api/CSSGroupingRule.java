package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSGroupingRule")
public interface CSSGroupingRule extends CSSRule
{
@JsProperty(name="cssRules")
CSSRuleList getCssRules();
@JsMethod(name="deleteRule")
void deleteRule(double index);
@JsMethod(name="insertRule")
double insertRule(String rule, double index);
@JsOverlay
public static CSSGroupingRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSGroupingRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSGroupingRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSGroupingRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSGroupingRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSGroupingRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSGroupingRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSGroupingRule.class);
}
}
