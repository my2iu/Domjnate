package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLParamElement")
public interface HTMLParamElement extends HTMLElement
{
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsProperty(name="valueType")
String getValueType();
@JsProperty(name="valueType")
void setValueType(String val);
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
public static HTMLParamElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLParamElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLParamElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLParamElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLParamElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLParamElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLParamElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLParamElement.class);
}
}
