package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NodeList")
public interface NodeList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
Node item(double index);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsOverlay
public default Node get(double index) {
  return (Node)com.user00.domjnate.util.Js.getIndex(this, index, Node.class);
}
@JsOverlay
public default void set(double index, Node val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface ForEachCallback0
{
void apply(Node value, double key, NodeList parent);
}
@JsOverlay
public static NodeList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NodeList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", NodeList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, NodeList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NodeList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static NodeList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NodeList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NodeList.class);
}
}
