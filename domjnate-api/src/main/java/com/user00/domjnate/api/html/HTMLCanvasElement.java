package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLCanvasElement")
public interface HTMLCanvasElement extends HTMLElement
{
@JsProperty(name="height")
double getHeight();
@JsProperty(name="height")
void setHeight(double val);
@JsProperty(name="width")
double getWidth();
@JsProperty(name="width")
void setWidth(double val);
@JsMethod(name="getContext")
java.lang.Object getContext(String contextId);
@JsMethod(name="getContext")
java.lang.Object getContext(String contextId, java.lang.Object contextAttributes);
@JsMethod(name="toBlob")
void toBlob(com.user00.domjnate.api.BlobCallback callback);
@JsMethod(name="toBlob")
void toBlob(com.user00.domjnate.api.BlobCallback callback, String type);
@JsMethod(name="toBlob")
void toBlob(com.user00.domjnate.api.BlobCallback callback, String type, java.lang.Object quality);
@JsMethod(name="toDataURL")
String toDataURL();
@JsMethod(name="toDataURL")
String toDataURL(String type);
@JsMethod(name="toDataURL")
String toDataURL(String type, java.lang.Object quality);
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
public static HTMLCanvasElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLCanvasElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLCanvasElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLCanvasElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLCanvasElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLCanvasElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLCanvasElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLCanvasElement.class);
}
}
