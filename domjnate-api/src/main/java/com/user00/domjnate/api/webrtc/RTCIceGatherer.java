package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceGatherer")
public interface RTCIceGatherer extends RTCStatsProvider
{
@JsProperty(name="component")
String getComponent();
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onlocalcandidate")
OnlocalcandidateCallback getOnlocalcandidate();
@JsProperty(name="onlocalcandidate")
void setOnlocalcandidate(OnlocalcandidateCallback val);
@JsMethod(name="createAssociatedGatherer")
RTCIceGatherer createAssociatedGatherer();
@JsMethod(name="getLocalCandidates")
com.user00.domjnate.api.Array<RTCIceCandidateDictionary> getLocalCandidates();
@JsMethod(name="getLocalParameters")
RTCIceParameters getLocalParameters();
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
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnlocalcandidateCallback
{
java.lang.Object apply(RTCIceGathererEvent ev);
}
@JsOverlay
public static RTCIceGatherer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceGatherer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCIceGatherer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceGatherer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceGatherer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCIceGatherer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceGatherOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIceGatherer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIceGatherer.class, options);
}
}
