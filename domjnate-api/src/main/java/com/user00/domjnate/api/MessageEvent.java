package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MessageEvent")
public interface MessageEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="data")
java.lang.Object getData();
@JsProperty(name="lastEventId")
String getLastEventId();
@JsProperty(name="origin")
String getOrigin();
@JsProperty(name="ports")
ReadonlyArray<MessagePort> getPorts();
@JsProperty(name="source")
java.lang.Object getSource();
@JsOverlay
public static MessageEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MessageEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MessageEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MessageEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MessageEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MessageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MessageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MessageEvent.class, type);
}
@JsOverlay
public static MessageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, MessageEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MessageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MessageEvent.class, type, eventInitDict);
}
}
