package com.user00.domjnate.api.html;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLMarqueeElement")
public interface HTMLMarqueeElement extends HTMLElement
{
@JsProperty(name="behavior")
String getBehavior();
@JsProperty(name="behavior")
void setBehavior(String val);
@JsProperty(name="bgColor")
String getBgColor();
@JsProperty(name="bgColor")
void setBgColor(String val);
@JsProperty(name="direction")
String getDirection();
@JsProperty(name="direction")
void setDirection(String val);
@JsProperty(name="height")
String getHeight();
@JsProperty(name="height")
void setHeight(String val);
@JsProperty(name="hspace")
double getHspace();
@JsProperty(name="hspace")
void setHspace(double val);
@JsProperty(name="loop")
double getLoop();
@JsProperty(name="loop")
void setLoop(double val);
@JsProperty(name="onbounce")
OnbounceCallback getOnbounce();
@JsProperty(name="onbounce")
void setOnbounce(OnbounceCallback val);
@JsProperty(name="onfinish")
OnfinishCallback getOnfinish();
@JsProperty(name="onfinish")
void setOnfinish(OnfinishCallback val);
@JsProperty(name="onstart")
OnstartCallback getOnstart();
@JsProperty(name="onstart")
void setOnstart(OnstartCallback val);
@JsProperty(name="scrollAmount")
double getScrollAmount();
@JsProperty(name="scrollAmount")
void setScrollAmount(double val);
@JsProperty(name="scrollDelay")
double getScrollDelay();
@JsProperty(name="scrollDelay")
void setScrollDelay(double val);
@JsProperty(name="trueSpeed")
boolean getTrueSpeed();
@JsProperty(name="trueSpeed")
void setTrueSpeed(boolean val);
@JsProperty(name="vspace")
double getVspace();
@JsProperty(name="vspace")
void setVspace(double val);
@JsProperty(name="width")
String getWidth();
@JsProperty(name="width")
void setWidth(String val);
@JsMethod(name="start")
void start();
@JsMethod(name="stop")
void stop();
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
@JsFunction public static interface OnbounceCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnstartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnfinishCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static HTMLMarqueeElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMarqueeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLMarqueeElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLMarqueeElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMarqueeElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLMarqueeElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLMarqueeElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLMarqueeElement.class);
}
}
