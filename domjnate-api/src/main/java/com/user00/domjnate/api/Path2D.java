package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Path2D")
public interface Path2D extends CanvasPath
{
@JsMethod(name="addPath")
void addPath(Path2D path);
@JsMethod(name="addPath")
void addPath(Path2D path, DOMMatrix2DInit transform);
@JsOverlay
public static Path2D getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Path2D", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Path2D.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Path2D val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Path2D", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Path2D _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Path2D");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Path2D.class);
}
@JsOverlay
public static Path2D _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String path) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Path2D");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Path2D.class, path);
}
@JsOverlay
public static Path2D _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Path2D path) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Path2D");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Path2D.class, path);
}
}
