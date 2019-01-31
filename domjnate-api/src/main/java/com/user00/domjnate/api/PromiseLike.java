package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PromiseLike")
public interface PromiseLike<T> 
{
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then();
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then(Void onfulfilled);
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then(java.lang.Object onfulfilled);
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then(Void onfulfilled, Void onrejected);
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then(java.lang.Object onfulfilled, Void onrejected);
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then(Void onfulfilled, java.lang.Object onrejected);
@JsMethod(name="then")
<TResult1,TResult2> PromiseLike<java.lang.Object> then(java.lang.Object onfulfilled, java.lang.Object onrejected);
}
