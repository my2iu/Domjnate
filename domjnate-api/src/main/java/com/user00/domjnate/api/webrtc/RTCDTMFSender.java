package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDTMFSender")
public interface RTCDTMFSender extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="canInsertDTMF")
boolean getCanInsertDTMF();
@JsProperty(name="ontonechange")
OntonechangeCallback getOntonechange();
@JsProperty(name="ontonechange")
void setOntonechange(OntonechangeCallback val);
@JsProperty(name="toneBuffer")
String getToneBuffer();
@JsMethod(name="insertDTMF")
void insertDTMF(String tones);
@JsMethod(name="insertDTMF")
void insertDTMF(String tones, double duration);
@JsMethod(name="insertDTMF")
void insertDTMF(String tones, double duration, double interToneGap);
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
@JsFunction public static interface OntonechangeCallback
{
java.lang.Object apply(RTCDTMFToneChangeEvent ev);
}
@JsOverlay
public static RTCDTMFSender getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDTMFSender", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCDTMFSender.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCDTMFSender val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDTMFSender", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCDTMFSender _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCDTMFSender");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCDTMFSender.class);
}
}
