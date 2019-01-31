package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeySystemAccess")
public interface MediaKeySystemAccess
{
@JsProperty(name="keySystem")
String getKeySystem();
@JsMethod(name="createMediaKeys")
com.user00.domjnate.api.Promise<MediaKeys> createMediaKeys();
@JsMethod(name="getConfiguration")
MediaKeySystemConfiguration getConfiguration();
@JsOverlay
public static MediaKeySystemAccess getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeySystemAccess", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaKeySystemAccess.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaKeySystemAccess val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeySystemAccess", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaKeySystemAccess _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaKeySystemAccess");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaKeySystemAccess.class);
}
}
