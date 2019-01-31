package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Transformer")
public interface Transformer<I,O> 
{
@JsProperty(name="flush")
TransformStreamDefaultControllerCallback<O> getFlush();
@JsProperty(name="flush")
void setFlush(TransformStreamDefaultControllerCallback<O> val);
@JsProperty(name="readableType")
Void getReadableType();
@JsProperty(name="readableType")
void setReadableType(Void val);
@JsProperty(name="start")
TransformStreamDefaultControllerCallback<O> getStart();
@JsProperty(name="start")
void setStart(TransformStreamDefaultControllerCallback<O> val);
@JsProperty(name="transform")
TransformStreamDefaultControllerTransformCallback<I, O> getTransform();
@JsProperty(name="transform")
void setTransform(TransformStreamDefaultControllerTransformCallback<I, O> val);
@JsProperty(name="writableType")
Void getWritableType();
@JsProperty(name="writableType")
void setWritableType(Void val);
}
