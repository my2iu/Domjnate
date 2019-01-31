package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLLinkElement")
public interface HTMLLinkElement extends HTMLElement, com.user00.domjnate.api.LinkStyle
{
@JsProperty(name="as")
String getAs();
@JsProperty(name="as")
void setAs(String val);
@JsProperty(name="charset")
String getCharset();
@JsProperty(name="charset")
void setCharset(String val);
@JsProperty(name="crossOrigin")
String getCrossOrigin();
@JsProperty(name="crossOrigin")
void setCrossOrigin(String val);
@JsProperty(name="disabled")
boolean getDisabled();
@JsProperty(name="disabled")
void setDisabled(boolean val);
@JsProperty(name="href")
String getHref();
@JsProperty(name="href")
void setHref(String val);
@JsProperty(name="hreflang")
String getHreflang();
@JsProperty(name="hreflang")
void setHreflang(String val);
@JsProperty(name="integrity")
String getIntegrity();
@JsProperty(name="integrity")
void setIntegrity(String val);
@JsProperty(name="media")
String getMedia();
@JsProperty(name="media")
void setMedia(String val);
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
@JsProperty(name="rev")
String getRev();
@JsProperty(name="rev")
void setRev(String val);
@JsProperty(name="sizes")
com.user00.domjnate.api.dom.DOMTokenList getSizes();
@JsProperty(name="target")
String getTarget();
@JsProperty(name="target")
void setTarget(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
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
public static HTMLLinkElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLLinkElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLLinkElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLLinkElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLLinkElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLLinkElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLLinkElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLLinkElement.class);
}
}
