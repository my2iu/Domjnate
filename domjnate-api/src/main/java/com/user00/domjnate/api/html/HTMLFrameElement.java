package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLFrameElement")
public interface HTMLFrameElement extends HTMLElement
{
@JsProperty(name="contentDocument")
com.user00.domjnate.api.dom.Document getContentDocument();
@JsProperty(name="contentWindow")
com.user00.domjnate.api.Window getContentWindow();
@JsProperty(name="frameBorder")
String getFrameBorder();
@JsProperty(name="frameBorder")
void setFrameBorder(String val);
@JsProperty(name="longDesc")
String getLongDesc();
@JsProperty(name="longDesc")
void setLongDesc(String val);
@JsProperty(name="marginHeight")
String getMarginHeight();
@JsProperty(name="marginHeight")
void setMarginHeight(String val);
@JsProperty(name="marginWidth")
String getMarginWidth();
@JsProperty(name="marginWidth")
void setMarginWidth(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="noResize")
boolean getNoResize();
@JsProperty(name="noResize")
void setNoResize(boolean val);
@JsProperty(name="scrolling")
String getScrolling();
@JsProperty(name="scrolling")
void setScrolling(String val);
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
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
public static HTMLFrameElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLFrameElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLFrameElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLFrameElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLFrameElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLFrameElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLFrameElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLFrameElement.class);
}
}
