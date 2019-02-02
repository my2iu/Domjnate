package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NodeListOf")
public interface NodeListOf<TNode extends Node> 
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
@JsMethod(name="item")
TNode item(double index);
@JsMethod(name="forEach")
void forEach(ForEachCallback0<TNode> callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0<TNode> callbackfn, java.lang.Object thisArg);
@JsOverlay
public default TNode get(double index, Class<TNode> _type) {
  return (TNode)com.user00.domjnate.util.Js.getIndex(this, index, _type);
}
@JsOverlay
public default void set(double index, TNode val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface ForEachCallback0<TNode extends Node> 
{
void apply(TNode value, double key, NodeListOf<TNode> parent);
}
}
