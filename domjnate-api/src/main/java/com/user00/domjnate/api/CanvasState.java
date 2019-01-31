package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasState")
public interface CanvasState
{
@JsMethod(name="restore")
void restore();
@JsMethod(name="save")
void save();
}
