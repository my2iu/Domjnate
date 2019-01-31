package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ValidityState")
public interface ValidityState
{
@JsProperty(name="badInput")
boolean getBadInput();
@JsProperty(name="customError")
boolean getCustomError();
@JsProperty(name="patternMismatch")
boolean getPatternMismatch();
@JsProperty(name="rangeOverflow")
boolean getRangeOverflow();
@JsProperty(name="rangeUnderflow")
boolean getRangeUnderflow();
@JsProperty(name="stepMismatch")
boolean getStepMismatch();
@JsProperty(name="tooLong")
boolean getTooLong();
@JsProperty(name="tooShort")
boolean getTooShort();
@JsProperty(name="typeMismatch")
boolean getTypeMismatch();
@JsProperty(name="valid")
boolean getValid();
@JsProperty(name="valueMissing")
boolean getValueMissing();
@JsOverlay
public static ValidityState getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ValidityState", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ValidityState.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ValidityState val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ValidityState", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ValidityState _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ValidityState");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ValidityState.class);
}
}
