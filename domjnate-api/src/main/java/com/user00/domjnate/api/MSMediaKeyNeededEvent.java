package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSMediaKeyNeededEvent")
public interface MSMediaKeyNeededEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="initData")
Uint8Array getInitData();
@JsOverlay
public static MSMediaKeyNeededEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyNeededEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSMediaKeyNeededEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSMediaKeyNeededEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyNeededEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSMediaKeyNeededEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSMediaKeyNeededEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSMediaKeyNeededEvent.class);
}
}
