package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSRuleList")
public interface CSSRuleList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
CSSRule item(double index);
@JsOverlay
public default CSSRule get(double index) {
  return (CSSRule)com.user00.domjnate.util.Js.getIndex(this, index, CSSRule.class);
}
@JsOverlay
public default void set(double index, CSSRule val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static CSSRuleList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRuleList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSRuleList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSRuleList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRuleList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSRuleList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSRuleList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSRuleList.class);
}
}
