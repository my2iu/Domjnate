package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface QueuingStrategySizeCallback<T> 
{
double accept(T chunk);
}
