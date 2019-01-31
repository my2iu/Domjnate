package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CryptoKey")
public interface CryptoKey
{
@JsProperty(name="algorithm")
KeyAlgorithm getAlgorithm();
@JsProperty(name="extractable")
boolean getExtractable();
@JsProperty(name="type")
String getType();
@JsProperty(name="usages")
com.user00.domjnate.api.Array<String> getUsages();
@JsOverlay
public static CryptoKey getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CryptoKey", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CryptoKey.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CryptoKey val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CryptoKey", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CryptoKey _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CryptoKey");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CryptoKey.class);
}
}
