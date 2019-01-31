package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSMediaKeySession")
public interface MSMediaKeySession extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="error")
MSMediaKeyError getError();
@JsProperty(name="keySystem")
String getKeySystem();
@JsProperty(name="sessionId")
String getSessionId();
@JsMethod(name="close")
void close();
@JsMethod(name="update")
void update(Uint8Array key);
@JsOverlay
public static MSMediaKeySession getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeySession", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSMediaKeySession.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSMediaKeySession val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeySession", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSMediaKeySession _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSMediaKeySession");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSMediaKeySession.class);
}
}
