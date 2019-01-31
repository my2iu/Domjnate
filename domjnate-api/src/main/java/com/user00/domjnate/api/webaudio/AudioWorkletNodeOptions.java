package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioWorkletNodeOptions")
public interface AudioWorkletNodeOptions extends AudioNodeOptions
{
@JsProperty(name="numberOfInputs")
Double getNumberOfInputs();
@JsProperty(name="numberOfInputs")
void setNumberOfInputs(Double val);
@JsProperty(name="numberOfOutputs")
Double getNumberOfOutputs();
@JsProperty(name="numberOfOutputs")
void setNumberOfOutputs(Double val);
@JsProperty(name="outputChannelCount")
com.user00.domjnate.api.Array<Double> getOutputChannelCount();
@JsProperty(name="outputChannelCount")
void setOutputChannelCount(com.user00.domjnate.api.Array<Double> val);
@JsProperty(name="parameterData")
java.lang.Object getParameterData();
@JsProperty(name="parameterData")
void setParameterData(java.lang.Object val);
@JsProperty(name="processorOptions")
java.lang.Object getProcessorOptions();
@JsProperty(name="processorOptions")
void setProcessorOptions(java.lang.Object val);
}
