package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface NotificationPermissionCallback
{
void accept(String permission);
}
