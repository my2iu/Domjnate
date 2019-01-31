package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceResourceTiming")
public interface PerformanceResourceTiming extends PerformanceEntry
{
@JsProperty(name="connectEnd")
double getConnectEnd();
@JsProperty(name="connectStart")
double getConnectStart();
@JsProperty(name="decodedBodySize")
double getDecodedBodySize();
@JsProperty(name="domainLookupEnd")
double getDomainLookupEnd();
@JsProperty(name="domainLookupStart")
double getDomainLookupStart();
@JsProperty(name="encodedBodySize")
double getEncodedBodySize();
@JsProperty(name="fetchStart")
double getFetchStart();
@JsProperty(name="initiatorType")
String getInitiatorType();
@JsProperty(name="nextHopProtocol")
String getNextHopProtocol();
@JsProperty(name="redirectEnd")
double getRedirectEnd();
@JsProperty(name="redirectStart")
double getRedirectStart();
@JsProperty(name="requestStart")
double getRequestStart();
@JsProperty(name="responseEnd")
double getResponseEnd();
@JsProperty(name="responseStart")
double getResponseStart();
@JsProperty(name="secureConnectionStart")
double getSecureConnectionStart();
@JsProperty(name="transferSize")
double getTransferSize();
@JsProperty(name="workerStart")
double getWorkerStart();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PerformanceResourceTiming getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceResourceTiming", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceResourceTiming.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceResourceTiming val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceResourceTiming", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceResourceTiming _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceResourceTiming");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceResourceTiming.class);
}
}
