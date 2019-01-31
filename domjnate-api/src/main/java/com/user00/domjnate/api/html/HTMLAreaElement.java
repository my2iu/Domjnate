package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLAreaElement")
public interface HTMLAreaElement extends HTMLElement, HTMLHyperlinkElementUtils
{
@JsProperty(name="alt")
String getAlt();
@JsProperty(name="alt")
void setAlt(String val);
@JsProperty(name="coords")
String getCoords();
@JsProperty(name="coords")
void setCoords(String val);
@JsProperty(name="download")
String getDownload();
@JsProperty(name="download")
void setDownload(String val);
@JsProperty(name="noHref")
boolean getNoHref();
@JsProperty(name="noHref")
void setNoHref(boolean val);
@JsProperty(name="ping")
String getPing();
@JsProperty(name="ping")
void setPing(String val);
@JsProperty(name="referrerPolicy")
String getReferrerPolicy();
@JsProperty(name="referrerPolicy")
void setReferrerPolicy(String val);
@JsProperty(name="rel")
String getRel();
@JsProperty(name="rel")
void setRel(String val);
@JsProperty(name="relList")
com.user00.domjnate.api.dom.DOMTokenList getRelList();
@JsProperty(name="shape")
String getShape();
@JsProperty(name="shape")
void setShape(String val);
@JsProperty(name="target")
String getTarget();
@JsProperty(name="target")
void setTarget(String val);
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
public static HTMLAreaElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLAreaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLAreaElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLAreaElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLAreaElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLAreaElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLAreaElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLAreaElement.class);
}
}
