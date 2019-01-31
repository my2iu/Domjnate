package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCStatsReport")
public interface RTCStatsReport
{
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsFunction public static interface ForEachCallback0
{
void apply(java.lang.Object value, String key, RTCStatsReport parent);
}
@JsOverlay
public static RTCStatsReport getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCStatsReport", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCStatsReport.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCStatsReport val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCStatsReport", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCStatsReport _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCStatsReport");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCStatsReport.class);
}
}
