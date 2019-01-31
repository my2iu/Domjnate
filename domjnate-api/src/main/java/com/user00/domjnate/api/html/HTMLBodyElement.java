package com.user00.domjnate.api.html;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLBodyElement")
public interface HTMLBodyElement extends HTMLElement, com.user00.domjnate.api.WindowEventHandlers
{
@JsProperty(name="aLink")
String getALink();
@JsProperty(name="aLink")
void setALink(String val);
@JsProperty(name="background")
String getBackground();
@JsProperty(name="background")
void setBackground(String val);
@JsProperty(name="bgColor")
String getBgColor();
@JsProperty(name="bgColor")
void setBgColor(String val);
@JsProperty(name="bgProperties")
String getBgProperties();
@JsProperty(name="bgProperties")
void setBgProperties(String val);
@JsProperty(name="link")
String getLink();
@JsProperty(name="link")
void setLink(String val);
@JsProperty(name="noWrap")
boolean getNoWrap();
@JsProperty(name="noWrap")
void setNoWrap(boolean val);
@JsProperty(name="onorientationchange")
OnorientationchangeCallback getOnorientationchange();
@JsProperty(name="onorientationchange")
void setOnorientationchange(OnorientationchangeCallback val);
@JsProperty(name="text")
String getText();
@JsProperty(name="text")
void setText(String val);
@JsProperty(name="vLink")
String getVLink();
@JsProperty(name="vLink")
void setVLink(String val);
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
@JsFunction public static interface OnorientationchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static HTMLBodyElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLBodyElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLBodyElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLBodyElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLBodyElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLBodyElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLBodyElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLBodyElement.class);
}
}
