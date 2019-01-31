package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FileReader")
public interface FileReader extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="error")
com.user00.domjnate.api.dom.DOMException getError();
@JsProperty(name="onabort")
OnabortCallback getOnabort();
@JsProperty(name="onabort")
void setOnabort(OnabortCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onload")
OnloadCallback getOnload();
@JsProperty(name="onload")
void setOnload(OnloadCallback val);
@JsProperty(name="onloadend")
OnloadendCallback getOnloadend();
@JsProperty(name="onloadend")
void setOnloadend(OnloadendCallback val);
@JsProperty(name="onloadstart")
OnloadstartCallback getOnloadstart();
@JsProperty(name="onloadstart")
void setOnloadstart(OnloadstartCallback val);
@JsProperty(name="onprogress")
OnprogressCallback getOnprogress();
@JsProperty(name="onprogress")
void setOnprogress(OnprogressCallback val);
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="result")
java.lang.Object getResult();
@JsProperty(name="DONE")
double DONE();
@JsProperty(name="EMPTY")
double EMPTY();
@JsProperty(name="LOADING")
double LOADING();
@JsMethod(name="abort")
void abort();
@JsMethod(name="readAsArrayBuffer")
void readAsArrayBuffer(Blob blob);
@JsMethod(name="readAsBinaryString")
void readAsBinaryString(Blob blob);
@JsMethod(name="readAsDataURL")
void readAsDataURL(Blob blob);
@JsMethod(name="readAsText")
void readAsText(Blob blob);
@JsMethod(name="readAsText")
void readAsText(Blob blob, String encoding);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OnloadendCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OnloadstartCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OnprogressCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OnloadCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OnabortCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsOverlay
public static FileReader getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileReader", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", FileReader.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FileReader val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileReader", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double DONE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileReader", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DONE", double.class);
}
@JsOverlay
public static double EMPTY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileReader", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "EMPTY", double.class);
}
@JsOverlay
public static double LOADING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileReader", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LOADING", double.class);
}
@JsOverlay
public static FileReader _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FileReader");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FileReader.class);
}
}
