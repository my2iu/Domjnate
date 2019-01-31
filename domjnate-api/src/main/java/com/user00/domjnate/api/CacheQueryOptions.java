package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CacheQueryOptions")
public interface CacheQueryOptions
{
@JsProperty(name="cacheName")
String getCacheName();
@JsProperty(name="cacheName")
void setCacheName(String val);
@JsProperty(name="ignoreMethod")
Boolean getIgnoreMethod();
@JsProperty(name="ignoreMethod")
void setIgnoreMethod(Boolean val);
@JsProperty(name="ignoreSearch")
Boolean getIgnoreSearch();
@JsProperty(name="ignoreSearch")
void setIgnoreSearch(Boolean val);
@JsProperty(name="ignoreVary")
Boolean getIgnoreVary();
@JsProperty(name="ignoreVary")
void setIgnoreVary(Boolean val);
}
