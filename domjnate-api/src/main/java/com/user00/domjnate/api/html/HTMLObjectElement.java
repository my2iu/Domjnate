package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLObjectElement")
public interface HTMLObjectElement extends HTMLElement, GetSVGDocument
{
@JsProperty(name="BaseHref")
String getBaseHref();
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="archive")
String getArchive();
@JsProperty(name="archive")
void setArchive(String val);
@JsProperty(name="border")
String getBorder();
@JsProperty(name="border")
void setBorder(String val);
@JsProperty(name="code")
String getCode();
@JsProperty(name="code")
void setCode(String val);
@JsProperty(name="codeBase")
String getCodeBase();
@JsProperty(name="codeBase")
void setCodeBase(String val);
@JsProperty(name="codeType")
String getCodeType();
@JsProperty(name="codeType")
void setCodeType(String val);
@JsProperty(name="contentDocument")
com.user00.domjnate.api.dom.Document getContentDocument();
@JsProperty(name="data")
String getData();
@JsProperty(name="data")
void setData(String val);
@JsProperty(name="declare")
boolean getDeclare();
@JsProperty(name="declare")
void setDeclare(boolean val);
@JsProperty(name="form")
HTMLFormElement getForm();
@JsProperty(name="height")
String getHeight();
@JsProperty(name="height")
void setHeight(String val);
@JsProperty(name="hspace")
double getHspace();
@JsProperty(name="hspace")
void setHspace(double val);
@JsProperty(name="msPlayToDisabled")
boolean getMsPlayToDisabled();
@JsProperty(name="msPlayToDisabled")
void setMsPlayToDisabled(boolean val);
@JsProperty(name="msPlayToPreferredSourceUri")
String getMsPlayToPreferredSourceUri();
@JsProperty(name="msPlayToPreferredSourceUri")
void setMsPlayToPreferredSourceUri(String val);
@JsProperty(name="msPlayToPrimary")
boolean getMsPlayToPrimary();
@JsProperty(name="msPlayToPrimary")
void setMsPlayToPrimary(boolean val);
@JsProperty(name="msPlayToSource")
java.lang.Object getMsPlayToSource();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="standby")
String getStandby();
@JsProperty(name="standby")
void setStandby(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
@JsProperty(name="typemustmatch")
boolean getTypemustmatch();
@JsProperty(name="typemustmatch")
void setTypemustmatch(boolean val);
@JsProperty(name="useMap")
String getUseMap();
@JsProperty(name="useMap")
void setUseMap(String val);
@JsProperty(name="validationMessage")
String getValidationMessage();
@JsProperty(name="validity")
com.user00.domjnate.api.ValidityState getValidity();
@JsProperty(name="vspace")
double getVspace();
@JsProperty(name="vspace")
void setVspace(double val);
@JsProperty(name="width")
String getWidth();
@JsProperty(name="width")
void setWidth(String val);
@JsProperty(name="willValidate")
boolean getWillValidate();
@JsMethod(name="checkValidity")
boolean checkValidity();
@JsMethod(name="reportValidity")
boolean reportValidity();
@JsMethod(name="setCustomValidity")
void setCustomValidity(String error);
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
public static HTMLObjectElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLObjectElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLObjectElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLObjectElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLObjectElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLObjectElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLObjectElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLObjectElement.class);
}
}
