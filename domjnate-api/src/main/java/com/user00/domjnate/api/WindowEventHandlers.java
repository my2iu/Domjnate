package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowEventHandlers")
public interface WindowEventHandlers
{
@JsProperty(name="onafterprint")
OnafterprintCallback getOnafterprint();
@JsProperty(name="onafterprint")
void setOnafterprint(OnafterprintCallback val);
@JsProperty(name="onbeforeprint")
OnbeforeprintCallback getOnbeforeprint();
@JsProperty(name="onbeforeprint")
void setOnbeforeprint(OnbeforeprintCallback val);
@JsProperty(name="onbeforeunload")
OnbeforeunloadCallback getOnbeforeunload();
@JsProperty(name="onbeforeunload")
void setOnbeforeunload(OnbeforeunloadCallback val);
@JsProperty(name="onhashchange")
OnhashchangeCallback getOnhashchange();
@JsProperty(name="onhashchange")
void setOnhashchange(OnhashchangeCallback val);
@JsProperty(name="onlanguagechange")
OnlanguagechangeCallback getOnlanguagechange();
@JsProperty(name="onlanguagechange")
void setOnlanguagechange(OnlanguagechangeCallback val);
@JsProperty(name="onmessage")
OnmessageCallback getOnmessage();
@JsProperty(name="onmessage")
void setOnmessage(OnmessageCallback val);
@JsProperty(name="onmessageerror")
OnmessageerrorCallback getOnmessageerror();
@JsProperty(name="onmessageerror")
void setOnmessageerror(OnmessageerrorCallback val);
@JsProperty(name="onoffline")
OnofflineCallback getOnoffline();
@JsProperty(name="onoffline")
void setOnoffline(OnofflineCallback val);
@JsProperty(name="ononline")
OnonlineCallback getOnonline();
@JsProperty(name="ononline")
void setOnonline(OnonlineCallback val);
@JsProperty(name="onpagehide")
OnpagehideCallback getOnpagehide();
@JsProperty(name="onpagehide")
void setOnpagehide(OnpagehideCallback val);
@JsProperty(name="onpageshow")
OnpageshowCallback getOnpageshow();
@JsProperty(name="onpageshow")
void setOnpageshow(OnpageshowCallback val);
@JsProperty(name="onpopstate")
OnpopstateCallback getOnpopstate();
@JsProperty(name="onpopstate")
void setOnpopstate(OnpopstateCallback val);
@JsProperty(name="onrejectionhandled")
OnrejectionhandledCallback getOnrejectionhandled();
@JsProperty(name="onrejectionhandled")
void setOnrejectionhandled(OnrejectionhandledCallback val);
@JsProperty(name="onstorage")
OnstorageCallback getOnstorage();
@JsProperty(name="onstorage")
void setOnstorage(OnstorageCallback val);
@JsProperty(name="onunhandledrejection")
OnunhandledrejectionCallback getOnunhandledrejection();
@JsProperty(name="onunhandledrejection")
void setOnunhandledrejection(OnunhandledrejectionCallback val);
@JsProperty(name="onunload")
OnunloadCallback getOnunload();
@JsProperty(name="onunload")
void setOnunload(OnunloadCallback val);
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
@JsFunction public static interface OnbeforeunloadCallback
{
java.lang.Object apply(BeforeUnloadEvent ev);
}
@JsFunction public static interface OnpageshowCallback
{
java.lang.Object apply(PageTransitionEvent ev);
}
@JsFunction public static interface OnunhandledrejectionCallback
{
java.lang.Object apply(PromiseRejectionEvent ev);
}
@JsFunction public static interface OnhashchangeCallback
{
java.lang.Object apply(HashChangeEvent ev);
}
@JsFunction public static interface OnlanguagechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnonlineCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnrejectionhandledCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmessageCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsFunction public static interface OnmessageerrorCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsFunction public static interface OnunloadCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnpagehideCallback
{
java.lang.Object apply(PageTransitionEvent ev);
}
@JsFunction public static interface OnbeforeprintCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnafterprintCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnpopstateCallback
{
java.lang.Object apply(PopStateEvent ev);
}
@JsFunction public static interface OnofflineCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnstorageCallback
{
java.lang.Object apply(StorageEvent ev);
}
}
