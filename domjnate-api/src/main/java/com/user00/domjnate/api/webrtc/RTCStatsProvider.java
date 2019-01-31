package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCStatsProvider")
public interface RTCStatsProvider extends com.user00.domjnate.api.dom.EventTarget
{
@JsMethod(name="getStats")
com.user00.domjnate.api.Promise<RTCStatsReport> getStats();
@JsMethod(name="msGetStats")
com.user00.domjnate.api.Promise<RTCStatsReport> msGetStats();
@JsOverlay
public static RTCStatsProvider getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCStatsProvider", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCStatsProvider.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCStatsProvider val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCStatsProvider", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCStatsProvider _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCStatsProvider");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCStatsProvider.class);
}
}
