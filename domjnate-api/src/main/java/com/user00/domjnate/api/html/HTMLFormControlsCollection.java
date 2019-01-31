package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLFormControlsCollection")
public interface HTMLFormControlsCollection extends com.user00.domjnate.api.dom.HTMLCollectionBase
{
@JsMethod(name="namedItem")
java.lang.Object namedItem(String name);
@JsOverlay
public static HTMLFormControlsCollection getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLFormControlsCollection", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLFormControlsCollection.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLFormControlsCollection val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLFormControlsCollection", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLFormControlsCollection _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLFormControlsCollection");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLFormControlsCollection.class);
}
}
