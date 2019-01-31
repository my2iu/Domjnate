package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationEffect")
public interface AnimationEffect
{
@JsMethod(name="getComputedTiming")
ComputedEffectTiming getComputedTiming();
@JsMethod(name="getTiming")
EffectTiming getTiming();
@JsMethod(name="updateTiming")
void updateTiming();
@JsMethod(name="updateTiming")
void updateTiming(OptionalEffectTiming timing);
@JsOverlay
public static AnimationEffect getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationEffect", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AnimationEffect.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnimationEffect val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationEffect", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AnimationEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnimationEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnimationEffect.class);
}
}
