package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Node")
public interface Node extends EventTarget
{
@JsProperty(name="baseURI")
String getBaseURI();
@JsProperty(name="childNodes")
NodeListOf<ChildNode> getChildNodes();
@JsProperty(name="firstChild")
ChildNode getFirstChild();
@JsProperty(name="isConnected")
boolean getIsConnected();
@JsProperty(name="lastChild")
ChildNode getLastChild();
@JsProperty(name="namespaceURI")
String getNamespaceURI();
@JsProperty(name="nextSibling")
Node getNextSibling();
@JsProperty(name="nodeName")
String getNodeName();
@JsProperty(name="nodeType")
double getNodeType();
@JsProperty(name="nodeValue")
String getNodeValue();
@JsProperty(name="nodeValue")
void setNodeValue(String val);
@JsProperty(name="ownerDocument")
Document getOwnerDocument();
@JsProperty(name="parentElement")
com.user00.domjnate.api.html.HTMLElement getParentElement();
@JsProperty(name="parentNode")
java.lang.Object getParentNode();
@JsProperty(name="previousSibling")
Node getPreviousSibling();
@JsProperty(name="textContent")
String getTextContent();
@JsProperty(name="textContent")
void setTextContent(String val);
@JsProperty(name="ATTRIBUTE_NODE")
double ATTRIBUTE_NODE();
@JsProperty(name="CDATA_SECTION_NODE")
double CDATA_SECTION_NODE();
@JsProperty(name="COMMENT_NODE")
double COMMENT_NODE();
@JsProperty(name="DOCUMENT_FRAGMENT_NODE")
double DOCUMENT_FRAGMENT_NODE();
@JsProperty(name="DOCUMENT_NODE")
double DOCUMENT_NODE();
@JsProperty(name="DOCUMENT_POSITION_CONTAINED_BY")
double DOCUMENT_POSITION_CONTAINED_BY();
@JsProperty(name="DOCUMENT_POSITION_CONTAINS")
double DOCUMENT_POSITION_CONTAINS();
@JsProperty(name="DOCUMENT_POSITION_DISCONNECTED")
double DOCUMENT_POSITION_DISCONNECTED();
@JsProperty(name="DOCUMENT_POSITION_FOLLOWING")
double DOCUMENT_POSITION_FOLLOWING();
@JsProperty(name="DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
double DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC();
@JsProperty(name="DOCUMENT_POSITION_PRECEDING")
double DOCUMENT_POSITION_PRECEDING();
@JsProperty(name="DOCUMENT_TYPE_NODE")
double DOCUMENT_TYPE_NODE();
@JsProperty(name="ELEMENT_NODE")
double ELEMENT_NODE();
@JsProperty(name="ENTITY_NODE")
double ENTITY_NODE();
@JsProperty(name="ENTITY_REFERENCE_NODE")
double ENTITY_REFERENCE_NODE();
@JsProperty(name="NOTATION_NODE")
double NOTATION_NODE();
@JsProperty(name="PROCESSING_INSTRUCTION_NODE")
double PROCESSING_INSTRUCTION_NODE();
@JsProperty(name="TEXT_NODE")
double TEXT_NODE();
@JsMethod(name="appendChild")
<T extends Node> T appendChild(T newChild);
@JsMethod(name="cloneNode")
Node cloneNode();
@JsMethod(name="cloneNode")
Node cloneNode(boolean deep);
@JsMethod(name="compareDocumentPosition")
double compareDocumentPosition(Node other);
@JsMethod(name="contains")
boolean contains(Node other);
@JsMethod(name="getRootNode")
Node getRootNode();
@JsMethod(name="getRootNode")
Node getRootNode(com.user00.domjnate.api.GetRootNodeOptions options);
@JsMethod(name="hasChildNodes")
boolean hasChildNodes();
@JsMethod(name="insertBefore")
<T extends Node> T insertBefore(T newChild, Node refChild);
@JsMethod(name="isDefaultNamespace")
boolean isDefaultNamespace(String namespace);
@JsMethod(name="isEqualNode")
boolean isEqualNode(Node otherNode);
@JsMethod(name="isSameNode")
boolean isSameNode(Node otherNode);
@JsMethod(name="lookupNamespaceURI")
String lookupNamespaceURI(String prefix);
@JsMethod(name="lookupPrefix")
String lookupPrefix(String namespace);
@JsMethod(name="normalize")
void normalize();
@JsMethod(name="removeChild")
<T extends Node> T removeChild(T oldChild);
@JsMethod(name="replaceChild")
<T extends Node> T replaceChild(Node newChild, T oldChild);
@JsOverlay
public static Node getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Node.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Node val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double ATTRIBUTE_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ATTRIBUTE_NODE", double.class);
}
@JsOverlay
public static double CDATA_SECTION_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CDATA_SECTION_NODE", double.class);
}
@JsOverlay
public static double COMMENT_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "COMMENT_NODE", double.class);
}
@JsOverlay
public static double DOCUMENT_FRAGMENT_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_FRAGMENT_NODE", double.class);
}
@JsOverlay
public static double DOCUMENT_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_NODE", double.class);
}
@JsOverlay
public static double DOCUMENT_POSITION_CONTAINED_BY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_POSITION_CONTAINED_BY", double.class);
}
@JsOverlay
public static double DOCUMENT_POSITION_CONTAINS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_POSITION_CONTAINS", double.class);
}
@JsOverlay
public static double DOCUMENT_POSITION_DISCONNECTED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_POSITION_DISCONNECTED", double.class);
}
@JsOverlay
public static double DOCUMENT_POSITION_FOLLOWING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_POSITION_FOLLOWING", double.class);
}
@JsOverlay
public static double DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", double.class);
}
@JsOverlay
public static double DOCUMENT_POSITION_PRECEDING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_POSITION_PRECEDING", double.class);
}
@JsOverlay
public static double DOCUMENT_TYPE_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOCUMENT_TYPE_NODE", double.class);
}
@JsOverlay
public static double ELEMENT_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ELEMENT_NODE", double.class);
}
@JsOverlay
public static double ENTITY_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ENTITY_NODE", double.class);
}
@JsOverlay
public static double ENTITY_REFERENCE_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ENTITY_REFERENCE_NODE", double.class);
}
@JsOverlay
public static double NOTATION_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NOTATION_NODE", double.class);
}
@JsOverlay
public static double PROCESSING_INSTRUCTION_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PROCESSING_INSTRUCTION_NODE", double.class);
}
@JsOverlay
public static double TEXT_NODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Node", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXT_NODE", double.class);
}
@JsOverlay
public static Node _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Node");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Node.class);
}
}
