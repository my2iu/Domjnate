package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLTableSectionElement")
public interface HTMLTableSectionElement extends HTMLElement
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="ch")
String getCh();
@JsProperty(name="ch")
void setCh(String val);
@JsProperty(name="chOff")
String getChOff();
@JsProperty(name="chOff")
void setChOff(String val);
@JsProperty(name="rows")
com.user00.domjnate.api.dom.HTMLCollectionOf<HTMLTableRowElement> getRows();
@JsProperty(name="vAlign")
String getVAlign();
@JsProperty(name="vAlign")
void setVAlign(String val);
@JsMethod(name="deleteRow")
void deleteRow(double index);
@JsMethod(name="insertRow")
HTMLTableRowElement insertRow();
@JsMethod(name="insertRow")
HTMLTableRowElement insertRow(double index);
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
public static HTMLTableSectionElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTableSectionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLTableSectionElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLTableSectionElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTableSectionElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLTableSectionElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLTableSectionElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLTableSectionElement.class);
}
}
