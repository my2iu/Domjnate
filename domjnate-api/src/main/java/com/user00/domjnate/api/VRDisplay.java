package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRDisplay")
public interface VRDisplay extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="capabilities")
VRDisplayCapabilities getCapabilities();
@JsProperty(name="depthFar")
double getDepthFar();
@JsProperty(name="depthFar")
void setDepthFar(double val);
@JsProperty(name="depthNear")
double getDepthNear();
@JsProperty(name="depthNear")
void setDepthNear(double val);
@JsProperty(name="displayId")
double getDisplayId();
@JsProperty(name="displayName")
String getDisplayName();
@JsProperty(name="isConnected")
boolean getIsConnected();
@JsProperty(name="isPresenting")
boolean getIsPresenting();
@JsProperty(name="stageParameters")
VRStageParameters getStageParameters();
@JsMethod(name="cancelAnimationFrame")
void cancelAnimationFrame(double handle);
@JsMethod(name="exitPresent")
Promise<Void> exitPresent();
@JsMethod(name="getEyeParameters")
VREyeParameters getEyeParameters(String whichEye);
@JsMethod(name="getFrameData")
boolean getFrameData(VRFrameData frameData);
@JsMethod(name="getLayers")
Array<VRLayer> getLayers();
@JsMethod(name="getPose")
VRPose getPose();
@JsMethod(name="requestAnimationFrame")
double requestAnimationFrame(FrameRequestCallback callback);
@JsMethod(name="requestPresent")
Promise<Void> requestPresent(Array<VRLayer> layers);
@JsMethod(name="resetPose")
void resetPose();
@JsMethod(name="submitFrame")
void submitFrame();
@JsMethod(name="submitFrame")
void submitFrame(VRPose pose);
@JsOverlay
public static VRDisplay getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRDisplay", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VRDisplay.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VRDisplay val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRDisplay", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VRDisplay _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VRDisplay");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VRDisplay.class);
}
}
