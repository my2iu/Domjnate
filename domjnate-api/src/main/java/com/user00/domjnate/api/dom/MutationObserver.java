package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MutationObserver")
public interface MutationObserver
{
@JsMethod(name="disconnect")
void disconnect();
@JsMethod(name="observe")
void observe(Node target);
@JsMethod(name="observe")
void observe(Node target, MutationObserverInit options);
@JsMethod(name="takeRecords")
com.user00.domjnate.api.Array<MutationRecord> takeRecords();
@JsOverlay
public static MutationObserver getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationObserver", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MutationObserver.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MutationObserver val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationObserver", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MutationObserver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.MutationCallback callback) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MutationObserver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MutationObserver.class, callback);
}
}
