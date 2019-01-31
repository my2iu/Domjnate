package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerfWidgetExternal")
public interface PerfWidgetExternal
{
@JsProperty(name="activeNetworkRequestCount")
double getActiveNetworkRequestCount();
@JsProperty(name="averageFrameTime")
double getAverageFrameTime();
@JsProperty(name="averagePaintTime")
double getAveragePaintTime();
@JsProperty(name="extraInformationEnabled")
boolean getExtraInformationEnabled();
@JsProperty(name="independentRenderingEnabled")
boolean getIndependentRenderingEnabled();
@JsProperty(name="irDisablingContentString")
String getIrDisablingContentString();
@JsProperty(name="irStatusAvailable")
boolean getIrStatusAvailable();
@JsProperty(name="maxCpuSpeed")
double getMaxCpuSpeed();
@JsProperty(name="paintRequestsPerSecond")
double getPaintRequestsPerSecond();
@JsProperty(name="performanceCounter")
double getPerformanceCounter();
@JsProperty(name="performanceCounterFrequency")
double getPerformanceCounterFrequency();
@JsMethod(name="addEventListener")
void addEventListener(String eventType, Function callback);
@JsMethod(name="getMemoryUsage")
double getMemoryUsage();
@JsMethod(name="getProcessCpuUsage")
double getProcessCpuUsage();
@JsMethod(name="getRecentCpuUsage")
java.lang.Object getRecentCpuUsage(Double last);
@JsMethod(name="getRecentFrames")
java.lang.Object getRecentFrames(Double last);
@JsMethod(name="getRecentMemoryUsage")
java.lang.Object getRecentMemoryUsage(Double last);
@JsMethod(name="getRecentPaintRequests")
java.lang.Object getRecentPaintRequests(Double last);
@JsMethod(name="removeEventListener")
void removeEventListener(String eventType, Function callback);
@JsMethod(name="repositionWindow")
void repositionWindow(double x, double y);
@JsMethod(name="resizeWindow")
void resizeWindow(double width, double height);
@JsOverlay
public static PerfWidgetExternal getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerfWidgetExternal", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerfWidgetExternal.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerfWidgetExternal val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerfWidgetExternal", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerfWidgetExternal _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerfWidgetExternal");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerfWidgetExternal.class);
}
}
