package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MutationRecord")
public interface MutationRecord
{
@JsProperty(name="addedNodes")
NodeList getAddedNodes();
@JsProperty(name="attributeName")
String getAttributeName();
@JsProperty(name="attributeNamespace")
String getAttributeNamespace();
@JsProperty(name="nextSibling")
Node getNextSibling();
@JsProperty(name="oldValue")
String getOldValue();
@JsProperty(name="previousSibling")
Node getPreviousSibling();
@JsProperty(name="removedNodes")
NodeList getRemovedNodes();
@JsProperty(name="target")
Node getTarget();
@JsProperty(name="type")
String getType();
@JsOverlay
public static MutationRecord getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationRecord", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MutationRecord.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MutationRecord val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MutationRecord", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MutationRecord _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MutationRecord");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MutationRecord.class);
}
}
