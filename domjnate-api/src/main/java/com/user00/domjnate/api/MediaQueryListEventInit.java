package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaQueryListEventInit")
public interface MediaQueryListEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="matches")
Boolean getMatches();
@JsProperty(name="matches")
void setMatches(Boolean val);
@JsProperty(name="media")
String getMedia();
@JsProperty(name="media")
void setMedia(String val);
}
