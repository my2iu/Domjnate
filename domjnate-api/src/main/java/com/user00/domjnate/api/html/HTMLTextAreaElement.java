package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLTextAreaElement")
public interface HTMLTextAreaElement extends HTMLElement
{
@JsProperty(name="autocomplete")
String getAutocomplete();
@JsProperty(name="autocomplete")
void setAutocomplete(String val);
@JsProperty(name="autofocus")
boolean getAutofocus();
@JsProperty(name="autofocus")
void setAutofocus(boolean val);
@JsProperty(name="cols")
double getCols();
@JsProperty(name="cols")
void setCols(double val);
@JsProperty(name="defaultValue")
String getDefaultValue();
@JsProperty(name="defaultValue")
void setDefaultValue(String val);
@JsProperty(name="dirName")
String getDirName();
@JsProperty(name="dirName")
void setDirName(String val);
@JsProperty(name="disabled")
boolean getDisabled();
@JsProperty(name="disabled")
void setDisabled(boolean val);
@JsProperty(name="form")
HTMLFormElement getForm();
@JsProperty(name="labels")
com.user00.domjnate.api.dom.NodeListOf<HTMLLabelElement> getLabels();
@JsProperty(name="maxLength")
double getMaxLength();
@JsProperty(name="maxLength")
void setMaxLength(double val);
@JsProperty(name="minLength")
double getMinLength();
@JsProperty(name="minLength")
void setMinLength(double val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="placeholder")
String getPlaceholder();
@JsProperty(name="placeholder")
void setPlaceholder(String val);
@JsProperty(name="readOnly")
boolean getReadOnly();
@JsProperty(name="readOnly")
void setReadOnly(boolean val);
@JsProperty(name="required")
boolean getRequired();
@JsProperty(name="required")
void setRequired(boolean val);
@JsProperty(name="rows")
double getRows();
@JsProperty(name="rows")
void setRows(double val);
@JsProperty(name="selectionDirection")
String getSelectionDirection();
@JsProperty(name="selectionDirection")
void setSelectionDirection(String val);
@JsProperty(name="selectionEnd")
double getSelectionEnd();
@JsProperty(name="selectionEnd")
void setSelectionEnd(double val);
@JsProperty(name="selectionStart")
double getSelectionStart();
@JsProperty(name="selectionStart")
void setSelectionStart(double val);
@JsProperty(name="textLength")
double getTextLength();
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
@JsProperty(name="wrap")
String getWrap();
@JsProperty(name="wrap")
void setWrap(String val);
@JsMethod(name="checkValidity")
boolean checkValidity();
@JsMethod(name="reportValidity")
boolean reportValidity();
@JsMethod(name="select")
void select();
@JsMethod(name="setCustomValidity")
void setCustomValidity(String error);
@JsMethod(name="setRangeText")
void setRangeText(String replacement);
@JsMethod(name="setRangeText")
void setRangeText(String replacement, double start, double end);
@JsMethod(name="setRangeText")
void setRangeText(String replacement, double start, double end, String selectionMode);
@JsMethod(name="setSelectionRange")
void setSelectionRange(double start, double end);
@JsMethod(name="setSelectionRange")
void setSelectionRange(double start, double end, String direction);
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
public static HTMLTextAreaElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTextAreaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLTextAreaElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLTextAreaElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLTextAreaElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLTextAreaElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLTextAreaElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLTextAreaElement.class);
}
}
