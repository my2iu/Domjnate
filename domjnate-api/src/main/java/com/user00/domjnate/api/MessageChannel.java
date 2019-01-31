package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MessageChannel")
public interface MessageChannel
{
@JsProperty(name="port1")
MessagePort getPort1();
@JsProperty(name="port2")
MessagePort getPort2();
@JsOverlay
public static MessageChannel getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MessageChannel", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MessageChannel.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MessageChannel val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MessageChannel", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MessageChannel _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MessageChannel");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MessageChannel.class);
}
}
