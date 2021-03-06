package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSConditionRule")
public interface CSSConditionRule extends CSSGroupingRule
{
@JsProperty(name="conditionText")
String getConditionText();
@JsProperty(name="conditionText")
void setConditionText(String val);
@JsOverlay
public static CSSConditionRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSConditionRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSConditionRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSConditionRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSConditionRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSConditionRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSConditionRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSConditionRule.class);
}
}
