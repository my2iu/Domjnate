package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IntersectionObserverInit")
public interface IntersectionObserverInit
{
@JsProperty(name="root")
com.user00.domjnate.api.dom.Element getRoot();
@JsProperty(name="root")
void setRoot(com.user00.domjnate.api.dom.Element val);
@JsProperty(name="rootMargin")
String getRootMargin();
@JsProperty(name="rootMargin")
void setRootMargin(String val);
@JsProperty(name="threshold")
java.lang.Object getThreshold();
@JsProperty(name="threshold")
void setThreshold(java.lang.Object val);
}
