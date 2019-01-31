package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface MutationCallback
{
void accept(Array<com.user00.domjnate.api.dom.MutationRecord> mutations, com.user00.domjnate.api.dom.MutationObserver observer);
}
