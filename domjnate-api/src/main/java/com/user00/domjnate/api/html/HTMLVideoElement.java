package com.user00.domjnate.api.html;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLVideoElement")
public interface HTMLVideoElement extends HTMLMediaElement
{
@JsProperty(name="height")
double getHeight();
@JsProperty(name="height")
void setHeight(double val);
@JsProperty(name="msHorizontalMirror")
boolean getMsHorizontalMirror();
@JsProperty(name="msHorizontalMirror")
void setMsHorizontalMirror(boolean val);
@JsProperty(name="msIsLayoutOptimalForPlayback")
boolean getMsIsLayoutOptimalForPlayback();
@JsProperty(name="msIsStereo3D")
boolean getMsIsStereo3D();
@JsProperty(name="msStereo3DPackingMode")
String getMsStereo3DPackingMode();
@JsProperty(name="msStereo3DPackingMode")
void setMsStereo3DPackingMode(String val);
@JsProperty(name="msStereo3DRenderMode")
String getMsStereo3DRenderMode();
@JsProperty(name="msStereo3DRenderMode")
void setMsStereo3DRenderMode(String val);
@JsProperty(name="msZoom")
boolean getMsZoom();
@JsProperty(name="msZoom")
void setMsZoom(boolean val);
@JsProperty(name="onMSVideoFormatChanged")
OnMSVideoFormatChangedCallback getOnMSVideoFormatChanged();
@JsProperty(name="onMSVideoFormatChanged")
void setOnMSVideoFormatChanged(OnMSVideoFormatChangedCallback val);
@JsProperty(name="onMSVideoFrameStepCompleted")
OnMSVideoFrameStepCompletedCallback getOnMSVideoFrameStepCompleted();
@JsProperty(name="onMSVideoFrameStepCompleted")
void setOnMSVideoFrameStepCompleted(OnMSVideoFrameStepCompletedCallback val);
@JsProperty(name="onMSVideoOptimalLayoutChanged")
OnMSVideoOptimalLayoutChangedCallback getOnMSVideoOptimalLayoutChanged();
@JsProperty(name="onMSVideoOptimalLayoutChanged")
void setOnMSVideoOptimalLayoutChanged(OnMSVideoOptimalLayoutChangedCallback val);
@JsProperty(name="poster")
String getPoster();
@JsProperty(name="poster")
void setPoster(String val);
@JsProperty(name="videoHeight")
double getVideoHeight();
@JsProperty(name="videoWidth")
double getVideoWidth();
@JsProperty(name="webkitDisplayingFullscreen")
boolean getWebkitDisplayingFullscreen();
@JsProperty(name="webkitSupportsFullscreen")
boolean getWebkitSupportsFullscreen();
@JsProperty(name="width")
double getWidth();
@JsProperty(name="width")
void setWidth(double val);
@JsMethod(name="getVideoPlaybackQuality")
com.user00.domjnate.api.mse.VideoPlaybackQuality getVideoPlaybackQuality();
@JsMethod(name="msFrameStep")
void msFrameStep(boolean forward);
@JsMethod(name="msInsertVideoEffect")
void msInsertVideoEffect(String activatableClassId, boolean effectRequired);
@JsMethod(name="msInsertVideoEffect")
void msInsertVideoEffect(String activatableClassId, boolean effectRequired, java.lang.Object config);
@JsMethod(name="msSetVideoRectangle")
void msSetVideoRectangle(double left, double top, double right, double bottom);
@JsMethod(name="webkitEnterFullScreen")
void webkitEnterFullScreen();
@JsMethod(name="webkitEnterFullscreen")
void webkitEnterFullscreen();
@JsMethod(name="webkitExitFullScreen")
void webkitExitFullScreen();
@JsMethod(name="webkitExitFullscreen")
void webkitExitFullscreen();
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OnMSVideoFrameStepCompletedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnMSVideoOptimalLayoutChangedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnMSVideoFormatChangedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static HTMLVideoElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLVideoElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLVideoElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLVideoElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLVideoElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLVideoElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLVideoElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLVideoElement.class);
}
}
