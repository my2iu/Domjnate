package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeyStatusMap")
public interface MediaKeyStatusMap
{
@JsProperty(name="size")
double getSize();
@JsMethod(name="forEach")
void forEach(com.user00.domjnate.api.Function callback);
@JsMethod(name="forEach")
void forEach(com.user00.domjnate.api.Function callback, java.lang.Object thisArg);
@JsMethod(name="get")
String get(com.user00.domjnate.api.ArrayBuffer keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.DataView keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Float64Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Float32Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Uint8ClampedArray keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Uint32Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Uint16Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Uint8Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Int32Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Int16Array keyId);
@JsMethod(name="get")
String get(com.user00.domjnate.api.Int8Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.ArrayBuffer keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.DataView keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Float64Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Float32Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Uint8ClampedArray keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Uint32Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Uint16Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Uint8Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Int32Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Int16Array keyId);
@JsMethod(name="has")
boolean has(com.user00.domjnate.api.Int8Array keyId);
@JsOverlay
public static MediaKeyStatusMap getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeyStatusMap", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaKeyStatusMap.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaKeyStatusMap val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeyStatusMap", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaKeyStatusMap _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaKeyStatusMap");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaKeyStatusMap.class);
}
}
