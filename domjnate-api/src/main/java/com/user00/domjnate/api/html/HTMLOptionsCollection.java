package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLOptionsCollection")
public interface HTMLOptionsCollection extends com.user00.domjnate.api.dom.HTMLCollectionOf<HTMLOptionElement>
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
@JsProperty(name="selectedIndex")
double getSelectedIndex();
@JsProperty(name="selectedIndex")
void setSelectedIndex(double val);
@JsMethod(name="add")
void add(HTMLOptGroupElement element);
@JsMethod(name="add")
void add(HTMLOptionElement element);
@JsMethod(name="add")
void add(HTMLOptGroupElement element, Double before);
@JsMethod(name="add")
void add(HTMLOptionElement element, Double before);
@JsMethod(name="add")
void add(HTMLOptGroupElement element, HTMLElement before);
@JsMethod(name="add")
void add(HTMLOptionElement element, HTMLElement before);
@JsMethod(name="remove")
void remove(double index);
@JsOverlay
public static HTMLOptionsCollection getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLOptionsCollection", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLOptionsCollection.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLOptionsCollection val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLOptionsCollection", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLOptionsCollection _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLOptionsCollection");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLOptionsCollection.class);
}
}
