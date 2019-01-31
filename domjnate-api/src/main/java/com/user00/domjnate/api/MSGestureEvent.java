package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSGestureEvent")
public interface MSGestureEvent extends UIEvent
{
@JsProperty(name="clientX")
double getClientX();
@JsProperty(name="clientY")
double getClientY();
@JsProperty(name="expansion")
double getExpansion();
@JsProperty(name="gestureObject")
java.lang.Object getGestureObject();
@JsProperty(name="hwTimestamp")
double getHwTimestamp();
@JsProperty(name="offsetX")
double getOffsetX();
@JsProperty(name="offsetY")
double getOffsetY();
@JsProperty(name="rotation")
double getRotation();
@JsProperty(name="scale")
double getScale();
@JsProperty(name="screenX")
double getScreenX();
@JsProperty(name="screenY")
double getScreenY();
@JsProperty(name="translationX")
double getTranslationX();
@JsProperty(name="translationY")
double getTranslationY();
@JsProperty(name="velocityAngular")
double getVelocityAngular();
@JsProperty(name="velocityExpansion")
double getVelocityExpansion();
@JsProperty(name="velocityX")
double getVelocityX();
@JsProperty(name="velocityY")
double getVelocityY();
@JsProperty(name="MSGESTURE_FLAG_BEGIN")
double MSGESTURE_FLAG_BEGIN();
@JsProperty(name="MSGESTURE_FLAG_CANCEL")
double MSGESTURE_FLAG_CANCEL();
@JsProperty(name="MSGESTURE_FLAG_END")
double MSGESTURE_FLAG_END();
@JsProperty(name="MSGESTURE_FLAG_INERTIA")
double MSGESTURE_FLAG_INERTIA();
@JsProperty(name="MSGESTURE_FLAG_NONE")
double MSGESTURE_FLAG_NONE();
@JsMethod(name="initGestureEvent")
void initGestureEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg, double screenXArg, double screenYArg, double clientXArg, double clientYArg, double offsetXArg, double offsetYArg, double translationXArg, double translationYArg, double scaleArg, double expansionArg, double rotationArg, double velocityXArg, double velocityYArg, double velocityExpansionArg, double velocityAngularArg, double hwTimestampArg);
@JsOverlay
public static MSGestureEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSGestureEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSGestureEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double MSGESTURE_FLAG_BEGIN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MSGESTURE_FLAG_BEGIN", double.class);
}
@JsOverlay
public static double MSGESTURE_FLAG_CANCEL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MSGESTURE_FLAG_CANCEL", double.class);
}
@JsOverlay
public static double MSGESTURE_FLAG_END(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MSGESTURE_FLAG_END", double.class);
}
@JsOverlay
public static double MSGESTURE_FLAG_INERTIA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MSGESTURE_FLAG_INERTIA", double.class);
}
@JsOverlay
public static double MSGESTURE_FLAG_NONE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGestureEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MSGESTURE_FLAG_NONE", double.class);
}
@JsOverlay
public static MSGestureEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSGestureEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSGestureEvent.class);
}
}
