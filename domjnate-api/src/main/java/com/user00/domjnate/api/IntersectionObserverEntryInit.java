package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IntersectionObserverEntryInit")
public interface IntersectionObserverEntryInit
{
@JsProperty(name="boundingClientRect")
DOMRectInit getBoundingClientRect();
@JsProperty(name="boundingClientRect")
void setBoundingClientRect(DOMRectInit val);
@JsProperty(name="intersectionRect")
DOMRectInit getIntersectionRect();
@JsProperty(name="intersectionRect")
void setIntersectionRect(DOMRectInit val);
@JsProperty(name="isIntersecting")
boolean getIsIntersecting();
@JsProperty(name="isIntersecting")
void setIsIntersecting(boolean val);
@JsProperty(name="rootBounds")
DOMRectInit getRootBounds();
@JsProperty(name="rootBounds")
void setRootBounds(DOMRectInit val);
@JsProperty(name="target")
com.user00.domjnate.api.dom.Element getTarget();
@JsProperty(name="target")
void setTarget(com.user00.domjnate.api.dom.Element val);
@JsProperty(name="time")
double getTime();
@JsProperty(name="time")
void setTime(double val);
}
