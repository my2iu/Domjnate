package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioParamDescriptor")
public interface AudioParamDescriptor
{
@JsProperty(name="automationRate")
String getAutomationRate();
@JsProperty(name="automationRate")
void setAutomationRate(String val);
@JsProperty(name="defaultValue")
Double getDefaultValue();
@JsProperty(name="defaultValue")
void setDefaultValue(Double val);
@JsProperty(name="maxValue")
Double getMaxValue();
@JsProperty(name="maxValue")
void setMaxValue(Double val);
@JsProperty(name="minValue")
Double getMinValue();
@JsProperty(name="minValue")
void setMinValue(Double val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
}
