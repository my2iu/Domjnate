package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface TransformStreamDefaultControllerTransformCallback<I,O> 
{
java.lang.Object accept(I chunk, TransformStreamDefaultController<O> controller);
}
