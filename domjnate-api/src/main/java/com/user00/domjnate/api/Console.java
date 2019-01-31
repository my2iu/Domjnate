package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Console")
public interface Console
{
@JsProperty(name="memory")
java.lang.Object getMemory();
@JsProperty(name="memory")
void setMemory(java.lang.Object val);
@JsMethod(name="assert")
void _assert(java.lang.Object... data);
@JsMethod(name="assert")
void _assert(boolean condition, java.lang.Object... data);
@JsMethod(name="assert")
void _assert(boolean condition, String message, java.lang.Object... data);
@JsMethod(name="clear")
void clear();
@JsMethod(name="count")
void count();
@JsMethod(name="count")
void count(String label);
@JsMethod(name="debug")
void debug(java.lang.Object... optionalParams);
@JsMethod(name="debug")
void debug(java.lang.Object message, java.lang.Object... optionalParams);
@JsMethod(name="dir")
void dir(java.lang.Object... optionalParams);
@JsMethod(name="dir")
void dir(java.lang.Object value, java.lang.Object... optionalParams);
@JsMethod(name="dirxml")
void dirxml(java.lang.Object value);
@JsMethod(name="error")
void error(java.lang.Object... optionalParams);
@JsMethod(name="error")
void error(java.lang.Object message, java.lang.Object... optionalParams);
@JsMethod(name="exception")
void exception(java.lang.Object... optionalParams);
@JsMethod(name="exception")
void exception(String message, java.lang.Object... optionalParams);
@JsMethod(name="group")
void group(java.lang.Object... optionalParams);
@JsMethod(name="group")
void group(String groupTitle, java.lang.Object... optionalParams);
@JsMethod(name="groupCollapsed")
void groupCollapsed(java.lang.Object... optionalParams);
@JsMethod(name="groupCollapsed")
void groupCollapsed(String groupTitle, java.lang.Object... optionalParams);
@JsMethod(name="groupEnd")
void groupEnd();
@JsMethod(name="info")
void info(java.lang.Object... optionalParams);
@JsMethod(name="info")
void info(java.lang.Object message, java.lang.Object... optionalParams);
@JsMethod(name="log")
void log(java.lang.Object... optionalParams);
@JsMethod(name="log")
void log(java.lang.Object message, java.lang.Object... optionalParams);
@JsMethod(name="markTimeline")
void markTimeline();
@JsMethod(name="markTimeline")
void markTimeline(String label);
@JsMethod(name="profile")
void profile();
@JsMethod(name="profile")
void profile(String reportName);
@JsMethod(name="profileEnd")
void profileEnd();
@JsMethod(name="profileEnd")
void profileEnd(String reportName);
@JsMethod(name="table")
void table(java.lang.Object... tabularData);
@JsMethod(name="time")
void time();
@JsMethod(name="time")
void time(String label);
@JsMethod(name="timeEnd")
void timeEnd();
@JsMethod(name="timeEnd")
void timeEnd(String label);
@JsMethod(name="timeStamp")
void timeStamp();
@JsMethod(name="timeStamp")
void timeStamp(String label);
@JsMethod(name="timeline")
void timeline();
@JsMethod(name="timeline")
void timeline(String label);
@JsMethod(name="timelineEnd")
void timelineEnd();
@JsMethod(name="timelineEnd")
void timelineEnd(String label);
@JsMethod(name="trace")
void trace(java.lang.Object... optionalParams);
@JsMethod(name="trace")
void trace(java.lang.Object message, java.lang.Object... optionalParams);
@JsMethod(name="warn")
void warn(java.lang.Object... optionalParams);
@JsMethod(name="warn")
void warn(java.lang.Object message, java.lang.Object... optionalParams);
@JsOverlay
public static Console getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Console", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Console.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Console val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Console", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Console _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Console");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Console.class);
}
}
