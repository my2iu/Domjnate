package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BhxBrowser")
public interface BhxBrowser
{
@JsProperty(name="lastError")
com.user00.domjnate.api.dom.DOMException getLastError();
@JsMethod(name="checkMatchesGlobExpression")
boolean checkMatchesGlobExpression(String pattern, String value);
@JsMethod(name="checkMatchesUriExpression")
boolean checkMatchesUriExpression(String pattern, String value);
@JsMethod(name="clearLastError")
void clearLastError();
@JsMethod(name="currentWindowId")
double currentWindowId();
@JsMethod(name="fireExtensionApiTelemetry")
void fireExtensionApiTelemetry(String functionName, boolean isSucceeded, boolean isSupported, String errorString);
@JsMethod(name="genericFunction")
void genericFunction(double functionId, java.lang.Object destination);
@JsMethod(name="genericFunction")
void genericFunction(double functionId, java.lang.Object destination, String parameters);
@JsMethod(name="genericFunction")
void genericFunction(double functionId, java.lang.Object destination, String parameters, double callbackId);
@JsMethod(name="genericSynchronousFunction")
String genericSynchronousFunction(double functionId);
@JsMethod(name="genericSynchronousFunction")
String genericSynchronousFunction(double functionId, String parameters);
@JsMethod(name="getExtensionId")
String getExtensionId();
@JsMethod(name="getThisAddress")
java.lang.Object getThisAddress();
@JsMethod(name="registerGenericFunctionCallbackHandler")
void registerGenericFunctionCallbackHandler(Function callbackHandler);
@JsMethod(name="registerGenericListenerHandler")
void registerGenericListenerHandler(Function eventHandler);
@JsMethod(name="setLastError")
void setLastError(String parameters);
@JsMethod(name="webPlatformGenericFunction")
void webPlatformGenericFunction(java.lang.Object destination);
@JsMethod(name="webPlatformGenericFunction")
void webPlatformGenericFunction(java.lang.Object destination, String parameters);
@JsMethod(name="webPlatformGenericFunction")
void webPlatformGenericFunction(java.lang.Object destination, String parameters, double callbackId);
@JsOverlay
public static BhxBrowser getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BhxBrowser", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", BhxBrowser.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BhxBrowser val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BhxBrowser", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static BhxBrowser _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "BhxBrowser");
  return com.user00.domjnate.util.Js.construct(_win, constructor, BhxBrowser.class);
}
}
