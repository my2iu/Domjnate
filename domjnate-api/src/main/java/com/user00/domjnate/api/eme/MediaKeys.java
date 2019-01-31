package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeys")
public interface MediaKeys
{
@JsMethod(name="createSession")
MediaKeySession createSession();
@JsMethod(name="createSession")
MediaKeySession createSession(String sessionType);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.ArrayBuffer serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.DataView serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Float64Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Float32Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Uint8ClampedArray serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Uint32Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Uint16Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Uint8Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Int32Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Int16Array serverCertificate);
@JsMethod(name="setServerCertificate")
com.user00.domjnate.api.Promise<Void> setServerCertificate(com.user00.domjnate.api.Int8Array serverCertificate);
@JsOverlay
public static MediaKeys getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeys", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaKeys.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaKeys val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeys", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaKeys _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaKeys");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaKeys.class);
}
}
