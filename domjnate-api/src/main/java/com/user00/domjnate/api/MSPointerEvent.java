package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSPointerEvent")
public interface MSPointerEvent extends MouseEvent
{
@JsProperty(name="currentPoint")
java.lang.Object getCurrentPoint();
@JsProperty(name="height")
double getHeight();
@JsProperty(name="hwTimestamp")
double getHwTimestamp();
@JsProperty(name="intermediatePoints")
java.lang.Object getIntermediatePoints();
@JsProperty(name="isPrimary")
boolean getIsPrimary();
@JsProperty(name="pointerId")
double getPointerId();
@JsProperty(name="pointerType")
java.lang.Object getPointerType();
@JsProperty(name="pressure")
double getPressure();
@JsProperty(name="rotation")
double getRotation();
@JsProperty(name="tiltX")
double getTiltX();
@JsProperty(name="tiltY")
double getTiltY();
@JsProperty(name="width")
double getWidth();
@JsMethod(name="getCurrentPoint")
void getCurrentPoint(com.user00.domjnate.api.dom.Element element);
@JsMethod(name="getIntermediatePoints")
void getIntermediatePoints(com.user00.domjnate.api.dom.Element element);
@JsMethod(name="initPointerEvent")
void initPointerEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg, double screenXArg, double screenYArg, double clientXArg, double clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, double buttonArg, com.user00.domjnate.api.dom.EventTarget relatedTargetArg, double offsetXArg, double offsetYArg, double widthArg, double heightArg, double pressure, double rotation, double tiltX, double tiltY, double pointerIdArg, java.lang.Object pointerType, double hwTimestampArg, boolean isPrimary);
@JsOverlay
public static MSPointerEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSPointerEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSPointerEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSPointerEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSPointerEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSPointerEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSPointerEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSPointerEvent.class, typeArg);
}
@JsOverlay
public static MSPointerEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, PointerEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSPointerEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSPointerEvent.class, typeArg, eventInitDict);
}
}
