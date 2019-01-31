package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLButtonElement")
public interface HTMLButtonElement extends HTMLElement
{
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
@JsProperty(name="labels")
com.user00.domjnate.api.dom.NodeListOf<HTMLLabelElement> getLabels();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
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
public static HTMLButtonElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLButtonElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLButtonElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLButtonElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLButtonElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLButtonElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLButtonElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLButtonElement.class);
}
}
