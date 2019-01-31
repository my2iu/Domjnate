package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DataTransferItemList")
public interface DataTransferItemList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="add")
DataTransferItem add(String data, String type);
@JsMethod(name="add")
DataTransferItem add(File data);
@JsMethod(name="clear")
void clear();
@JsMethod(name="item")
DataTransferItem item(double index);
@JsMethod(name="remove")
void remove(double index);
@JsOverlay
public default DataTransferItem get(double name) {
  return (DataTransferItem)com.user00.domjnate.util.Js.getIndex(this, name, DataTransferItem.class);
}
@JsOverlay
public default void set(double name, DataTransferItem val) {
  com.user00.domjnate.util.Js.setIndex(this, name, val);
}
@JsOverlay
public static DataTransferItemList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DataTransferItemList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DataTransferItemList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DataTransferItemList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DataTransferItemList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DataTransferItemList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DataTransferItemList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DataTransferItemList.class);
}
}
