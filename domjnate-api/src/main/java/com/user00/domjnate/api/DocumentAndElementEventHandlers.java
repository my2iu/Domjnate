package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentAndElementEventHandlers")
public interface DocumentAndElementEventHandlers
{
@JsProperty(name="oncopy")
OncopyCallback getOncopy();
@JsProperty(name="oncopy")
void setOncopy(OncopyCallback val);
@JsProperty(name="oncut")
OncutCallback getOncut();
@JsProperty(name="oncut")
void setOncut(OncutCallback val);
@JsProperty(name="onpaste")
OnpasteCallback getOnpaste();
@JsProperty(name="onpaste")
void setOnpaste(OnpasteCallback val);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface OncopyCallback
{
java.lang.Object apply(ClipboardEvent ev);
}
@JsFunction public static interface OncutCallback
{
java.lang.Object apply(ClipboardEvent ev);
}
@JsFunction public static interface OnpasteCallback
{
java.lang.Object apply(ClipboardEvent ev);
}
}
