package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DataTransfer")
public interface DataTransfer
{
@JsProperty(name="dropEffect")
String getDropEffect();
@JsProperty(name="dropEffect")
void setDropEffect(String val);
@JsProperty(name="effectAllowed")
String getEffectAllowed();
@JsProperty(name="effectAllowed")
void setEffectAllowed(String val);
@JsProperty(name="files")
FileList getFiles();
@JsProperty(name="items")
DataTransferItemList getItems();
@JsProperty(name="types")
ReadonlyArray<String> getTypes();
@JsMethod(name="clearData")
void clearData();
@JsMethod(name="clearData")
void clearData(String format);
@JsMethod(name="getData")
String getData(String format);
@JsMethod(name="setData")
void setData(String format, String data);
@JsMethod(name="setDragImage")
void setDragImage(com.user00.domjnate.api.dom.Element image, double x, double y);
@JsOverlay
public static DataTransfer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DataTransfer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DataTransfer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DataTransfer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DataTransfer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DataTransfer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DataTransfer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DataTransfer.class);
}
}
