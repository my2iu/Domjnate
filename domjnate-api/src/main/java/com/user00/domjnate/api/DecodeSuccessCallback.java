package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface DecodeSuccessCallback
{
void accept(com.user00.domjnate.api.webaudio.AudioBuffer decodedData);
}
