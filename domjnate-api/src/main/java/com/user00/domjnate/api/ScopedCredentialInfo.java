package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScopedCredentialInfo")
public interface ScopedCredentialInfo
{
@JsProperty(name="credential")
ScopedCredential getCredential();
@JsProperty(name="publicKey")
com.user00.domjnate.api.webcrypto.CryptoKey getPublicKey();
@JsOverlay
public static ScopedCredentialInfo getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ScopedCredentialInfo", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ScopedCredentialInfo.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ScopedCredentialInfo val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ScopedCredentialInfo", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ScopedCredentialInfo _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ScopedCredentialInfo");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ScopedCredentialInfo.class);
}
}
