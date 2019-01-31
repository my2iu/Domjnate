package com.user00.domjnate.api.mse;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VideoPlaybackQuality")
public interface VideoPlaybackQuality
{
@JsProperty(name="corruptedVideoFrames")
double getCorruptedVideoFrames();
@JsProperty(name="creationTime")
double getCreationTime();
@JsProperty(name="droppedVideoFrames")
double getDroppedVideoFrames();
@JsProperty(name="totalFrameDelay")
double getTotalFrameDelay();
@JsProperty(name="totalVideoFrames")
double getTotalVideoFrames();
@JsOverlay
public static VideoPlaybackQuality getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VideoPlaybackQuality", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VideoPlaybackQuality.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VideoPlaybackQuality val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VideoPlaybackQuality", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VideoPlaybackQuality _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VideoPlaybackQuality");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VideoPlaybackQuality.class);
}
}
