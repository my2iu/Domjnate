package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSSupportsRule")
public interface CSSSupportsRule extends CSSConditionRule
{
@JsOverlay
public static CSSSupportsRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSSupportsRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSSupportsRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSSupportsRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSSupportsRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSSupportsRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSSupportsRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSSupportsRule.class);
}
}
