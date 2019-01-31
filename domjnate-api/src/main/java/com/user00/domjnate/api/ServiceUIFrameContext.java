package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ServiceUIFrameContext")
public interface ServiceUIFrameContext
{
@JsOverlay
public static String getCachedFrameMessage(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String key) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "ServiceUIFrameContext", "getCachedFrameMessage", String.class, key);
}
@JsOverlay
public static void postFrameMessage(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String key, String data) {
  com.user00.domjnate.util.Js.callStaticMethod(_win, "ServiceUIFrameContext", "postFrameMessage", void.class, key, data);
}
}
