package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebAuthnAssertion")
public interface WebAuthnAssertion
{
@JsProperty(name="authenticatorData")
ArrayBuffer getAuthenticatorData();
@JsProperty(name="clientData")
ArrayBuffer getClientData();
@JsProperty(name="credential")
ScopedCredential getCredential();
@JsProperty(name="signature")
ArrayBuffer getSignature();
@JsOverlay
public static WebAuthnAssertion getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebAuthnAssertion", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebAuthnAssertion.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebAuthnAssertion val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebAuthnAssertion", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebAuthnAssertion _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebAuthnAssertion");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebAuthnAssertion.class);
}
}
