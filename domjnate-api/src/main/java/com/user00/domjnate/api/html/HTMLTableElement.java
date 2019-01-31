package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLTableElement")
public interface HTMLTableElement extends HTMLElement
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="bgColor")
String getBgColor();
@JsProperty(name="bgColor")
void setBgColor(String val);
@JsProperty(name="border")
String getBorder();
@JsProperty(name="border")
void setBorder(String val);
@JsProperty(name="caption")
HTMLTableCaptionElement getCaption();
@JsProperty(name="caption")
void setCaption(HTMLTableCaptionElement val);
@JsProperty(name="cellPadding")
String getCellPadding();
@JsProperty(name="cellPadding")
void setCellPadding(String val);
@JsProperty(name="cellSpacing")
String getCellSpacing();
@JsProperty(name="cellSpacing")
void setCellSpacing(String val);
@JsProperty(name="frame")
String getFrame();
@JsProperty(name="frame")
void setFrame(String val);
@JsProperty(name="rows")
com.user00.domjnate.api.dom.HTMLCollectionOf<HTMLTableRowElement> getRows();
@JsProperty(name="rules")
String getRules();
@JsProperty(name="rules")
void setRules(String val);
@JsProperty(name="summary")
String getSummary();
@JsProperty(name="summary")
void setSummary(String val);
@JsProperty(name="tBodies")
com.user00.domjnate.api.dom.HTMLCollectionOf<HTMLTableSectionElement> getTBodies();
@JsProperty(name="tFoot")
HTMLTableSectionElement getTFoot();
@JsProperty(name="tFoot")
void setTFoot(HTMLTableSectionElement val);
@JsProperty(name="tHead")
HTMLTableSectionElement getTHead();
@JsProperty(name="tHead")
void setTHead(HTMLTableSectionElement val);
@JsProperty(name="width")
String getWidth();
@JsProperty(name="width")
void setWidth(String val);
@JsMethod(name="createCaption")
HTMLTableCaptionElement createCaption();
@JsMethod(name="createTBody")
HTMLTableSectionElement createTBody();
@JsMethod(name="createTFoot")
HTMLTableSectionElement createTFoot();
@JsMethod(name="createTHead")
HTMLTableSectionElement createTHead();
@JsMethod(name="deleteCaption")
void deleteCaption();
@JsMethod(name="deleteRow")
void deleteRow(double index);
@JsMethod(name="deleteTFoot")
void deleteTFoot();
@JsMethod(name="deleteTHead")
void deleteTHead();
@JsMethod(name="insertRow")
HTMLTableRowElement insertRow();
@JsMethod(name="insertRow")
HTMLTableRowElement insertRow(double index);
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
public static HTMLTableElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTableElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLTableElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLTableElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTableElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLTableElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLTableElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLTableElement.class);
}
}
