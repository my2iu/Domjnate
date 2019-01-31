package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowOrWorkerGlobalScope")
public interface WindowOrWorkerGlobalScope
{
@JsProperty(name="caches")
CacheStorage getCaches();
@JsProperty(name="crypto")
com.user00.domjnate.api.webcrypto.Crypto getCrypto();
@JsProperty(name="indexedDB")
com.user00.domjnate.api.indexeddb.IDBFactory getIndexedDB();
@JsProperty(name="origin")
String getOrigin();
@JsProperty(name="performance")
com.user00.domjnate.api.performance.Performance getPerformance();
@JsMethod(name="atob")
String atob(String data);
@JsMethod(name="btoa")
String btoa(String data);
@JsMethod(name="clearInterval")
void clearInterval();
@JsMethod(name="clearInterval")
void clearInterval(double handle);
@JsMethod(name="clearTimeout")
void clearTimeout();
@JsMethod(name="clearTimeout")
void clearTimeout(double handle);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(ImageData image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(Blob image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(ImageBitmap image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.html.HTMLCanvasElement image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.html.HTMLVideoElement image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.svg.SVGImageElement image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.html.HTMLImageElement image);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(ImageData image, double sx, double sy, double sw, double sh);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(Blob image, double sx, double sy, double sw, double sh);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(ImageBitmap image, double sx, double sy, double sw, double sh);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.html.HTMLCanvasElement image, double sx, double sy, double sw, double sh);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.html.HTMLVideoElement image, double sx, double sy, double sw, double sh);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.svg.SVGImageElement image, double sx, double sy, double sw, double sh);
@JsMethod(name="createImageBitmap")
Promise<ImageBitmap> createImageBitmap(com.user00.domjnate.api.html.HTMLImageElement image, double sx, double sy, double sw, double sh);
@JsMethod(name="fetch")
Promise<Response> fetch(String input);
@JsMethod(name="fetch")
Promise<Response> fetch(Request input);
@JsMethod(name="fetch")
Promise<Response> fetch(String input, RequestInit init);
@JsMethod(name="fetch")
Promise<Response> fetch(Request input, RequestInit init);
@JsMethod(name="queueMicrotask")
void queueMicrotask(Function callback);
@JsMethod(name="setInterval")
double setInterval(Function handler, java.lang.Object... arguments);
@JsMethod(name="setInterval")
double setInterval(String handler, java.lang.Object... arguments);
@JsMethod(name="setInterval")
double setInterval(Function handler, double timeout, java.lang.Object... arguments);
@JsMethod(name="setInterval")
double setInterval(String handler, double timeout, java.lang.Object... arguments);
@JsMethod(name="setTimeout")
double setTimeout(Function handler, java.lang.Object... arguments);
@JsMethod(name="setTimeout")
double setTimeout(String handler, java.lang.Object... arguments);
@JsMethod(name="setTimeout")
double setTimeout(Function handler, double timeout, java.lang.Object... arguments);
@JsMethod(name="setTimeout")
double setTimeout(String handler, double timeout, java.lang.Object... arguments);
}
