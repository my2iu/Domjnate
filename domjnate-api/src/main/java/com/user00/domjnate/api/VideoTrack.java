package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VideoTrack")
public interface VideoTrack
{
@JsProperty(name="id")
String getId();
@JsProperty(name="kind")
String getKind();
@JsProperty(name="kind")
void setKind(String val);
@JsProperty(name="label")
String getLabel();
@JsProperty(name="language")
String getLanguage();
@JsProperty(name="language")
void setLanguage(String val);
@JsProperty(name="selected")
boolean getSelected();
@JsProperty(name="selected")
void setSelected(boolean val);
@JsProperty(name="sourceBuffer")
com.user00.domjnate.api.mse.SourceBuffer getSourceBuffer();
@JsOverlay
public static VideoTrack getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VideoTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VideoTrack.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VideoTrack val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VideoTrack", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VideoTrack _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VideoTrack");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VideoTrack.class);
}
}
