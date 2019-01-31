package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface PerformanceObserverCallback
{
void accept(PerformanceObserverEntryList entries, PerformanceObserver observer);
}
