package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasFilters")
public interface CanvasFilters
{
@JsProperty(name="filter")
String getFilter();
@JsProperty(name="filter")
void setFilter(String val);
}
