package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CharacterData")
public interface CharacterData extends Node, NonDocumentTypeChildNode, ChildNode
{
@JsProperty(name="data")
String getData();
@JsProperty(name="data")
void setData(String val);
@JsProperty(name="length")
double getLength();
@JsMethod(name="appendData")
void appendData(String data);
@JsMethod(name="deleteData")
void deleteData(double offset, double count);
@JsMethod(name="insertData")
void insertData(double offset, String data);
@JsMethod(name="replaceData")
void replaceData(double offset, double count, String data);
@JsMethod(name="substringData")
String substringData(double offset, double count);
@JsOverlay
public static CharacterData getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CharacterData", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CharacterData.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CharacterData val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CharacterData", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CharacterData _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CharacterData");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CharacterData.class);
}
}
