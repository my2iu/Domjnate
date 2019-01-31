package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PropertyDescriptor")
public interface PropertyDescriptor
{
@JsProperty(name="configurable")
Boolean getConfigurable();
@JsProperty(name="configurable")
void setConfigurable(Boolean val);
@JsProperty(name="enumerable")
Boolean getEnumerable();
@JsProperty(name="enumerable")
void setEnumerable(Boolean val);
@JsProperty(name="value")
java.lang.Object getValue();
@JsProperty(name="value")
void setValue(java.lang.Object val);
@JsProperty(name="writable")
Boolean getWritable();
@JsProperty(name="writable")
void setWritable(Boolean val);
@JsProperty(name="get")
GetCallback getGet();
@JsProperty(name="get")
void setGet(GetCallback val);
@JsProperty(name="set")
SetCallback getSet();
@JsProperty(name="set")
void setSet(SetCallback val);
@JsFunction public static interface GetCallback
{
java.lang.Object apply();
}
@JsFunction public static interface SetCallback
{
void apply(java.lang.Object v);
}
}
