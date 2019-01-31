package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ApplicationCache")
public interface ApplicationCache extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="oncached")
OncachedCallback getOncached();
@JsProperty(name="oncached")
void setOncached(OncachedCallback val);
@JsProperty(name="onchecking")
OncheckingCallback getOnchecking();
@JsProperty(name="onchecking")
void setOnchecking(OncheckingCallback val);
@JsProperty(name="ondownloading")
OndownloadingCallback getOndownloading();
@JsProperty(name="ondownloading")
void setOndownloading(OndownloadingCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onnoupdate")
OnnoupdateCallback getOnnoupdate();
@JsProperty(name="onnoupdate")
void setOnnoupdate(OnnoupdateCallback val);
@JsProperty(name="onobsolete")
OnobsoleteCallback getOnobsolete();
@JsProperty(name="onobsolete")
void setOnobsolete(OnobsoleteCallback val);
@JsProperty(name="onprogress")
OnprogressCallback getOnprogress();
@JsProperty(name="onprogress")
void setOnprogress(OnprogressCallback val);
@JsProperty(name="onupdateready")
OnupdatereadyCallback getOnupdateready();
@JsProperty(name="onupdateready")
void setOnupdateready(OnupdatereadyCallback val);
@JsProperty(name="status")
double getStatus();
@JsProperty(name="CHECKING")
double CHECKING();
@JsProperty(name="DOWNLOADING")
double DOWNLOADING();
@JsProperty(name="IDLE")
double IDLE();
@JsProperty(name="OBSOLETE")
double OBSOLETE();
@JsProperty(name="UNCACHED")
double UNCACHED();
@JsProperty(name="UPDATEREADY")
double UPDATEREADY();
@JsMethod(name="abort")
void abort();
@JsMethod(name="swapCache")
void swapCache();
@JsMethod(name="update")
void update();
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
@JsFunction public static interface OndownloadingCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnnoupdateCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnupdatereadyCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnprogressCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OnobsoleteCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncachedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncheckingCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static ApplicationCache getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ApplicationCache.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ApplicationCache val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double CHECKING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CHECKING", double.class);
}
@JsOverlay
public static double DOWNLOADING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOWNLOADING", double.class);
}
@JsOverlay
public static double IDLE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "IDLE", double.class);
}
@JsOverlay
public static double OBSOLETE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "OBSOLETE", double.class);
}
@JsOverlay
public static double UNCACHED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "UNCACHED", double.class);
}
@JsOverlay
public static double UPDATEREADY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ApplicationCache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "UPDATEREADY", double.class);
}
@JsOverlay
public static ApplicationCache _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ApplicationCache");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ApplicationCache.class);
}
}
