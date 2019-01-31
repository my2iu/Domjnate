package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="File")
public interface File extends Blob
{
@JsProperty(name="lastModified")
double getLastModified();
@JsProperty(name="name")
String getName();
@JsOverlay
public static File getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "File", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", File.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, File val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "File", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static File _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<String> fileBits, String fileName) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "File");
  return com.user00.domjnate.util.Js.construct(_win, constructor, File.class, fileBits, fileName);
}
@JsOverlay
public static File _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<String> fileBits, String fileName, FilePropertyBag options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "File");
  return com.user00.domjnate.util.Js.construct(_win, constructor, File.class, fileBits, fileName, options);
}
}
