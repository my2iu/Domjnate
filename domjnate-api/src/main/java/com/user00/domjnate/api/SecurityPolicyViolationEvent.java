package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SecurityPolicyViolationEvent")
public interface SecurityPolicyViolationEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="blockedURI")
String getBlockedURI();
@JsProperty(name="columnNumber")
double getColumnNumber();
@JsProperty(name="documentURI")
String getDocumentURI();
@JsProperty(name="effectiveDirective")
String getEffectiveDirective();
@JsProperty(name="lineNumber")
double getLineNumber();
@JsProperty(name="originalPolicy")
String getOriginalPolicy();
@JsProperty(name="referrer")
String getReferrer();
@JsProperty(name="sourceFile")
String getSourceFile();
@JsProperty(name="statusCode")
double getStatusCode();
@JsProperty(name="violatedDirective")
String getViolatedDirective();
@JsOverlay
public static SecurityPolicyViolationEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SecurityPolicyViolationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SecurityPolicyViolationEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SecurityPolicyViolationEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SecurityPolicyViolationEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SecurityPolicyViolationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SecurityPolicyViolationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SecurityPolicyViolationEvent.class, type);
}
@JsOverlay
public static SecurityPolicyViolationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, SecurityPolicyViolationEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SecurityPolicyViolationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SecurityPolicyViolationEvent.class, type, eventInitDict);
}
}
