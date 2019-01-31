package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMException")
public interface DOMException
{
@JsProperty(name="code")
double getCode();
@JsProperty(name="message")
String getMessage();
@JsProperty(name="name")
String getName();
@JsProperty(name="ABORT_ERR")
double ABORT_ERR();
@JsProperty(name="DATA_CLONE_ERR")
double DATA_CLONE_ERR();
@JsProperty(name="DOMSTRING_SIZE_ERR")
double DOMSTRING_SIZE_ERR();
@JsProperty(name="HIERARCHY_REQUEST_ERR")
double HIERARCHY_REQUEST_ERR();
@JsProperty(name="INDEX_SIZE_ERR")
double INDEX_SIZE_ERR();
@JsProperty(name="INUSE_ATTRIBUTE_ERR")
double INUSE_ATTRIBUTE_ERR();
@JsProperty(name="INVALID_ACCESS_ERR")
double INVALID_ACCESS_ERR();
@JsProperty(name="INVALID_CHARACTER_ERR")
double INVALID_CHARACTER_ERR();
@JsProperty(name="INVALID_MODIFICATION_ERR")
double INVALID_MODIFICATION_ERR();
@JsProperty(name="INVALID_NODE_TYPE_ERR")
double INVALID_NODE_TYPE_ERR();
@JsProperty(name="INVALID_STATE_ERR")
double INVALID_STATE_ERR();
@JsProperty(name="NAMESPACE_ERR")
double NAMESPACE_ERR();
@JsProperty(name="NETWORK_ERR")
double NETWORK_ERR();
@JsProperty(name="NOT_FOUND_ERR")
double NOT_FOUND_ERR();
@JsProperty(name="NOT_SUPPORTED_ERR")
double NOT_SUPPORTED_ERR();
@JsProperty(name="NO_DATA_ALLOWED_ERR")
double NO_DATA_ALLOWED_ERR();
@JsProperty(name="NO_MODIFICATION_ALLOWED_ERR")
double NO_MODIFICATION_ALLOWED_ERR();
@JsProperty(name="QUOTA_EXCEEDED_ERR")
double QUOTA_EXCEEDED_ERR();
@JsProperty(name="SECURITY_ERR")
double SECURITY_ERR();
@JsProperty(name="SYNTAX_ERR")
double SYNTAX_ERR();
@JsProperty(name="TIMEOUT_ERR")
double TIMEOUT_ERR();
@JsProperty(name="TYPE_MISMATCH_ERR")
double TYPE_MISMATCH_ERR();
@JsProperty(name="URL_MISMATCH_ERR")
double URL_MISMATCH_ERR();
@JsProperty(name="VALIDATION_ERR")
double VALIDATION_ERR();
@JsProperty(name="WRONG_DOCUMENT_ERR")
double WRONG_DOCUMENT_ERR();
@JsOverlay
public static DOMException getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMException.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMException val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double ABORT_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ABORT_ERR", double.class);
}
@JsOverlay
public static double DATA_CLONE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DATA_CLONE_ERR", double.class);
}
@JsOverlay
public static double DOMSTRING_SIZE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOMSTRING_SIZE_ERR", double.class);
}
@JsOverlay
public static double HIERARCHY_REQUEST_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HIERARCHY_REQUEST_ERR", double.class);
}
@JsOverlay
public static double INDEX_SIZE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INDEX_SIZE_ERR", double.class);
}
@JsOverlay
public static double INUSE_ATTRIBUTE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INUSE_ATTRIBUTE_ERR", double.class);
}
@JsOverlay
public static double INVALID_ACCESS_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INVALID_ACCESS_ERR", double.class);
}
@JsOverlay
public static double INVALID_CHARACTER_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INVALID_CHARACTER_ERR", double.class);
}
@JsOverlay
public static double INVALID_MODIFICATION_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INVALID_MODIFICATION_ERR", double.class);
}
@JsOverlay
public static double INVALID_NODE_TYPE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INVALID_NODE_TYPE_ERR", double.class);
}
@JsOverlay
public static double INVALID_STATE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "INVALID_STATE_ERR", double.class);
}
@JsOverlay
public static double NAMESPACE_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NAMESPACE_ERR", double.class);
}
@JsOverlay
public static double NETWORK_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NETWORK_ERR", double.class);
}
@JsOverlay
public static double NOT_FOUND_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NOT_FOUND_ERR", double.class);
}
@JsOverlay
public static double NOT_SUPPORTED_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NOT_SUPPORTED_ERR", double.class);
}
@JsOverlay
public static double NO_DATA_ALLOWED_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NO_DATA_ALLOWED_ERR", double.class);
}
@JsOverlay
public static double NO_MODIFICATION_ALLOWED_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NO_MODIFICATION_ALLOWED_ERR", double.class);
}
@JsOverlay
public static double QUOTA_EXCEEDED_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "QUOTA_EXCEEDED_ERR", double.class);
}
@JsOverlay
public static double SECURITY_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SECURITY_ERR", double.class);
}
@JsOverlay
public static double SYNTAX_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SYNTAX_ERR", double.class);
}
@JsOverlay
public static double TIMEOUT_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TIMEOUT_ERR", double.class);
}
@JsOverlay
public static double TYPE_MISMATCH_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TYPE_MISMATCH_ERR", double.class);
}
@JsOverlay
public static double URL_MISMATCH_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "URL_MISMATCH_ERR", double.class);
}
@JsOverlay
public static double VALIDATION_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "VALIDATION_ERR", double.class);
}
@JsOverlay
public static double WRONG_DOCUMENT_ERR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMException", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "WRONG_DOCUMENT_ERR", double.class);
}
@JsOverlay
public static DOMException _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMException");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMException.class);
}
@JsOverlay
public static DOMException _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMException");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMException.class, message);
}
@JsOverlay
public static DOMException _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message, String name) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMException");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMException.class, message, name);
}
}
