package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceTransport")
public interface RTCIceTransport extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="component")
String getComponent();
@JsProperty(name="gatheringState")
String getGatheringState();
@JsProperty(name="ongatheringstatechange")
OngatheringstatechangeCallback getOngatheringstatechange();
@JsProperty(name="ongatheringstatechange")
void setOngatheringstatechange(OngatheringstatechangeCallback val);
@JsProperty(name="onselectedcandidatepairchange")
OnselectedcandidatepairchangeCallback getOnselectedcandidatepairchange();
@JsProperty(name="onselectedcandidatepairchange")
void setOnselectedcandidatepairchange(OnselectedcandidatepairchangeCallback val);
@JsProperty(name="onstatechange")
OnstatechangeCallback getOnstatechange();
@JsProperty(name="onstatechange")
void setOnstatechange(OnstatechangeCallback val);
@JsProperty(name="role")
String getRole();
@JsProperty(name="state")
String getState();
@JsMethod(name="getLocalCandidates")
com.user00.domjnate.api.Array<RTCIceCandidate> getLocalCandidates();
@JsMethod(name="getLocalParameters")
RTCIceParameters getLocalParameters();
@JsMethod(name="getRemoteCandidates")
com.user00.domjnate.api.Array<RTCIceCandidate> getRemoteCandidates();
@JsMethod(name="getRemoteParameters")
RTCIceParameters getRemoteParameters();
@JsMethod(name="getSelectedCandidatePair")
RTCIceCandidatePair getSelectedCandidatePair();
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
@JsFunction public static interface OngatheringstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnselectedcandidatepairchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static RTCIceTransport getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceTransport", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCIceTransport.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceTransport val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceTransport", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCIceTransport _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIceTransport");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIceTransport.class);
}
}
