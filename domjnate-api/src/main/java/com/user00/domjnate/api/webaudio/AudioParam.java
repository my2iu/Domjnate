package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioParam")
public interface AudioParam
{
@JsProperty(name="automationRate")
String getAutomationRate();
@JsProperty(name="automationRate")
void setAutomationRate(String val);
@JsProperty(name="defaultValue")
double getDefaultValue();
@JsProperty(name="maxValue")
double getMaxValue();
@JsProperty(name="minValue")
double getMinValue();
@JsProperty(name="value")
double getValue();
@JsProperty(name="value")
void setValue(double val);
@JsMethod(name="cancelAndHoldAtTime")
AudioParam cancelAndHoldAtTime(double cancelTime);
@JsMethod(name="cancelScheduledValues")
AudioParam cancelScheduledValues(double cancelTime);
@JsMethod(name="exponentialRampToValueAtTime")
AudioParam exponentialRampToValueAtTime(double value, double endTime);
@JsMethod(name="linearRampToValueAtTime")
AudioParam linearRampToValueAtTime(double value, double endTime);
@JsMethod(name="setTargetAtTime")
AudioParam setTargetAtTime(double target, double startTime, double timeConstant);
@JsMethod(name="setValueAtTime")
AudioParam setValueAtTime(double value, double startTime);
@JsMethod(name="setValueCurveAtTime")
AudioParam setValueCurveAtTime(com.user00.domjnate.api.Float32Array values, double startTime, double duration);
@JsMethod(name="setValueCurveAtTime")
AudioParam setValueCurveAtTime(com.user00.domjnate.api.Array<Double> values, double startTime, double duration);
@JsOverlay
public static AudioParam getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioParam", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioParam.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioParam val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioParam", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioParam _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioParam");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioParam.class);
}
}
