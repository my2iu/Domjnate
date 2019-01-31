package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TouchEventInit")
public interface TouchEventInit extends EventModifierInit
{
@JsProperty(name="changedTouches")
Array<Touch> getChangedTouches();
@JsProperty(name="changedTouches")
void setChangedTouches(Array<Touch> val);
@JsProperty(name="targetTouches")
Array<Touch> getTargetTouches();
@JsProperty(name="targetTouches")
void setTargetTouches(Array<Touch> val);
@JsProperty(name="touches")
Array<Touch> getTouches();
@JsProperty(name="touches")
void setTouches(Array<Touch> val);
}
