package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MutationEvent")
public interface MutationEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="attrChange")
double getAttrChange();
@JsProperty(name="attrName")
String getAttrName();
@JsProperty(name="newValue")
String getNewValue();
@JsProperty(name="prevValue")
String getPrevValue();
@JsProperty(name="relatedNode")
com.user00.domjnate.api.dom.Node getRelatedNode();
@JsProperty(name="ADDITION")
double ADDITION();
@JsProperty(name="MODIFICATION")
double MODIFICATION();
@JsProperty(name="REMOVAL")
double REMOVAL();
@JsMethod(name="initMutationEvent")
void initMutationEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, com.user00.domjnate.api.dom.Node relatedNodeArg, String prevValueArg, String newValueArg, String attrNameArg, double attrChangeArg);
@JsOverlay
public static MutationEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MutationEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MutationEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double ADDITION(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ADDITION", double.class);
}
@JsOverlay
public static double MODIFICATION(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MODIFICATION", double.class);
}
@JsOverlay
public static double REMOVAL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "REMOVAL", double.class);
}
@JsOverlay
public static MutationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MutationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MutationEvent.class);
}
}
