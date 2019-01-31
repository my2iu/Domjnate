package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCSsrcConflictEvent")
public interface RTCSsrcConflictEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="ssrc")
double getSsrc();
@JsOverlay
public static RTCSsrcConflictEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCSsrcConflictEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCSsrcConflictEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCSsrcConflictEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCSsrcConflictEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCSsrcConflictEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCSsrcConflictEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCSsrcConflictEvent.class);
}
}
