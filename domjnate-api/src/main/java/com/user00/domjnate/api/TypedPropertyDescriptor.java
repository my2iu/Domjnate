package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TypedPropertyDescriptor")
public interface TypedPropertyDescriptor<T> 
{
@JsProperty(name="enumerable")
Boolean getEnumerable();
@JsProperty(name="enumerable")
void setEnumerable(Boolean val);
@JsProperty(name="configurable")
Boolean getConfigurable();
@JsProperty(name="configurable")
void setConfigurable(Boolean val);
@JsProperty(name="writable")
Boolean getWritable();
@JsProperty(name="writable")
void setWritable(Boolean val);
@JsProperty(name="value")
T getValue();
@JsProperty(name="value")
void setValue(T val);
@JsProperty(name="get")
GetCallback<T> getGet();
@JsProperty(name="get")
void setGet(GetCallback<T> val);
@JsProperty(name="set")
SetCallback<T> getSet();
@JsProperty(name="set")
void setSet(SetCallback<T> val);
@JsFunction public static interface GetCallback<T> 
{
T apply();
}
@JsFunction public static interface SetCallback<T> 
{
void apply(T value);
}
}
