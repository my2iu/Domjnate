package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Animatable")
public interface Animatable
{
@JsMethod(name="animate")
Animation animate(PropertyIndexedKeyframes keyframes);
@JsMethod(name="animate")
Animation animate(Array<Keyframe> keyframes);
@JsMethod(name="animate")
Animation animate(PropertyIndexedKeyframes keyframes, KeyframeAnimationOptions options);
@JsMethod(name="animate")
Animation animate(Array<Keyframe> keyframes, KeyframeAnimationOptions options);
@JsMethod(name="animate")
Animation animate(PropertyIndexedKeyframes keyframes, double options);
@JsMethod(name="animate")
Animation animate(Array<Keyframe> keyframes, double options);
@JsMethod(name="getAnimations")
Array<Animation> getAnimations();
}
