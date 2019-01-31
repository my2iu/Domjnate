package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSMediaKeys")
public interface MSMediaKeys
{
@JsProperty(name="keySystem")
String getKeySystem();
@JsMethod(name="createSession")
MSMediaKeySession createSession(String type, Uint8Array initData);
@JsMethod(name="createSession")
MSMediaKeySession createSession(String type, Uint8Array initData, Uint8Array cdmData);
@JsOverlay
public static MSMediaKeys getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeys", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSMediaKeys.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSMediaKeys val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeys", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static boolean isTypeSupported(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String keySystem) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "MSMediaKeys", "isTypeSupported", boolean.class, keySystem);
}
@JsOverlay
public static boolean isTypeSupported(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String keySystem, String type) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "MSMediaKeys", "isTypeSupported", boolean.class, keySystem, type);
}
@JsOverlay
public static String isTypeSupportedWithFeatures(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String keySystem) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "MSMediaKeys", "isTypeSupportedWithFeatures", String.class, keySystem);
}
@JsOverlay
public static String isTypeSupportedWithFeatures(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String keySystem, String type) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "MSMediaKeys", "isTypeSupportedWithFeatures", String.class, keySystem, type);
}
@JsOverlay
public static MSMediaKeys _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String keySystem) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSMediaKeys");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSMediaKeys.class, keySystem);
}
}
