package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CustomElementRegistry")
public interface CustomElementRegistry
{
@JsMethod(name="define")
void define(String name, Function constructor);
@JsMethod(name="define")
void define(String name, Function constructor, ElementDefinitionOptions options);
@JsMethod(name="get")
java.lang.Object get(String name);
@JsMethod(name="upgrade")
void upgrade(com.user00.domjnate.api.dom.Node root);
@JsMethod(name="whenDefined")
Promise<Void> whenDefined(String name);
@JsOverlay
public static CustomElementRegistry getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CustomElementRegistry", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CustomElementRegistry.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CustomElementRegistry val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CustomElementRegistry", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CustomElementRegistry _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CustomElementRegistry");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CustomElementRegistry.class);
}
}
