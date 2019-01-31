package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLImageElement")
public interface HTMLImageElement extends HTMLElement
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="alt")
String getAlt();
@JsProperty(name="alt")
void setAlt(String val);
@JsProperty(name="border")
String getBorder();
@JsProperty(name="border")
void setBorder(String val);
@JsProperty(name="complete")
boolean getComplete();
@JsProperty(name="crossOrigin")
String getCrossOrigin();
@JsProperty(name="crossOrigin")
void setCrossOrigin(String val);
@JsProperty(name="currentSrc")
String getCurrentSrc();
@JsProperty(name="decoding")
String getDecoding();
@JsProperty(name="decoding")
void setDecoding(String val);
@JsProperty(name="height")
double getHeight();
@JsProperty(name="height")
void setHeight(double val);
@JsProperty(name="hspace")
double getHspace();
@JsProperty(name="hspace")
void setHspace(double val);
@JsProperty(name="isMap")
boolean getIsMap();
@JsProperty(name="isMap")
void setIsMap(boolean val);
@JsProperty(name="longDesc")
String getLongDesc();
@JsProperty(name="longDesc")
void setLongDesc(String val);
@JsProperty(name="lowsrc")
String getLowsrc();
@JsProperty(name="lowsrc")
void setLowsrc(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="naturalHeight")
double getNaturalHeight();
@JsProperty(name="naturalWidth")
double getNaturalWidth();
@JsProperty(name="referrerPolicy")
String getReferrerPolicy();
@JsProperty(name="referrerPolicy")
void setReferrerPolicy(String val);
@JsProperty(name="sizes")
String getSizes();
@JsProperty(name="sizes")
void setSizes(String val);
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="srcset")
String getSrcset();
@JsProperty(name="srcset")
void setSrcset(String val);
@JsProperty(name="useMap")
String getUseMap();
@JsProperty(name="useMap")
void setUseMap(String val);
@JsProperty(name="vspace")
double getVspace();
@JsProperty(name="vspace")
void setVspace(double val);
@JsProperty(name="width")
double getWidth();
@JsProperty(name="width")
void setWidth(double val);
@JsProperty(name="x")
double getX();
@JsProperty(name="y")
double getY();
@JsMethod(name="decode")
com.user00.domjnate.api.Promise<Void> decode();
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
public static HTMLImageElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLImageElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLImageElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLImageElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLImageElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLImageElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLImageElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLImageElement.class);
}
}
