package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBCursor")
public interface IDBCursor
{
@JsProperty(name="direction")
String getDirection();
@JsProperty(name="key")
java.lang.Object getKey();
@JsProperty(name="primaryKey")
java.lang.Object getPrimaryKey();
@JsProperty(name="source")
java.lang.Object getSource();
@JsMethod(name="advance")
void advance(double count);
@JsMethod(name="continue")
void _continue();
@JsMethod(name="continue")
void _continue(IDBKeyRange key);
@JsMethod(name="continue")
void _continue(IDBArrayKey key);
@JsMethod(name="continue")
void _continue(com.user00.domjnate.api.ArrayBuffer key);
@JsMethod(name="continue")
void _continue(com.user00.domjnate.api.ArrayBufferView key);
@JsMethod(name="continue")
void _continue(com.user00.domjnate.api.Date key);
@JsMethod(name="continue")
void _continue(String key);
@JsMethod(name="continue")
void _continue(double key);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, IDBKeyRange primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, IDBArrayKey primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, com.user00.domjnate.api.ArrayBuffer primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, com.user00.domjnate.api.ArrayBufferView primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, com.user00.domjnate.api.Date primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, String primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBKeyRange key, double primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(IDBArrayKey key, double primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBuffer key, double primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.ArrayBufferView key, double primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(com.user00.domjnate.api.Date key, double primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(String key, double primaryKey);
@JsMethod(name="continuePrimaryKey")
void continuePrimaryKey(double key, double primaryKey);
@JsMethod(name="delete")
IDBRequest<Void> delete();
@JsMethod(name="update")
IDBRequest<java.lang.Object> update(java.lang.Object value);
@JsOverlay
public static IDBCursor getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBCursor", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBCursor.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBCursor val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBCursor", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBCursor _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBCursor");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBCursor.class);
}
}
