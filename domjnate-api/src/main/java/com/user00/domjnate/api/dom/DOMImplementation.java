package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMImplementation")
public interface DOMImplementation
{
@JsMethod(name="createDocument")
Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype);
@JsMethod(name="createDocumentType")
DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);
@JsMethod(name="createHTMLDocument")
Document createHTMLDocument();
@JsMethod(name="createHTMLDocument")
Document createHTMLDocument(String title);
@JsMethod(name="hasFeature")
boolean hasFeature(java.lang.Object... args);
@JsOverlay
public static DOMImplementation getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMImplementation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMImplementation.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMImplementation val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMImplementation", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMImplementation _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMImplementation");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMImplementation.class);
}
}
