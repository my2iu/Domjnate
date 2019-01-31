package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IIRFilterOptions")
public interface IIRFilterOptions extends AudioNodeOptions
{
@JsProperty(name="feedback")
com.user00.domjnate.api.Array<Double> getFeedback();
@JsProperty(name="feedback")
void setFeedback(com.user00.domjnate.api.Array<Double> val);
@JsProperty(name="feedforward")
com.user00.domjnate.api.Array<Double> getFeedforward();
@JsProperty(name="feedforward")
void setFeedforward(com.user00.domjnate.api.Array<Double> val);
}
