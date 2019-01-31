package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLLegendElement")
public interface HTMLLegendElement extends HTMLElement
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="form")
HTMLFormElement getForm();
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
public static HTMLLegendElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLLegendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLLegendElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLLegendElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLLegendElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLLegendElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLLegendElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLLegendElement.class);
}
}