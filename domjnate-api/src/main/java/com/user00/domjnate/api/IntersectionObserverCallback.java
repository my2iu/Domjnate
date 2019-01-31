package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface IntersectionObserverCallback
{
void accept(Array<IntersectionObserverEntry> entries, IntersectionObserver observer);
}
