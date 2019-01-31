package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OfflineAudioContext")
public interface OfflineAudioContext extends BaseAudioContext
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="oncomplete")
OncompleteCallback getOncomplete();
@JsProperty(name="oncomplete")
void setOncomplete(OncompleteCallback val);
@JsMethod(name="startRendering")
com.user00.domjnate.api.Promise<AudioBuffer> startRendering();
@JsMethod(name="suspend")
com.user00.domjnate.api.Promise<Void> suspend(double suspendTime);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OncompleteCallback
{
java.lang.Object apply(OfflineAudioCompletionEvent ev);
}
@JsOverlay
public static OfflineAudioContext getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OfflineAudioContext", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", OfflineAudioContext.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, OfflineAudioContext val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OfflineAudioContext", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static OfflineAudioContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, OfflineAudioContextOptions contextOptions) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "OfflineAudioContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, OfflineAudioContext.class, contextOptions);
}
@JsOverlay
public static OfflineAudioContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double numberOfChannels, double length, double sampleRate) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "OfflineAudioContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, OfflineAudioContext.class, numberOfChannels, length, sampleRate);
}
}
