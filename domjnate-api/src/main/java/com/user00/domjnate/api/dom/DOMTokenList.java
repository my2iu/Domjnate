package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMTokenList")
public interface DOMTokenList
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsMethod(name="add")
void add(String... tokens);
@JsMethod(name="contains")
boolean contains(String token);
@JsMethod(name="item")
String item(double index);
@JsMethod(name="remove")
void remove(String... tokens);
@JsMethod(name="replace")
void replace(String oldToken, String newToken);
@JsMethod(name="supports")
boolean supports(String token);
@JsMethod(name="toggle")
boolean toggle(String token);
@JsMethod(name="toggle")
boolean toggle(String token, boolean force);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsOverlay
public default String get(double index) {
  return (String)com.user00.domjnate.util.Js.getIndex(this, index, String.class);
}
@JsOverlay
public default void set(double index, String val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface ForEachCallback0
{
void apply(String value, double key, DOMTokenList parent);
}
@JsOverlay
public static DOMTokenList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMTokenList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMTokenList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMTokenList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMTokenList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMTokenList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMTokenList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMTokenList.class);
}
}
