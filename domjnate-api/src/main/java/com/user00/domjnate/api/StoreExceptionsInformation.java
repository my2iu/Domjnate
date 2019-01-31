package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StoreExceptionsInformation")
public interface StoreExceptionsInformation extends ExceptionInformation
{
@JsProperty(name="detailURI")
String getDetailURI();
@JsProperty(name="detailURI")
void setDetailURI(String val);
@JsProperty(name="explanationString")
String getExplanationString();
@JsProperty(name="explanationString")
void setExplanationString(String val);
@JsProperty(name="siteName")
String getSiteName();
@JsProperty(name="siteName")
void setSiteName(String val);
}
