package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBIndex")
public interface IDBIndex
{
@JsProperty(name="keyPath")
java.lang.Object getKeyPath();
@JsProperty(name="multiEntry")
boolean getMultiEntry();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="objectStore")
IDBObjectStore getObjectStore();
@JsProperty(name="unique")
boolean getUnique();
@JsMethod(name="count")
IDBRequest<Double> count();
@JsMethod(name="count")
IDBRequest<Double> count(IDBKeyRange key);
@JsMethod(name="count")
IDBRequest<Double> count(IDBArrayKey key);
@JsMethod(name="count")
IDBRequest<Double> count(com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="count")
IDBRequest<Double> count(com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="count")
IDBRequest<Double> count(com.user00.domjnate.api.Date key);
@JsMethod(name="count")
IDBRequest<Double> count(String key);
@JsMethod(name="count")
IDBRequest<Double> count(double key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(IDBKeyRange key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(IDBArrayKey key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(com.user00.domjnate.api.Date key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(String key);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(double key);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll();
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(IDBKeyRange query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(IDBArrayKey query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(com.user00.domjnate.api.ArrayBuffer query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(com.user00.domjnate.api.ArrayBufferView query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(com.user00.domjnate.api.Date query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(String query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(double query);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(IDBKeyRange query, double count);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(IDBArrayKey query, double count);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(com.user00.domjnate.api.ArrayBuffer query, double count);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(com.user00.domjnate.api.ArrayBufferView query, double count);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(com.user00.domjnate.api.Date query, double count);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(String query, double count);
@JsMethod(name="getAll")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAll(double query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys();
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(IDBKeyRange query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(IDBArrayKey query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(com.user00.domjnate.api.ArrayBuffer query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(com.user00.domjnate.api.ArrayBufferView query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(com.user00.domjnate.api.Date query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(String query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(double query);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(IDBKeyRange query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(IDBArrayKey query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(com.user00.domjnate.api.ArrayBuffer query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(com.user00.domjnate.api.ArrayBufferView query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(com.user00.domjnate.api.Date query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(String query, double count);
@JsMethod(name="getAllKeys")
IDBRequest<com.user00.domjnate.api.Array<java.lang.Object>> getAllKeys(double query, double count);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(IDBKeyRange key);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(IDBArrayKey key);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(com.user00.domjnate.api.Date key);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(String key);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(double key);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor();
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(IDBKeyRange range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(IDBArrayKey range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(com.user00.domjnate.api.ArrayBuffer range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(com.user00.domjnate.api.ArrayBufferView range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(com.user00.domjnate.api.Date range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(String range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(double range);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(IDBKeyRange range, String direction);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(IDBArrayKey range, String direction);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(com.user00.domjnate.api.ArrayBuffer range, String direction);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(com.user00.domjnate.api.ArrayBufferView range, String direction);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(com.user00.domjnate.api.Date range, String direction);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(String range, String direction);
@JsMethod(name="openCursor")
IDBRequest<IDBCursorWithValue> openCursor(double range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor();
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBKeyRange range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBArrayKey range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBuffer range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBufferView range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.Date range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(String range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(double range);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBKeyRange range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBArrayKey range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBuffer range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBufferView range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.Date range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(String range, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(double range, String direction);
@JsOverlay
public static IDBIndex getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBIndex", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBIndex.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBIndex val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBIndex", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBIndex _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBIndex");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBIndex.class);
}
}
