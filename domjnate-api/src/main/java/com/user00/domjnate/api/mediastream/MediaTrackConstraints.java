package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaTrackConstraints")
public interface MediaTrackConstraints extends MediaTrackConstraintSet
{
@JsProperty(name="advanced")
com.user00.domjnate.api.Array<MediaTrackConstraintSet> getAdvanced();
@JsProperty(name="advanced")
void setAdvanced(com.user00.domjnate.api.Array<MediaTrackConstraintSet> val);
}
