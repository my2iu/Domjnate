package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBCursorWithValue")
public interface IDBCursorWithValue extends IDBCursor
{
@JsProperty(name="value")
java.lang.Object getValue();
@JsOverlay
public static IDBCursorWithValue getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBCursorWithValue", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBCursorWithValue.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBCursorWithValue val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBCursorWithValue", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBCursorWithValue _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBCursorWithValue");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBCursorWithValue.class);
}
}
