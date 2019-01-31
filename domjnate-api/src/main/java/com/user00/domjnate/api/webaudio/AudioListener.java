package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioListener")
public interface AudioListener
{
@JsProperty(name="forwardX")
AudioParam getForwardX();
@JsProperty(name="forwardY")
AudioParam getForwardY();
@JsProperty(name="forwardZ")
AudioParam getForwardZ();
@JsProperty(name="positionX")
AudioParam getPositionX();
@JsProperty(name="positionY")
AudioParam getPositionY();
@JsProperty(name="positionZ")
AudioParam getPositionZ();
@JsProperty(name="upX")
AudioParam getUpX();
@JsProperty(name="upY")
AudioParam getUpY();
@JsProperty(name="upZ")
AudioParam getUpZ();
@JsMethod(name="setOrientation")
void setOrientation(double x, double y, double z, double xUp, double yUp, double zUp);
@JsMethod(name="setPosition")
void setPosition(double x, double y, double z);
@JsOverlay
public static AudioListener getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioListener", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioListener.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioListener val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioListener", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioListener _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioListener");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioListener.class);
}
}
