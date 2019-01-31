package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Account")
public interface Account
{
@JsProperty(name="displayName")
String getDisplayName();
@JsProperty(name="displayName")
void setDisplayName(String val);
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="imageURL")
String getImageURL();
@JsProperty(name="imageURL")
void setImageURL(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="rpDisplayName")
String getRpDisplayName();
@JsProperty(name="rpDisplayName")
void setRpDisplayName(String val);
}
