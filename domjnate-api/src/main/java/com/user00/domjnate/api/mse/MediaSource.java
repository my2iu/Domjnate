package com.user00.domjnate.api.mse;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaSource")
public interface MediaSource extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="activeSourceBuffers")
SourceBufferList getActiveSourceBuffers();
@JsProperty(name="duration")
double getDuration();
@JsProperty(name="duration")
void setDuration(double val);
@JsProperty(name="readyState")
String getReadyState();
@JsProperty(name="sourceBuffers")
SourceBufferList getSourceBuffers();
@JsMethod(name="addSourceBuffer")
SourceBuffer addSourceBuffer(String type);
@JsMethod(name="endOfStream")
void endOfStream();
@JsMethod(name="endOfStream")
void endOfStream(String error);
@JsMethod(name="removeSourceBuffer")
void removeSourceBuffer(SourceBuffer sourceBuffer);
@JsOverlay
public static MediaSource getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaSource", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaSource.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaSource val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaSource", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static boolean isTypeSupported(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "MediaSource", "isTypeSupported", boolean.class, type);
}
@JsOverlay
public static MediaSource _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaSource");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaSource.class);
}
}
