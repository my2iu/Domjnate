package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ChildNode")
public interface ChildNode extends Node
{
@JsMethod(name="after")
void after(String... nodes);
@JsMethod(name="before")
void before(String... nodes);
@JsMethod(name="remove")
void remove();
@JsMethod(name="replaceWith")
void replaceWith(String... nodes);
}
