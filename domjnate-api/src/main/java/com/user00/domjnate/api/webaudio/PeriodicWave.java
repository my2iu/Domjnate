package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PeriodicWave")
public interface PeriodicWave
{
@JsOverlay
public static PeriodicWave getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PeriodicWave", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PeriodicWave.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PeriodicWave val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PeriodicWave", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PeriodicWave _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PeriodicWave");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PeriodicWave.class, context);
}
@JsOverlay
public static PeriodicWave _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, PeriodicWaveOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PeriodicWave");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PeriodicWave.class, context, options);
}
}
