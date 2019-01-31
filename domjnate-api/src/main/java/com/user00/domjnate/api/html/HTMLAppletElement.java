package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLAppletElement")
public interface HTMLAppletElement extends HTMLElement
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="alt")
String getAlt();
@JsProperty(name="alt")
void setAlt(String val);
@JsProperty(name="archive")
String getArchive();
@JsProperty(name="archive")
void setArchive(String val);
@JsProperty(name="code")
String getCode();
@JsProperty(name="code")
void setCode(String val);
@JsProperty(name="codeBase")
String getCodeBase();
@JsProperty(name="codeBase")
void setCodeBase(String val);
@JsProperty(name="form")
HTMLFormElement getForm();
@JsProperty(name="height")
String getHeight();
@JsProperty(name="height")
void setHeight(String val);
@JsProperty(name="hspace")
double getHspace();
@JsProperty(name="hspace")
void setHspace(double val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="object")
String getObject();
@JsProperty(name="object")
void setObject(String val);
@JsProperty(name="vspace")
double getVspace();
@JsProperty(name="vspace")
void setVspace(double val);
@JsProperty(name="width")
String getWidth();
@JsProperty(name="width")
void setWidth(String val);
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
public static HTMLAppletElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLAppletElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLAppletElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLAppletElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLAppletElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLAppletElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLAppletElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLAppletElement.class);
}
}
