package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSFIDOSignatureAssertion")
public interface MSFIDOSignatureAssertion extends MSAssertion
{
@JsProperty(name="signature")
MSFIDOSignature getSignature();
@JsOverlay
public static MSFIDOSignatureAssertion getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSFIDOSignatureAssertion", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSFIDOSignatureAssertion.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSFIDOSignatureAssertion val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSFIDOSignatureAssertion", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSFIDOSignatureAssertion _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSFIDOSignatureAssertion");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSFIDOSignatureAssertion.class);
}
}
