package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Document")
public interface Document extends Node, com.user00.domjnate.api.NonElementParentNode, com.user00.domjnate.api.DocumentOrShadowRoot, ParentNode, com.user00.domjnate.api.GlobalEventHandlers, com.user00.domjnate.api.DocumentAndElementEventHandlers
{
@JsProperty(name="URL")
String URL();
@JsProperty(name="activeElement")
Element getActiveElement();
@JsProperty(name="alinkColor")
String getAlinkColor();
@JsProperty(name="alinkColor")
void setAlinkColor(String val);
@JsProperty(name="all")
com.user00.domjnate.api.html.HTMLAllCollection getAll();
@JsProperty(name="anchors")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLAnchorElement> getAnchors();
@JsProperty(name="applets")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLAppletElement> getApplets();
@JsProperty(name="bgColor")
String getBgColor();
@JsProperty(name="bgColor")
void setBgColor(String val);
@JsProperty(name="body")
com.user00.domjnate.api.html.HTMLElement getBody();
@JsProperty(name="body")
void setBody(com.user00.domjnate.api.html.HTMLElement val);
@JsProperty(name="characterSet")
String getCharacterSet();
@JsProperty(name="charset")
String getCharset();
@JsProperty(name="compatMode")
String getCompatMode();
@JsProperty(name="contentType")
String getContentType();
@JsProperty(name="cookie")
String getCookie();
@JsProperty(name="cookie")
void setCookie(String val);
@JsProperty(name="currentScript")
java.lang.Object getCurrentScript();
@JsProperty(name="defaultView")
com.user00.domjnate.api.Window getDefaultView();
@JsProperty(name="designMode")
String getDesignMode();
@JsProperty(name="designMode")
void setDesignMode(String val);
@JsProperty(name="dir")
String getDir();
@JsProperty(name="dir")
void setDir(String val);
@JsProperty(name="doctype")
DocumentType getDoctype();
@JsProperty(name="documentElement")
com.user00.domjnate.api.html.HTMLElement getDocumentElement();
@JsProperty(name="documentURI")
String getDocumentURI();
@JsProperty(name="domain")
String getDomain();
@JsProperty(name="domain")
void setDomain(String val);
@JsProperty(name="embeds")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLEmbedElement> getEmbeds();
@JsProperty(name="fgColor")
String getFgColor();
@JsProperty(name="fgColor")
void setFgColor(String val);
@JsProperty(name="forms")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLFormElement> getForms();
@JsProperty(name="fullscreen")
boolean getFullscreen();
@JsProperty(name="fullscreenEnabled")
boolean getFullscreenEnabled();
@JsProperty(name="head")
com.user00.domjnate.api.html.HTMLHeadElement getHead();
@JsProperty(name="hidden")
boolean getHidden();
@JsProperty(name="images")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLImageElement> getImages();
@JsProperty(name="implementation")
DOMImplementation getImplementation();
@JsProperty(name="inputEncoding")
String getInputEncoding();
@JsProperty(name="lastModified")
String getLastModified();
@JsProperty(name="linkColor")
String getLinkColor();
@JsProperty(name="linkColor")
void setLinkColor(String val);
@JsProperty(name="links")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLHyperlinkElementUtils> getLinks();
@JsProperty(name="location")
com.user00.domjnate.api.Location getLocation();
@JsProperty(name="location")
void setLocation(com.user00.domjnate.api.Location val);
@JsProperty(name="onfullscreenchange")
OnfullscreenchangeCallback getOnfullscreenchange();
@JsProperty(name="onfullscreenchange")
void setOnfullscreenchange(OnfullscreenchangeCallback val);
@JsProperty(name="onfullscreenerror")
OnfullscreenerrorCallback getOnfullscreenerror();
@JsProperty(name="onfullscreenerror")
void setOnfullscreenerror(OnfullscreenerrorCallback val);
@JsProperty(name="onreadystatechange")
OnreadystatechangeCallback getOnreadystatechange();
@JsProperty(name="onreadystatechange")
void setOnreadystatechange(OnreadystatechangeCallback val);
@JsProperty(name="onvisibilitychange")
OnvisibilitychangeCallback getOnvisibilitychange();
@JsProperty(name="onvisibilitychange")
void setOnvisibilitychange(OnvisibilitychangeCallback val);
@JsProperty(name="origin")
String getOrigin();
@JsProperty(name="plugins")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLEmbedElement> getPlugins();
@JsProperty(name="readyState")
String getReadyState();
@JsProperty(name="referrer")
String getReferrer();
@JsProperty(name="scripts")
HTMLCollectionOf<com.user00.domjnate.api.html.HTMLScriptElement> getScripts();
@JsProperty(name="scrollingElement")
Element getScrollingElement();
@JsProperty(name="timeline")
com.user00.domjnate.api.DocumentTimeline getTimeline();
@JsProperty(name="title")
String getTitle();
@JsProperty(name="title")
void setTitle(String val);
@JsProperty(name="visibilityState")
String getVisibilityState();
@JsProperty(name="vlinkColor")
String getVlinkColor();
@JsProperty(name="vlinkColor")
void setVlinkColor(String val);
@JsMethod(name="adoptNode")
<T extends Node> T adoptNode(T source);
@JsMethod(name="captureEvents")
void captureEvents();
@JsMethod(name="caretPositionFromPoint")
com.user00.domjnate.api.CaretPosition caretPositionFromPoint(double x, double y);
@JsMethod(name="caretRangeFromPoint")
Range caretRangeFromPoint(double x, double y);
@JsMethod(name="clear")
void clear();
@JsMethod(name="close")
void close();
@JsMethod(name="createAttribute")
Attr createAttribute(String localName);
@JsMethod(name="createAttributeNS")
Attr createAttributeNS(String namespace, String qualifiedName);
@JsMethod(name="createCDATASection")
CDATASection createCDATASection(String data);
@JsMethod(name="createComment")
Comment createComment(String data);
@JsMethod(name="createDocumentFragment")
DocumentFragment createDocumentFragment();
// TODO: Suppressing generic keyof type parameter for createElement
// TODO: Suppressing generic keyof type parameter for createElement
@JsMethod(name="createElement")
com.user00.domjnate.api.html.HTMLElement createElement(String tagName);
@JsMethod(name="createElement")
com.user00.domjnate.api.html.HTMLElement createElement(String tagName, ElementCreationOptions options);
@JsMethod(name="createElementNS")
Element createElementNS(String namespace, String qualifiedName);
@JsMethod(name="createElementNS")
Element createElementNS(String namespace, String qualifiedName, ElementCreationOptions options);
@JsMethod(name="createElementNS")
Element createElementNS(String namespace, String qualifiedName, String options);
@JsMethod(name="createEvent")
Event createEvent(String eventInterface);
@JsMethod(name="createNodeIterator")
NodeIterator createNodeIterator(Node root);
@JsMethod(name="createNodeIterator")
NodeIterator createNodeIterator(Node root, double whatToShow);
@JsMethod(name="createNodeIterator")
NodeIterator createNodeIterator(Node root, double whatToShow, NodeFilter filter);
@JsMethod(name="createProcessingInstruction")
ProcessingInstruction createProcessingInstruction(String target, String data);
@JsMethod(name="createRange")
Range createRange();
@JsMethod(name="createTextNode")
Text createTextNode(String data);
@JsMethod(name="createTouch")
com.user00.domjnate.api.Touch createTouch(com.user00.domjnate.api.Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY);
@JsMethod(name="createTouchList")
com.user00.domjnate.api.TouchList createTouchList(com.user00.domjnate.api.Touch... touches);
@JsMethod(name="createTreeWalker")
TreeWalker createTreeWalker(Node root);
@JsMethod(name="createTreeWalker")
TreeWalker createTreeWalker(Node root, double whatToShow);
@JsMethod(name="createTreeWalker")
TreeWalker createTreeWalker(Node root, double whatToShow, NodeFilter filter);
@JsMethod(name="elementFromPoint")
Element elementFromPoint(double x, double y);
@JsMethod(name="elementsFromPoint")
com.user00.domjnate.api.Array<Element> elementsFromPoint(double x, double y);
@JsMethod(name="evaluate")
com.user00.domjnate.api.XPathResult evaluate(String expression, Node contextNode, java.lang.Object resolver, double type, com.user00.domjnate.api.XPathResult result);
@JsMethod(name="evaluate")
com.user00.domjnate.api.XPathResult evaluate(String expression, Node contextNode, com.user00.domjnate.api.XPathNSResolver resolver, double type, com.user00.domjnate.api.XPathResult result);
@JsMethod(name="execCommand")
boolean execCommand(String commandId);
@JsMethod(name="execCommand")
boolean execCommand(String commandId, boolean showUI);
@JsMethod(name="execCommand")
boolean execCommand(String commandId, boolean showUI, String value);
@JsMethod(name="exitFullscreen")
com.user00.domjnate.api.Promise<Void> exitFullscreen();
@JsMethod(name="getAnimations")
com.user00.domjnate.api.Array<com.user00.domjnate.api.Animation> getAnimations();
@JsMethod(name="getElementById")
com.user00.domjnate.api.html.HTMLElement getElementById(String elementId);
@JsMethod(name="getElementsByClassName")
HTMLCollectionOf<Element> getElementsByClassName(String classNames);
@JsMethod(name="getElementsByName")
NodeListOf<com.user00.domjnate.api.html.HTMLElement> getElementsByName(String elementName);
// TODO: Suppressing generic keyof type parameter for getElementsByTagName
// TODO: Suppressing generic keyof type parameter for getElementsByTagName
@JsMethod(name="getElementsByTagName")
HTMLCollectionOf<Element> getElementsByTagName(String qualifiedName);
@JsMethod(name="getElementsByTagNameNS")
HTMLCollectionOf<Element> getElementsByTagNameNS(String namespaceURI, String localName);
@JsMethod(name="hasFocus")
boolean hasFocus();
@JsMethod(name="importNode")
<T extends Node> T importNode(T importedNode, boolean deep);
@JsMethod(name="open")
Document open();
@JsMethod(name="open")
Document open(String url);
@JsMethod(name="open")
Document open(String url, String name);
@JsMethod(name="open")
Document open(String url, String name, String features);
@JsMethod(name="open")
Document open(String url, String name, String features, boolean replace);
@JsMethod(name="queryCommandEnabled")
boolean queryCommandEnabled(String commandId);
@JsMethod(name="queryCommandIndeterm")
boolean queryCommandIndeterm(String commandId);
@JsMethod(name="queryCommandState")
boolean queryCommandState(String commandId);
@JsMethod(name="queryCommandSupported")
boolean queryCommandSupported(String commandId);
@JsMethod(name="queryCommandValue")
String queryCommandValue(String commandId);
@JsMethod(name="releaseEvents")
void releaseEvents();
@JsMethod(name="write")
void write(String... text);
@JsMethod(name="writeln")
void writeln(String... text);
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
@JsFunction public static interface OnreadystatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.ProgressEvent ev);
}
@JsFunction public static interface OnfullscreenchangeCallback
{
java.lang.Object apply(Event ev);
}
@JsFunction public static interface OnvisibilitychangeCallback
{
java.lang.Object apply(Event ev);
}
@JsOverlay
public static Document getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Document", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Document.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Document val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Document", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Document _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Document");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Document.class);
}
}
