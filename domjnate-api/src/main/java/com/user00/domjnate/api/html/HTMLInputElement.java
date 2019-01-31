package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLInputElement")
public interface HTMLInputElement extends HTMLElement
{
@JsProperty(name="accept")
String getAccept();
@JsProperty(name="accept")
void setAccept(String val);
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="alt")
String getAlt();
@JsProperty(name="alt")
void setAlt(String val);
@JsProperty(name="autocomplete")
String getAutocomplete();
@JsProperty(name="autocomplete")
void setAutocomplete(String val);
@JsProperty(name="autofocus")
boolean getAutofocus();
@JsProperty(name="autofocus")
void setAutofocus(boolean val);
@JsProperty(name="checked")
boolean getChecked();
@JsProperty(name="checked")
void setChecked(boolean val);
@JsProperty(name="defaultChecked")
boolean getDefaultChecked();
@JsProperty(name="defaultChecked")
void setDefaultChecked(boolean val);
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
@JsProperty(name="files")
com.user00.domjnate.api.FileList getFiles();
@JsProperty(name="files")
void setFiles(com.user00.domjnate.api.FileList val);
@JsProperty(name="form")
HTMLFormElement getForm();
@JsProperty(name="formAction")
String getFormAction();
@JsProperty(name="formAction")
void setFormAction(String val);
@JsProperty(name="formEnctype")
String getFormEnctype();
@JsProperty(name="formEnctype")
void setFormEnctype(String val);
@JsProperty(name="formMethod")
String getFormMethod();
@JsProperty(name="formMethod")
void setFormMethod(String val);
@JsProperty(name="formNoValidate")
boolean getFormNoValidate();
@JsProperty(name="formNoValidate")
void setFormNoValidate(boolean val);
@JsProperty(name="formTarget")
String getFormTarget();
@JsProperty(name="formTarget")
void setFormTarget(String val);
@JsProperty(name="height")
double getHeight();
@JsProperty(name="height")
void setHeight(double val);
@JsProperty(name="indeterminate")
boolean getIndeterminate();
@JsProperty(name="indeterminate")
void setIndeterminate(boolean val);
@JsProperty(name="labels")
com.user00.domjnate.api.dom.NodeListOf<HTMLLabelElement> getLabels();
@JsProperty(name="list")
HTMLElement getList();
@JsProperty(name="max")
String getMax();
@JsProperty(name="max")
void setMax(String val);
@JsProperty(name="maxLength")
double getMaxLength();
@JsProperty(name="maxLength")
void setMaxLength(double val);
@JsProperty(name="min")
String getMin();
@JsProperty(name="min")
void setMin(String val);
@JsProperty(name="minLength")
double getMinLength();
@JsProperty(name="minLength")
void setMinLength(double val);
@JsProperty(name="multiple")
boolean getMultiple();
@JsProperty(name="multiple")
void setMultiple(boolean val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="pattern")
String getPattern();
@JsProperty(name="pattern")
void setPattern(String val);
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
@JsProperty(name="selectionDirection")
String getSelectionDirection();
@JsProperty(name="selectionDirection")
void setSelectionDirection(String val);
@JsProperty(name="selectionEnd")
Double getSelectionEnd();
@JsProperty(name="selectionEnd")
void setSelectionEnd(Double val);
@JsProperty(name="selectionStart")
Double getSelectionStart();
@JsProperty(name="selectionStart")
void setSelectionStart(Double val);
@JsProperty(name="size")
double getSize();
@JsProperty(name="size")
void setSize(double val);
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="step")
String getStep();
@JsProperty(name="step")
void setStep(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
@JsProperty(name="useMap")
String getUseMap();
@JsProperty(name="useMap")
void setUseMap(String val);
@JsProperty(name="validationMessage")
String getValidationMessage();
@JsProperty(name="validity")
com.user00.domjnate.api.ValidityState getValidity();
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsProperty(name="valueAsDate")
java.lang.Object getValueAsDate();
@JsProperty(name="valueAsDate")
void setValueAsDate(java.lang.Object val);
@JsProperty(name="valueAsNumber")
double getValueAsNumber();
@JsProperty(name="valueAsNumber")
void setValueAsNumber(double val);
@JsProperty(name="width")
double getWidth();
@JsProperty(name="width")
void setWidth(double val);
@JsProperty(name="willValidate")
boolean getWillValidate();
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
@JsMethod(name="stepDown")
void stepDown();
@JsMethod(name="stepDown")
void stepDown(double n);
@JsMethod(name="stepUp")
void stepUp();
@JsMethod(name="stepUp")
void stepUp(double n);
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
public static HTMLInputElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLInputElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLInputElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLInputElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLInputElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLInputElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLInputElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLInputElement.class);
}
}
