package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSFIDOSignature")
public interface MSFIDOSignature
{
@JsProperty(name="authnrData")
String getAuthnrData();
@JsProperty(name="clientData")
String getClientData();
@JsProperty(name="signature")
String getSignature();
@JsOverlay
public static MSFIDOSignature getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSFIDOSignature", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSFIDOSignature.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSFIDOSignature val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSFIDOSignature", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSFIDOSignature _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSFIDOSignature");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSFIDOSignature.class);
}
}
