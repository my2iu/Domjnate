package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLScriptElement")
public interface HTMLScriptElement extends HTMLElement
{
@JsProperty(name="async")
boolean getAsync();
@JsProperty(name="async")
void setAsync(boolean val);
@JsProperty(name="charset")
String getCharset();
@JsProperty(name="charset")
void setCharset(String val);
@JsProperty(name="crossOrigin")
String getCrossOrigin();
@JsProperty(name="crossOrigin")
void setCrossOrigin(String val);
@JsProperty(name="defer")
boolean getDefer();
@JsProperty(name="defer")
void setDefer(boolean val);
@JsProperty(name="event")
String getEvent();
@JsProperty(name="event")
void setEvent(String val);
@JsProperty(name="htmlFor")
String getHtmlFor();
@JsProperty(name="htmlFor")
void setHtmlFor(String val);
@JsProperty(name="integrity")
String getIntegrity();
@JsProperty(name="integrity")
void setIntegrity(String val);
@JsProperty(name="noModule")
boolean getNoModule();
@JsProperty(name="noModule")
void setNoModule(boolean val);
@JsProperty(name="referrerPolicy")
String getReferrerPolicy();
@JsProperty(name="referrerPolicy")
void setReferrerPolicy(String val);
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="text")
String getText();
@JsProperty(name="text")
void setText(String val);
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
public static HTMLScriptElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLScriptElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLScriptElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLScriptElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLScriptElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLScriptElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLScriptElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLScriptElement.class);
}
}
