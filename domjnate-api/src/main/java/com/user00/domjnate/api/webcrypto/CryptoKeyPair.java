package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CryptoKeyPair")
public interface CryptoKeyPair
{
@JsProperty(name="privateKey")
CryptoKey getPrivateKey();
@JsProperty(name="privateKey")
void setPrivateKey(CryptoKey val);
@JsProperty(name="publicKey")
CryptoKey getPublicKey();
@JsProperty(name="publicKey")
void setPublicKey(CryptoKey val);
@JsOverlay
public static CryptoKeyPair getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CryptoKeyPair", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CryptoKeyPair.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CryptoKeyPair val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CryptoKeyPair", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CryptoKeyPair _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CryptoKeyPair");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CryptoKeyPair.class);
}
}
