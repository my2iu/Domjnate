package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLElement")
public interface HTMLElement extends com.user00.domjnate.api.dom.Element, com.user00.domjnate.api.GlobalEventHandlers, com.user00.domjnate.api.DocumentAndElementEventHandlers, com.user00.domjnate.api.ElementContentEditable, HTMLOrSVGElement, com.user00.domjnate.api.ElementCSSInlineStyle
{
@JsProperty(name="accessKey")
String getAccessKey();
@JsProperty(name="accessKey")
void setAccessKey(String val);
@JsProperty(name="accessKeyLabel")
String getAccessKeyLabel();
@JsProperty(name="autocapitalize")
String getAutocapitalize();
@JsProperty(name="autocapitalize")
void setAutocapitalize(String val);
@JsProperty(name="dir")
String getDir();
@JsProperty(name="dir")
void setDir(String val);
@JsProperty(name="draggable")
boolean getDraggable();
@JsProperty(name="draggable")
void setDraggable(boolean val);
@JsProperty(name="hidden")
boolean getHidden();
@JsProperty(name="hidden")
void setHidden(boolean val);
@JsProperty(name="innerText")
String getInnerText();
@JsProperty(name="innerText")
void setInnerText(String val);
@JsProperty(name="lang")
String getLang();
@JsProperty(name="lang")
void setLang(String val);
@JsProperty(name="offsetHeight")
double getOffsetHeight();
@JsProperty(name="offsetLeft")
double getOffsetLeft();
@JsProperty(name="offsetParent")
com.user00.domjnate.api.dom.Element getOffsetParent();
@JsProperty(name="offsetTop")
double getOffsetTop();
@JsProperty(name="offsetWidth")
double getOffsetWidth();
@JsProperty(name="spellcheck")
boolean getSpellcheck();
@JsProperty(name="spellcheck")
void setSpellcheck(boolean val);
@JsProperty(name="title")
String getTitle();
@JsProperty(name="title")
void setTitle(String val);
@JsProperty(name="translate")
boolean getTranslate();
@JsProperty(name="translate")
void setTranslate(boolean val);
@JsMethod(name="click")
void click();
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
public static HTMLElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLElement.class);
}
}
