package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLFormElement")
public interface HTMLFormElement extends HTMLElement
{
@JsProperty(name="acceptCharset")
String getAcceptCharset();
@JsProperty(name="acceptCharset")
void setAcceptCharset(String val);
@JsProperty(name="action")
String getAction();
@JsProperty(name="action")
void setAction(String val);
@JsProperty(name="autocomplete")
String getAutocomplete();
@JsProperty(name="autocomplete")
void setAutocomplete(String val);
@JsProperty(name="elements")
HTMLFormControlsCollection getElements();
@JsProperty(name="encoding")
String getEncoding();
@JsProperty(name="encoding")
void setEncoding(String val);
@JsProperty(name="enctype")
String getEnctype();
@JsProperty(name="enctype")
void setEnctype(String val);
@JsProperty(name="length")
double getLength();
@JsProperty(name="method")
String getMethod();
@JsProperty(name="method")
void setMethod(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="noValidate")
boolean getNoValidate();
@JsProperty(name="noValidate")
void setNoValidate(boolean val);
@JsProperty(name="target")
String getTarget();
@JsProperty(name="target")
void setTarget(String val);
@JsMethod(name="checkValidity")
boolean checkValidity();
@JsMethod(name="reportValidity")
boolean reportValidity();
@JsMethod(name="reset")
void reset();
@JsMethod(name="submit")
void submit();
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
public default com.user00.domjnate.api.dom.Element get(double index) {
  return (com.user00.domjnate.api.dom.Element)com.user00.domjnate.util.Js.getIndex(this, index, com.user00.domjnate.api.dom.Element.class);
}
@JsOverlay
public default void set(double index, com.user00.domjnate.api.dom.Element val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public default java.lang.Object get(String name) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getMember(this, name, java.lang.Object.class);
}
@JsOverlay
public default void set(String name, java.lang.Object val) {
  com.user00.domjnate.util.Js.setMember(this, name, val);
}
@JsOverlay
public static HTMLFormElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLFormElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLFormElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLFormElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLFormElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLFormElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLFormElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLFormElement.class);
}
}
