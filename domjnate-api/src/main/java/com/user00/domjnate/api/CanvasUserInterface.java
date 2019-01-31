package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasUserInterface")
public interface CanvasUserInterface
{
@JsMethod(name="drawFocusIfNeeded")
void drawFocusIfNeeded(com.user00.domjnate.api.dom.Element element);
@JsMethod(name="drawFocusIfNeeded")
void drawFocusIfNeeded(Path2D path, com.user00.domjnate.api.dom.Element element);
@JsMethod(name="scrollPathIntoView")
void scrollPathIntoView();
@JsMethod(name="scrollPathIntoView")
void scrollPathIntoView(Path2D path);
}
