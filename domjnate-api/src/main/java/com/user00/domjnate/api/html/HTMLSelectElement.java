package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLSelectElement")
public interface HTMLSelectElement extends HTMLElement
{
@JsProperty(name="autocomplete")
String getAutocomplete();
@JsProperty(name="autocomplete")
void setAutocomplete(String val);
@JsProperty(name="autofocus")
boolean getAutofocus();
@JsProperty(name="autofocus")
void setAutofocus(boolean val);
@JsProperty(name="disabled")
boolean getDisabled();
@JsProperty(name="disabled")
void setDisabled(boolean val);
@JsProperty(name="form")
HTMLFormElement getForm();
@JsProperty(name="labels")
com.user00.domjnate.api.dom.NodeListOf<HTMLLabelElement> getLabels();
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
@JsProperty(name="multiple")
boolean getMultiple();
@JsProperty(name="multiple")
void setMultiple(boolean val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="options")
HTMLOptionsCollection getOptions();
@JsProperty(name="required")
boolean getRequired();
@JsProperty(name="required")
void setRequired(boolean val);
@JsProperty(name="selectedIndex")
double getSelectedIndex();
@JsProperty(name="selectedIndex")
void setSelectedIndex(double val);
@JsProperty(name="selectedOptions")
com.user00.domjnate.api.dom.HTMLCollectionOf<HTMLOptionElement> getSelectedOptions();
@JsProperty(name="size")
double getSize();
@JsProperty(name="size")
void setSize(double val);
@JsProperty(name="type")
String getType();
@JsProperty(name="validationMessage")
String getValidationMessage();
@JsProperty(name="validity")
com.user00.domjnate.api.ValidityState getValidity();
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsProperty(name="willValidate")
boolean getWillValidate();
@JsMethod(name="add")
void add(HTMLOptGroupElement element);
@JsMethod(name="add")
void add(HTMLOptionElement element);
@JsMethod(name="add")
void add(HTMLOptGroupElement element, Double before);
@JsMethod(name="add")
void add(HTMLOptionElement element, Double before);
@JsMethod(name="add")
void add(HTMLOptGroupElement element, HTMLElement before);
@JsMethod(name="add")
void add(HTMLOptionElement element, HTMLElement before);
@JsMethod(name="checkValidity")
boolean checkValidity();
@JsMethod(name="item")
com.user00.domjnate.api.dom.Element item(double index);
@JsMethod(name="namedItem")
HTMLOptionElement namedItem(String name);
@JsMethod(name="remove")
void remove();
@JsMethod(name="remove")
void remove(double index);
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
public default java.lang.Object get(double name) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getIndex(this, name, java.lang.Object.class);
}
@JsOverlay
public default void set(double name, java.lang.Object val) {
  com.user00.domjnate.util.Js.setIndex(this, name, val);
}
@JsOverlay
public static HTMLSelectElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLSelectElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLSelectElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLSelectElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLSelectElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLSelectElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLSelectElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLSelectElement.class);
}
}
