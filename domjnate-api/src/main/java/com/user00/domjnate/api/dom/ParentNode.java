package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ParentNode")
public interface ParentNode
{
@JsProperty(name="childElementCount")
double getChildElementCount();
@JsProperty(name="children")
HTMLCollection getChildren();
@JsProperty(name="firstElementChild")
Element getFirstElementChild();
@JsProperty(name="lastElementChild")
Element getLastElementChild();
@JsMethod(name="append")
void append(String... nodes);
@JsMethod(name="prepend")
void prepend(String... nodes);
// TODO: Suppressing generic keyof type parameter for querySelector
// TODO: Suppressing generic keyof type parameter for querySelector
@JsMethod(name="querySelector")
<E extends Element> E querySelector(String selectors);
// TODO: Suppressing generic keyof type parameter for querySelectorAll
// TODO: Suppressing generic keyof type parameter for querySelectorAll
@JsMethod(name="querySelectorAll")
<E extends Element> NodeListOf<E> querySelectorAll(String selectors);
}
