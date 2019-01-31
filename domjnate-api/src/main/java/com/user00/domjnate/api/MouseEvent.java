package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MouseEvent")
public interface MouseEvent extends UIEvent
{
@JsProperty(name="altKey")
boolean getAltKey();
@JsProperty(name="button")
double getButton();
@JsProperty(name="buttons")
double getButtons();
@JsProperty(name="clientX")
double getClientX();
@JsProperty(name="clientY")
double getClientY();
@JsProperty(name="ctrlKey")
boolean getCtrlKey();
@JsProperty(name="fromElement")
com.user00.domjnate.api.dom.Element getFromElement();
@JsProperty(name="layerX")
double getLayerX();
@JsProperty(name="layerY")
double getLayerY();
@JsProperty(name="metaKey")
boolean getMetaKey();
@JsProperty(name="movementX")
double getMovementX();
@JsProperty(name="movementY")
double getMovementY();
@JsProperty(name="offsetX")
double getOffsetX();
@JsProperty(name="offsetY")
double getOffsetY();
@JsProperty(name="pageX")
double getPageX();
@JsProperty(name="pageY")
double getPageY();
@JsProperty(name="relatedTarget")
com.user00.domjnate.api.dom.EventTarget getRelatedTarget();
@JsProperty(name="screenX")
double getScreenX();
@JsProperty(name="screenY")
double getScreenY();
@JsProperty(name="shiftKey")
boolean getShiftKey();
@JsProperty(name="toElement")
com.user00.domjnate.api.dom.Element getToElement();
@JsProperty(name="which")
double getWhich();
@JsProperty(name="x")
double getX();
@JsProperty(name="y")
double getY();
@JsMethod(name="getModifierState")
boolean getModifierState(String keyArg);
@JsMethod(name="initMouseEvent")
void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg, double screenXArg, double screenYArg, double clientXArg, double clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, double buttonArg, com.user00.domjnate.api.dom.EventTarget relatedTargetArg);
@JsOverlay
public static MouseEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MouseEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MouseEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MouseEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MouseEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MouseEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MouseEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MouseEvent.class, typeArg);
}
@JsOverlay
public static MouseEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, MouseEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MouseEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MouseEvent.class, typeArg, eventInitDict);
}
}
