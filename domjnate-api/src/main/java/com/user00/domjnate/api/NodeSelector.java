package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NodeSelector")
public interface NodeSelector
{
// TODO: Suppressing generic keyof type parameter for querySelector
// TODO: Suppressing generic keyof type parameter for querySelector
@JsMethod(name="querySelector")
<E extends com.user00.domjnate.api.dom.Element> E querySelector(String selectors);
// TODO: Suppressing generic keyof type parameter for querySelectorAll
// TODO: Suppressing generic keyof type parameter for querySelectorAll
@JsMethod(name="querySelectorAll")
<E extends com.user00.domjnate.api.dom.Element> com.user00.domjnate.api.dom.NodeListOf<E> querySelectorAll(String selectors);
}
