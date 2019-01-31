package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OES_vertex_array_object")
public interface OES_vertex_array_object
{
@JsProperty(name="VERTEX_ARRAY_BINDING_OES")
double VERTEX_ARRAY_BINDING_OES();
@JsMethod(name="bindVertexArrayOES")
void bindVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
@JsMethod(name="createVertexArrayOES")
WebGLVertexArrayObjectOES createVertexArrayOES();
@JsMethod(name="deleteVertexArrayOES")
void deleteVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
@JsMethod(name="isVertexArrayOES")
boolean isVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
}
