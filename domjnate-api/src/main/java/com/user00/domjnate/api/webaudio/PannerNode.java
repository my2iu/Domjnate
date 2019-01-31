package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PannerNode")
public interface PannerNode extends AudioNode
{
@JsProperty(name="coneInnerAngle")
double getConeInnerAngle();
@JsProperty(name="coneInnerAngle")
void setConeInnerAngle(double val);
@JsProperty(name="coneOuterAngle")
double getConeOuterAngle();
@JsProperty(name="coneOuterAngle")
void setConeOuterAngle(double val);
@JsProperty(name="coneOuterGain")
double getConeOuterGain();
@JsProperty(name="coneOuterGain")
void setConeOuterGain(double val);
@JsProperty(name="distanceModel")
String getDistanceModel();
@JsProperty(name="distanceModel")
void setDistanceModel(String val);
@JsProperty(name="maxDistance")
double getMaxDistance();
@JsProperty(name="maxDistance")
void setMaxDistance(double val);
@JsProperty(name="orientationX")
AudioParam getOrientationX();
@JsProperty(name="orientationY")
AudioParam getOrientationY();
@JsProperty(name="orientationZ")
AudioParam getOrientationZ();
@JsProperty(name="panningModel")
String getPanningModel();
@JsProperty(name="panningModel")
void setPanningModel(String val);
@JsProperty(name="positionX")
AudioParam getPositionX();
@JsProperty(name="positionY")
AudioParam getPositionY();
@JsProperty(name="positionZ")
AudioParam getPositionZ();
@JsProperty(name="refDistance")
double getRefDistance();
@JsProperty(name="refDistance")
void setRefDistance(double val);
@JsProperty(name="rolloffFactor")
double getRolloffFactor();
@JsProperty(name="rolloffFactor")
void setRolloffFactor(double val);
@JsMethod(name="setOrientation")
void setOrientation(double x, double y, double z);
@JsMethod(name="setPosition")
void setPosition(double x, double y, double z);
@JsOverlay
public static PannerNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PannerNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PannerNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PannerNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PannerNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PannerNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PannerNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PannerNode.class, context);
}
@JsOverlay
public static PannerNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, PannerOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PannerNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PannerNode.class, context, options);
}
}
