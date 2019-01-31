package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Element")
public interface Element extends Node, ParentNode, NonDocumentTypeChildNode, ChildNode, com.user00.domjnate.api.Slotable, com.user00.domjnate.api.Animatable
{
@JsProperty(name="assignedSlot")
com.user00.domjnate.api.html.HTMLSlotElement getAssignedSlot();
@JsProperty(name="attributes")
NamedNodeMap getAttributes();
@JsProperty(name="classList")
DOMTokenList getClassList();
@JsProperty(name="className")
String getClassName();
@JsProperty(name="className")
void setClassName(String val);
@JsProperty(name="clientHeight")
double getClientHeight();
@JsProperty(name="clientLeft")
double getClientLeft();
@JsProperty(name="clientTop")
double getClientTop();
@JsProperty(name="clientWidth")
double getClientWidth();
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="innerHTML")
String getInnerHTML();
@JsProperty(name="innerHTML")
void setInnerHTML(String val);
@JsProperty(name="localName")
String getLocalName();
@JsProperty(name="namespaceURI")
String getNamespaceURI();
@JsProperty(name="onfullscreenchange")
OnfullscreenchangeCallback getOnfullscreenchange();
@JsProperty(name="onfullscreenchange")
void setOnfullscreenchange(OnfullscreenchangeCallback val);
@JsProperty(name="onfullscreenerror")
OnfullscreenerrorCallback getOnfullscreenerror();
@JsProperty(name="onfullscreenerror")
void setOnfullscreenerror(OnfullscreenerrorCallback val);
@JsProperty(name="outerHTML")
String getOuterHTML();
@JsProperty(name="outerHTML")
void setOuterHTML(String val);
@JsProperty(name="prefix")
String getPrefix();
@JsProperty(name="scrollHeight")
double getScrollHeight();
@JsProperty(name="scrollLeft")
double getScrollLeft();
@JsProperty(name="scrollLeft")
void setScrollLeft(double val);
@JsProperty(name="scrollTop")
double getScrollTop();
@JsProperty(name="scrollTop")
void setScrollTop(double val);
@JsProperty(name="scrollWidth")
double getScrollWidth();
@JsProperty(name="shadowRoot")
com.user00.domjnate.api.ShadowRoot getShadowRoot();
@JsProperty(name="slot")
String getSlot();
@JsProperty(name="slot")
void setSlot(String val);
@JsProperty(name="tagName")
String getTagName();
@JsMethod(name="attachShadow")
com.user00.domjnate.api.ShadowRoot attachShadow(com.user00.domjnate.api.ShadowRootInit shadowRootInitDict);
// TODO: Suppressing generic keyof type parameter for closest
// TODO: Suppressing generic keyof type parameter for closest
@JsMethod(name="closest")
Element closest(String selector);
@JsMethod(name="getAttribute")
String getAttribute(String qualifiedName);
@JsMethod(name="getAttributeNS")
String getAttributeNS(String namespace, String localName);
@JsMethod(name="getAttributeNames")
com.user00.domjnate.api.Array<String> getAttributeNames();
@JsMethod(name="getAttributeNode")
Attr getAttributeNode(String name);
@JsMethod(name="getAttributeNodeNS")
Attr getAttributeNodeNS(String namespaceURI, String localName);
@JsMethod(name="getBoundingClientRect")
java.lang.Object getBoundingClientRect();
@JsMethod(name="getClientRects")
java.lang.Object getClientRects();
@JsMethod(name="getElementsByClassName")
HTMLCollectionOf<Element> getElementsByClassName(String classNames);
// TODO: Suppressing generic keyof type parameter for getElementsByTagName
// TODO: Suppressing generic keyof type parameter for getElementsByTagName
@JsMethod(name="getElementsByTagName")
HTMLCollectionOf<Element> getElementsByTagName(String qualifiedName);
@JsMethod(name="getElementsByTagNameNS")
HTMLCollectionOf<Element> getElementsByTagNameNS(String namespaceURI, String localName);
@JsMethod(name="hasAttribute")
boolean hasAttribute(String qualifiedName);
@JsMethod(name="hasAttributeNS")
boolean hasAttributeNS(String namespace, String localName);
@JsMethod(name="hasAttributes")
boolean hasAttributes();
@JsMethod(name="hasPointerCapture")
boolean hasPointerCapture(double pointerId);
@JsMethod(name="insertAdjacentElement")
Element insertAdjacentElement(String position, Element insertedElement);
@JsMethod(name="insertAdjacentHTML")
void insertAdjacentHTML(String where, String html);
@JsMethod(name="insertAdjacentText")
void insertAdjacentText(String where, String text);
@JsMethod(name="matches")
boolean matches(String selectors);
@JsMethod(name="msGetRegionContent")
java.lang.Object msGetRegionContent();
@JsMethod(name="releasePointerCapture")
void releasePointerCapture(double pointerId);
@JsMethod(name="removeAttribute")
void removeAttribute(String qualifiedName);
@JsMethod(name="removeAttributeNS")
void removeAttributeNS(String namespace, String localName);
@JsMethod(name="removeAttributeNode")
Attr removeAttributeNode(Attr attr);
@JsMethod(name="requestFullscreen")
com.user00.domjnate.api.Promise<Void> requestFullscreen();
@JsMethod(name="scroll")
void scroll();
@JsMethod(name="scroll")
void scroll(com.user00.domjnate.api.ScrollToOptions options);
@JsMethod(name="scroll")
void scroll(double x, double y);
@JsMethod(name="scrollBy")
void scrollBy();
@JsMethod(name="scrollBy")
void scrollBy(com.user00.domjnate.api.ScrollToOptions options);
@JsMethod(name="scrollBy")
void scrollBy(double x, double y);
@JsMethod(name="scrollIntoView")
void scrollIntoView();
@JsMethod(name="scrollIntoView")
void scrollIntoView(com.user00.domjnate.api.ScrollIntoViewOptions arg);
@JsMethod(name="scrollIntoView")
void scrollIntoView(boolean arg);
@JsMethod(name="scrollTo")
void scrollTo();
@JsMethod(name="scrollTo")
void scrollTo(com.user00.domjnate.api.ScrollToOptions options);
@JsMethod(name="scrollTo")
void scrollTo(double x, double y);
@JsMethod(name="setAttribute")
void setAttribute(String qualifiedName, String value);
@JsMethod(name="setAttributeNS")
void setAttributeNS(String namespace, String qualifiedName, String value);
@JsMethod(name="setAttributeNode")
Attr setAttributeNode(Attr attr);
@JsMethod(name="setAttributeNodeNS")
Attr setAttributeNodeNS(Attr attr);
@JsMethod(name="setPointerCapture")
void setPointerCapture(double pointerId);
@JsMethod(name="toggleAttribute")
boolean toggleAttribute(String qualifiedName);
@JsMethod(name="toggleAttribute")
boolean toggleAttribute(String qualifiedName, boolean force);
@JsMethod(name="webkitMatchesSelector")
boolean webkitMatchesSelector(String selectors);
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
@JsFunction public static interface OnfullscreenerrorCallback
{
java.lang.Object apply(Event ev);
}
@JsFunction public static interface OnfullscreenchangeCallback
{
java.lang.Object apply(Event ev);
}
@JsOverlay
public static Element getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Element", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Element.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Element val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Element", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Element _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Element");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Element.class);
}
}
