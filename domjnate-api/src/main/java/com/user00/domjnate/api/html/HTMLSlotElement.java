package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLSlotElement")
public interface HTMLSlotElement extends HTMLElement
{
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsMethod(name="assignedElements")
com.user00.domjnate.api.Array<com.user00.domjnate.api.dom.Element> assignedElements();
@JsMethod(name="assignedElements")
com.user00.domjnate.api.Array<com.user00.domjnate.api.dom.Element> assignedElements(com.user00.domjnate.api.AssignedNodesOptions options);
@JsMethod(name="assignedNodes")
com.user00.domjnate.api.Array<com.user00.domjnate.api.dom.Node> assignedNodes();
@JsMethod(name="assignedNodes")
com.user00.domjnate.api.Array<com.user00.domjnate.api.dom.Node> assignedNodes(com.user00.domjnate.api.AssignedNodesOptions options);
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
@JsOverlay
public static HTMLSlotElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLSlotElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLSlotElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLSlotElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLSlotElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLSlotElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLSlotElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLSlotElement.class);
}
}
