package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLIFrameElement")
public interface HTMLIFrameElement extends HTMLElement, GetSVGDocument
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="allowFullscreen")
boolean getAllowFullscreen();
@JsProperty(name="allowFullscreen")
void setAllowFullscreen(boolean val);
@JsProperty(name="allowPaymentRequest")
boolean getAllowPaymentRequest();
@JsProperty(name="allowPaymentRequest")
void setAllowPaymentRequest(boolean val);
@JsProperty(name="contentDocument")
com.user00.domjnate.api.dom.Document getContentDocument();
@JsProperty(name="contentWindow")
com.user00.domjnate.api.Window getContentWindow();
@JsProperty(name="frameBorder")
String getFrameBorder();
@JsProperty(name="frameBorder")
void setFrameBorder(String val);
@JsProperty(name="height")
String getHeight();
@JsProperty(name="height")
void setHeight(String val);
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
@JsProperty(name="referrerPolicy")
String getReferrerPolicy();
@JsProperty(name="sandbox")
com.user00.domjnate.api.dom.DOMTokenList getSandbox();
@JsProperty(name="scrolling")
String getScrolling();
@JsProperty(name="scrolling")
void setScrolling(String val);
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="srcdoc")
String getSrcdoc();
@JsProperty(name="srcdoc")
void setSrcdoc(String val);
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
public static HTMLIFrameElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLIFrameElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLIFrameElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLIFrameElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLIFrameElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLIFrameElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLIFrameElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLIFrameElement.class);
}
}
