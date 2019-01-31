package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FocusNavigationEventInit")
public interface FocusNavigationEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="navigationReason")
String getNavigationReason();
@JsProperty(name="navigationReason")
void setNavigationReason(String val);
@JsProperty(name="originHeight")
Double getOriginHeight();
@JsProperty(name="originHeight")
void setOriginHeight(Double val);
@JsProperty(name="originLeft")
Double getOriginLeft();
@JsProperty(name="originLeft")
void setOriginLeft(Double val);
@JsProperty(name="originTop")
Double getOriginTop();
@JsProperty(name="originTop")
void setOriginTop(Double val);
@JsProperty(name="originWidth")
Double getOriginWidth();
@JsProperty(name="originWidth")
void setOriginWidth(Double val);
}
