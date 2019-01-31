package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBObjectStore")
public interface IDBObjectStore
{
@JsProperty(name="autoIncrement")
boolean getAutoIncrement();
@JsProperty(name="indexNames")
com.user00.domjnate.api.dom.DOMStringList getIndexNames();
@JsProperty(name="keyPath")
java.lang.Object getKeyPath();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="transaction")
IDBTransaction getTransaction();
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, IDBKeyRange key);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, IDBArrayKey key);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, com.user00.domjnate.api.Date key);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, String key);
@JsMethod(name="add")
IDBRequest<java.lang.Object> add(java.lang.Object value, double key);
@JsMethod(name="clear")
IDBRequest<Void> clear();
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
@JsMethod(name="createIndex")
IDBIndex createIndex(String name, com.user00.domjnate.api.Array<String> keyPath);
@JsMethod(name="createIndex")
IDBIndex createIndex(String name, String keyPath);
@JsMethod(name="createIndex")
IDBIndex createIndex(String name, com.user00.domjnate.api.Array<String> keyPath, IDBIndexParameters options);
@JsMethod(name="createIndex")
IDBIndex createIndex(String name, String keyPath, IDBIndexParameters options);
@JsMethod(name="delete")
IDBRequest<Void> delete(IDBKeyRange key);
@JsMethod(name="delete")
IDBRequest<Void> delete(IDBArrayKey key);
@JsMethod(name="delete")
IDBRequest<Void> delete(com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="delete")
IDBRequest<Void> delete(com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="delete")
IDBRequest<Void> delete(com.user00.domjnate.api.Date key);
@JsMethod(name="delete")
IDBRequest<Void> delete(String key);
@JsMethod(name="delete")
IDBRequest<Void> delete(double key);
@JsMethod(name="deleteIndex")
void deleteIndex(String name);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(IDBKeyRange query);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(IDBArrayKey query);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(com.user00.domjnate.api.ArrayBuffer query);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(com.user00.domjnate.api.ArrayBufferView query);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(com.user00.domjnate.api.Date query);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(String query);
@JsMethod(name="get")
IDBRequest<java.lang.Object> get(double query);
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
IDBRequest<java.lang.Object> getKey(IDBKeyRange query);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(IDBArrayKey query);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(com.user00.domjnate.api.ArrayBuffer query);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(com.user00.domjnate.api.ArrayBufferView query);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(com.user00.domjnate.api.Date query);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(String query);
@JsMethod(name="getKey")
IDBRequest<java.lang.Object> getKey(double query);
@JsMethod(name="index")
IDBIndex index(String name);
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
IDBRequest<IDBCursor> openKeyCursor(IDBKeyRange query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBArrayKey query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBuffer query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBufferView query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.Date query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(String query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(double query);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBKeyRange query, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(IDBArrayKey query, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBuffer query, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.ArrayBufferView query, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(com.user00.domjnate.api.Date query, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(String query, String direction);
@JsMethod(name="openKeyCursor")
IDBRequest<IDBCursor> openKeyCursor(double query, String direction);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, IDBKeyRange key);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, IDBArrayKey key);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, com.user00.domjnate.api.Date key);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, String key);
@JsMethod(name="put")
IDBRequest<java.lang.Object> put(java.lang.Object value, double key);
@JsOverlay
public static IDBObjectStore getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBObjectStore", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBObjectStore.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBObjectStore val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBObjectStore", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBObjectStore _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBObjectStore");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBObjectStore.class);
}
}
