package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSStyleSheet")
public interface CSSStyleSheet extends StyleSheet
{
@JsProperty(name="cssRules")
CSSRuleList getCssRules();
@JsProperty(name="cssText")
String getCssText();
@JsProperty(name="cssText")
void setCssText(String val);
@JsProperty(name="id")
String getId();
@JsProperty(name="imports")
StyleSheetList getImports();
@JsProperty(name="isAlternate")
boolean getIsAlternate();
@JsProperty(name="isPrefAlternate")
boolean getIsPrefAlternate();
@JsProperty(name="ownerRule")
CSSRule getOwnerRule();
@JsProperty(name="owningElement")
com.user00.domjnate.api.dom.Element getOwningElement();
@JsProperty(name="pages")
java.lang.Object getPages();
@JsProperty(name="readOnly")
boolean getReadOnly();
@JsProperty(name="rules")
CSSRuleList getRules();
@JsMethod(name="addImport")
double addImport(String bstrURL);
@JsMethod(name="addImport")
double addImport(String bstrURL, double lIndex);
@JsMethod(name="addPageRule")
double addPageRule(String bstrSelector, String bstrStyle);
@JsMethod(name="addPageRule")
double addPageRule(String bstrSelector, String bstrStyle, double lIndex);
@JsMethod(name="addRule")
double addRule(String bstrSelector);
@JsMethod(name="addRule")
double addRule(String bstrSelector, String bstrStyle);
@JsMethod(name="addRule")
double addRule(String bstrSelector, String bstrStyle, double lIndex);
@JsMethod(name="deleteRule")
void deleteRule();
@JsMethod(name="deleteRule")
void deleteRule(double index);
@JsMethod(name="insertRule")
double insertRule(String rule);
@JsMethod(name="insertRule")
double insertRule(String rule, double index);
@JsMethod(name="removeImport")
void removeImport(double lIndex);
@JsMethod(name="removeRule")
void removeRule(double lIndex);
@JsOverlay
public static CSSStyleSheet getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSStyleSheet", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSStyleSheet.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSStyleSheet val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSStyleSheet", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSStyleSheet _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSStyleSheet");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSStyleSheet.class);
}
}
