package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLMeterElement")
public interface HTMLMeterElement extends HTMLElement
{
@JsProperty(name="high")
double getHigh();
@JsProperty(name="high")
void setHigh(double val);
@JsProperty(name="labels")
com.user00.domjnate.api.dom.NodeListOf<HTMLLabelElement> getLabels();
@JsProperty(name="low")
double getLow();
@JsProperty(name="low")
void setLow(double val);
@JsProperty(name="max")
double getMax();
@JsProperty(name="max")
void setMax(double val);
@JsProperty(name="min")
double getMin();
@JsProperty(name="min")
void setMin(double val);
@JsProperty(name="optimum")
double getOptimum();
@JsProperty(name="optimum")
void setOptimum(double val);
@JsProperty(name="value")
double getValue();
@JsProperty(name="value")
void setValue(double val);
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
@JsOverlay
public static HTMLMeterElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMeterElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLMeterElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLMeterElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMeterElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLMeterElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLMeterElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLMeterElement.class);
}
}
