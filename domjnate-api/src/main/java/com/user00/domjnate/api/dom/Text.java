package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Text")
public interface Text extends CharacterData, com.user00.domjnate.api.Slotable
{
@JsProperty(name="assignedSlot")
com.user00.domjnate.api.html.HTMLSlotElement getAssignedSlot();
@JsProperty(name="wholeText")
String getWholeText();
@JsMethod(name="splitText")
Text splitText(double offset);
@JsOverlay
public static Text getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Text", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Text.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Text val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Text", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Text _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Text");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Text.class);
}
@JsOverlay
public static Text _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String data) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Text");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Text.class, data);
}
}
