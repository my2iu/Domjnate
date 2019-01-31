package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSFIDOCredentialAssertion")
public interface MSFIDOCredentialAssertion extends MSAssertion
{
@JsProperty(name="algorithm")
java.lang.Object getAlgorithm();
@JsProperty(name="attestation")
java.lang.Object getAttestation();
@JsProperty(name="publicKey")
String getPublicKey();
@JsProperty(name="transportHints")
Array<String> getTransportHints();
@JsOverlay
public static MSFIDOCredentialAssertion getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSFIDOCredentialAssertion", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSFIDOCredentialAssertion.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSFIDOCredentialAssertion val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSFIDOCredentialAssertion", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSFIDOCredentialAssertion _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSFIDOCredentialAssertion");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSFIDOCredentialAssertion.class);
}
}
