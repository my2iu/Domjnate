package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLEmbedElement")
public interface HTMLEmbedElement extends HTMLElement, GetSVGDocument
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="height")
String getHeight();
@JsProperty(name="height")
void setHeight(String val);
@JsProperty(name="msPlayToDisabled")
boolean getMsPlayToDisabled();
@JsProperty(name="msPlayToDisabled")
void setMsPlayToDisabled(boolean val);
@JsProperty(name="msPlayToPreferredSourceUri")
String getMsPlayToPreferredSourceUri();
@JsProperty(name="msPlayToPreferredSourceUri")
void setMsPlayToPreferredSourceUri(String val);
@JsProperty(name="msPlayToPrimary")
boolean getMsPlayToPrimary();
@JsProperty(name="msPlayToPrimary")
void setMsPlayToPrimary(boolean val);
@JsProperty(name="msPlayToSource")
java.lang.Object getMsPlayToSource();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="palette")
String getPalette();
@JsProperty(name="pluginspage")
String getPluginspage();
@JsProperty(name="readyState")
String getReadyState();
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="units")
String getUnits();
@JsProperty(name="units")
void setUnits(String val);
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
public static HTMLEmbedElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLEmbedElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLEmbedElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLEmbedElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLEmbedElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLEmbedElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLEmbedElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLEmbedElement.class);
}
}
