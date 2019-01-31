package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ANGLE_instanced_arrays")
public interface ANGLE_instanced_arrays
{
@JsProperty(name="VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
double VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE();
@JsMethod(name="drawArraysInstancedANGLE")
void drawArraysInstancedANGLE(double mode, double first, double count, double primcount);
@JsMethod(name="drawElementsInstancedANGLE")
void drawElementsInstancedANGLE(double mode, double count, double type, double offset, double primcount);
@JsMethod(name="vertexAttribDivisorANGLE")
void vertexAttribDivisorANGLE(double index, double divisor);
}
