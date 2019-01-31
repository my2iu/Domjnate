package com.user00.domjnate.api.mse;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SourceBuffer")
public interface SourceBuffer extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="appendWindowEnd")
double getAppendWindowEnd();
@JsProperty(name="appendWindowEnd")
void setAppendWindowEnd(double val);
@JsProperty(name="appendWindowStart")
double getAppendWindowStart();
@JsProperty(name="appendWindowStart")
void setAppendWindowStart(double val);
@JsProperty(name="audioTracks")
com.user00.domjnate.api.webaudio.AudioTrackList getAudioTracks();
@JsProperty(name="buffered")
com.user00.domjnate.api.dom.TimeRanges getBuffered();
@JsProperty(name="mode")
String getMode();
@JsProperty(name="mode")
void setMode(String val);
@JsProperty(name="textTracks")
com.user00.domjnate.api.webvtt.TextTrackList getTextTracks();
@JsProperty(name="timestampOffset")
double getTimestampOffset();
@JsProperty(name="timestampOffset")
void setTimestampOffset(double val);
@JsProperty(name="updating")
boolean getUpdating();
@JsProperty(name="videoTracks")
com.user00.domjnate.api.VideoTrackList getVideoTracks();
@JsMethod(name="abort")
void abort();
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.DataView data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Float64Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Float32Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Int32Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Int16Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.Int8Array data);
@JsMethod(name="appendBuffer")
void appendBuffer(com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="appendStream")
void appendStream(com.user00.domjnate.api.MSStream stream);
@JsMethod(name="appendStream")
void appendStream(com.user00.domjnate.api.MSStream stream, double maxSize);
@JsMethod(name="remove")
void remove(double start, double end);
@JsOverlay
public static SourceBuffer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SourceBuffer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SourceBuffer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SourceBuffer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SourceBuffer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SourceBuffer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SourceBuffer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SourceBuffer.class);
}
}
