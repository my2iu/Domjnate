package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DragEventInit")
public interface DragEventInit extends MouseEventInit
{
@JsProperty(name="dataTransfer")
DataTransfer getDataTransfer();
@JsProperty(name="dataTransfer")
void setDataTransfer(DataTransfer val);
}
