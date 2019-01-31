package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ExtensionScriptApis")
public interface ExtensionScriptApis
{
@JsMethod(name="extensionIdToShortId")
double extensionIdToShortId(String extensionId);
@JsMethod(name="fireExtensionApiTelemetry")
void fireExtensionApiTelemetry(String functionName, boolean isSucceeded, boolean isSupported, String errorString);
@JsMethod(name="genericFunction")
void genericFunction(java.lang.Object routerAddress);
@JsMethod(name="genericFunction")
void genericFunction(java.lang.Object routerAddress, String parameters);
@JsMethod(name="genericFunction")
void genericFunction(java.lang.Object routerAddress, String parameters, double callbackId);
@JsMethod(name="genericSynchronousFunction")
String genericSynchronousFunction(double functionId);
@JsMethod(name="genericSynchronousFunction")
String genericSynchronousFunction(double functionId, String parameters);
@JsMethod(name="genericWebRuntimeCallout")
void genericWebRuntimeCallout(java.lang.Object to, java.lang.Object from, String payload);
@JsMethod(name="getExtensionId")
String getExtensionId();
@JsMethod(name="registerGenericFunctionCallbackHandler")
void registerGenericFunctionCallbackHandler(Function callbackHandler);
@JsMethod(name="registerGenericPersistentCallbackHandler")
void registerGenericPersistentCallbackHandler(Function callbackHandler);
@JsMethod(name="registerWebRuntimeCallbackHandler")
java.lang.Object registerWebRuntimeCallbackHandler(Function handler);
@JsOverlay
public static ExtensionScriptApis getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ExtensionScriptApis", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ExtensionScriptApis.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ExtensionScriptApis val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ExtensionScriptApis", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ExtensionScriptApis _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ExtensionScriptApis");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ExtensionScriptApis.class);
}
}
