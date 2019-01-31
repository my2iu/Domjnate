package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLTableCellElement")
public interface HTMLTableCellElement extends HTMLElement
{
@JsProperty(name="abbr")
String getAbbr();
@JsProperty(name="abbr")
void setAbbr(String val);
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="axis")
String getAxis();
@JsProperty(name="axis")
void setAxis(String val);
@JsProperty(name="bgColor")
String getBgColor();
@JsProperty(name="bgColor")
void setBgColor(String val);
@JsProperty(name="cellIndex")
double getCellIndex();
@JsProperty(name="ch")
String getCh();
@JsProperty(name="ch")
void setCh(String val);
@JsProperty(name="chOff")
String getChOff();
@JsProperty(name="chOff")
void setChOff(String val);
@JsProperty(name="colSpan")
double getColSpan();
@JsProperty(name="colSpan")
void setColSpan(double val);
@JsProperty(name="headers")
String getHeaders();
@JsProperty(name="headers")
void setHeaders(String val);
@JsProperty(name="height")
String getHeight();
@JsProperty(name="height")
void setHeight(String val);
@JsProperty(name="noWrap")
boolean getNoWrap();
@JsProperty(name="noWrap")
void setNoWrap(boolean val);
@JsProperty(name="rowSpan")
double getRowSpan();
@JsProperty(name="rowSpan")
void setRowSpan(double val);
@JsProperty(name="scope")
String getScope();
@JsProperty(name="scope")
void setScope(String val);
@JsProperty(name="vAlign")
String getVAlign();
@JsProperty(name="vAlign")
void setVAlign(String val);
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
public static HTMLTableCellElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTableCellElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLTableCellElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLTableCellElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTableCellElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLTableCellElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLTableCellElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLTableCellElement.class);
}
}
