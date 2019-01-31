package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIdentityAssertion")
public interface RTCIdentityAssertion
{
@JsProperty(name="idp")
String getIdp();
@JsProperty(name="idp")
void setIdp(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsOverlay
public static RTCIdentityAssertion getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIdentityAssertion", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCIdentityAssertion.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIdentityAssertion val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIdentityAssertion", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCIdentityAssertion _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String idp, String name) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIdentityAssertion");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIdentityAssertion.class, idp, name);
}
}
