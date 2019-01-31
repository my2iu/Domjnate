package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentTimeline")
public interface DocumentTimeline extends AnimationTimeline
{
@JsOverlay
public static DocumentTimeline getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DocumentTimeline", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DocumentTimeline.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DocumentTimeline val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DocumentTimeline", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DocumentTimeline _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DocumentTimeline");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DocumentTimeline.class);
}
@JsOverlay
public static DocumentTimeline _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DocumentTimelineOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DocumentTimeline");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DocumentTimeline.class, options);
}
}
