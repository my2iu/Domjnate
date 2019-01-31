package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMQuad")
public interface DOMQuad
{
@JsProperty(name="p1")
DOMPoint getP1();
@JsProperty(name="p2")
DOMPoint getP2();
@JsProperty(name="p3")
DOMPoint getP3();
@JsProperty(name="p4")
DOMPoint getP4();
@JsMethod(name="getBounds")
DOMRect getBounds();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static DOMQuad getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMQuad", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMQuad.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMQuad val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMQuad", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMQuad fromQuad(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMQuad", "fromQuad", DOMQuad.class);
}
@JsOverlay
public static DOMQuad fromQuad(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMQuadInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMQuad", "fromQuad", DOMQuad.class, other);
}
@JsOverlay
public static DOMQuad fromRect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMQuad", "fromRect", DOMQuad.class);
}
@JsOverlay
public static DOMQuad fromRect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMRectInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMQuad", "fromRect", DOMQuad.class, other);
}
@JsOverlay
public static DOMQuad _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMQuad");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMQuad.class);
}
@JsOverlay
public static DOMQuad _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointInit p1) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMQuad");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMQuad.class, p1);
}
@JsOverlay
public static DOMQuad _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointInit p1, DOMPointInit p2) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMQuad");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMQuad.class, p1, p2);
}
@JsOverlay
public static DOMQuad _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointInit p1, DOMPointInit p2, DOMPointInit p3) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMQuad");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMQuad.class, p1, p2, p3);
}
@JsOverlay
public static DOMQuad _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointInit p1, DOMPointInit p2, DOMPointInit p3, DOMPointInit p4) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMQuad");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMQuad.class, p1, p2, p3, p4);
}
}
