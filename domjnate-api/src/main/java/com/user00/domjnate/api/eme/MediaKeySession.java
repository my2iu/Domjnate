package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeySession")
public interface MediaKeySession extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="closed")
com.user00.domjnate.api.Promise<Void> getClosed();
@JsProperty(name="expiration")
double getExpiration();
@JsProperty(name="keyStatuses")
MediaKeyStatusMap getKeyStatuses();
@JsProperty(name="sessionId")
String getSessionId();
@JsMethod(name="close")
com.user00.domjnate.api.Promise<Void> close();
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.ArrayBuffer initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.DataView initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Float64Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Float32Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Uint8ClampedArray initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Uint32Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Uint16Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Uint8Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Int32Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Int16Array initData);
@JsMethod(name="generateRequest")
com.user00.domjnate.api.Promise<Void> generateRequest(String initDataType, com.user00.domjnate.api.Int8Array initData);
@JsMethod(name="load")
com.user00.domjnate.api.Promise<Boolean> load(String sessionId);
@JsMethod(name="remove")
com.user00.domjnate.api.Promise<Void> remove();
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.ArrayBuffer response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.DataView response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Float64Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Float32Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Uint8ClampedArray response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Uint32Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Uint16Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Uint8Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Int32Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Int16Array response);
@JsMethod(name="update")
com.user00.domjnate.api.Promise<Void> update(com.user00.domjnate.api.Int8Array response);
@JsOverlay
public static MediaKeySession getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeySession", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaKeySession.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaKeySession val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeySession", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaKeySession _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaKeySession");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaKeySession.class);
}
}
