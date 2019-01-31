package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GamepadEventInit")
public interface GamepadEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="gamepad")
Gamepad getGamepad();
@JsProperty(name="gamepad")
void setGamepad(Gamepad val);
}
