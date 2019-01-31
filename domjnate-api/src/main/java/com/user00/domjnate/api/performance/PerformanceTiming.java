package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceTiming")
public interface PerformanceTiming
{
@JsProperty(name="connectEnd")
double getConnectEnd();
@JsProperty(name="connectStart")
double getConnectStart();
@JsProperty(name="domComplete")
double getDomComplete();
@JsProperty(name="domContentLoadedEventEnd")
double getDomContentLoadedEventEnd();
@JsProperty(name="domContentLoadedEventStart")
double getDomContentLoadedEventStart();
@JsProperty(name="domInteractive")
double getDomInteractive();
@JsProperty(name="domLoading")
double getDomLoading();
@JsProperty(name="domainLookupEnd")
double getDomainLookupEnd();
@JsProperty(name="domainLookupStart")
double getDomainLookupStart();
@JsProperty(name="fetchStart")
double getFetchStart();
@JsProperty(name="loadEventEnd")
double getLoadEventEnd();
@JsProperty(name="loadEventStart")
double getLoadEventStart();
@JsProperty(name="navigationStart")
double getNavigationStart();
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
@JsProperty(name="unloadEventEnd")
double getUnloadEventEnd();
@JsProperty(name="unloadEventStart")
double getUnloadEventStart();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PerformanceTiming getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceTiming", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceTiming.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceTiming val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceTiming", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceTiming _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceTiming");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceTiming.class);
}
}
