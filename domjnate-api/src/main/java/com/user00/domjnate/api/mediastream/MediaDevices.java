package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaDevices")
public interface MediaDevices extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="ondevicechange")
OndevicechangeCallback getOndevicechange();
@JsProperty(name="ondevicechange")
void setOndevicechange(OndevicechangeCallback val);
@JsMethod(name="enumerateDevices")
com.user00.domjnate.api.Promise<com.user00.domjnate.api.Array<MediaDeviceInfo>> enumerateDevices();
@JsMethod(name="getSupportedConstraints")
MediaTrackSupportedConstraints getSupportedConstraints();
@JsMethod(name="getUserMedia")
com.user00.domjnate.api.Promise<MediaStream> getUserMedia(MediaStreamConstraints constraints);
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
@JsFunction public static interface OndevicechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static MediaDevices getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaDevices", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaDevices.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaDevices val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaDevices", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaDevices _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaDevices");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaDevices.class);
}
}
