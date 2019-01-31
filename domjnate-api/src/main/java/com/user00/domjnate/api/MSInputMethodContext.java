package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSInputMethodContext")
public interface MSInputMethodContext extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="compositionEndOffset")
double getCompositionEndOffset();
@JsProperty(name="compositionStartOffset")
double getCompositionStartOffset();
@JsProperty(name="oncandidatewindowhide")
OncandidatewindowhideCallback getOncandidatewindowhide();
@JsProperty(name="oncandidatewindowhide")
void setOncandidatewindowhide(OncandidatewindowhideCallback val);
@JsProperty(name="oncandidatewindowshow")
OncandidatewindowshowCallback getOncandidatewindowshow();
@JsProperty(name="oncandidatewindowshow")
void setOncandidatewindowshow(OncandidatewindowshowCallback val);
@JsProperty(name="oncandidatewindowupdate")
OncandidatewindowupdateCallback getOncandidatewindowupdate();
@JsProperty(name="oncandidatewindowupdate")
void setOncandidatewindowupdate(OncandidatewindowupdateCallback val);
@JsProperty(name="target")
com.user00.domjnate.api.html.HTMLElement getTarget();
@JsMethod(name="getCandidateWindowClientRect")
ClientRect getCandidateWindowClientRect();
@JsMethod(name="getCompositionAlternatives")
Array<String> getCompositionAlternatives();
@JsMethod(name="hasComposition")
boolean hasComposition();
@JsMethod(name="isCandidateWindowVisible")
boolean isCandidateWindowVisible();
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
@JsFunction public static interface OncandidatewindowshowCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncandidatewindowupdateCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncandidatewindowhideCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static MSInputMethodContext getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSInputMethodContext", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSInputMethodContext.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSInputMethodContext val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSInputMethodContext", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSInputMethodContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSInputMethodContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSInputMethodContext.class);
}
}
