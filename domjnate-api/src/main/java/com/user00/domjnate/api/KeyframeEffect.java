package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="KeyframeEffect")
public interface KeyframeEffect extends AnimationEffect
{
@JsProperty(name="composite")
String getComposite();
@JsProperty(name="composite")
void setComposite(String val);
@JsProperty(name="iterationComposite")
String getIterationComposite();
@JsProperty(name="iterationComposite")
void setIterationComposite(String val);
@JsProperty(name="target")
com.user00.domjnate.api.dom.Element getTarget();
@JsProperty(name="target")
void setTarget(com.user00.domjnate.api.dom.Element val);
@JsMethod(name="getKeyframes")
Array<ComputedKeyframe> getKeyframes();
@JsMethod(name="setKeyframes")
void setKeyframes(PropertyIndexedKeyframes keyframes);
@JsMethod(name="setKeyframes")
void setKeyframes(Array<Keyframe> keyframes);
@JsOverlay
public static KeyframeEffect getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyframeEffect", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", KeyframeEffect.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, KeyframeEffect val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyframeEffect", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.dom.Element target, PropertyIndexedKeyframes keyframes) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, target, keyframes);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.dom.Element target, Array<Keyframe> keyframes) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, target, keyframes);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.dom.Element target, PropertyIndexedKeyframes keyframes, KeyframeEffectOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, target, keyframes, options);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.dom.Element target, Array<Keyframe> keyframes, KeyframeEffectOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, target, keyframes, options);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.dom.Element target, PropertyIndexedKeyframes keyframes, double options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, target, keyframes, options);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.dom.Element target, Array<Keyframe> keyframes, double options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, target, keyframes, options);
}
@JsOverlay
public static KeyframeEffect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, KeyframeEffect source) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyframeEffect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyframeEffect.class, source);
}
}
