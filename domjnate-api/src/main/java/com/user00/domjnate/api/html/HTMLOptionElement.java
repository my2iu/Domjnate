package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLOptionElement")
public interface HTMLOptionElement extends HTMLElement
{
@JsProperty(name="defaultSelected")
boolean getDefaultSelected();
@JsProperty(name="defaultSelected")
void setDefaultSelected(boolean val);
@JsProperty(name="disabled")
boolean getDisabled();
@JsProperty(name="disabled")
void setDisabled(boolean val);
@JsProperty(name="form")
HTMLFormElement getForm();
@JsProperty(name="index")
double getIndex();
@JsProperty(name="label")
String getLabel();
@JsProperty(name="label")
void setLabel(String val);
@JsProperty(name="selected")
boolean getSelected();
@JsProperty(name="selected")
void setSelected(boolean val);
@JsProperty(name="text")
String getText();
@JsProperty(name="text")
void setText(String val);
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
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
public static HTMLOptionElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLOptionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLOptionElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLOptionElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLOptionElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLOptionElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLOptionElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLOptionElement.class);
}
}
