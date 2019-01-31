package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NewableFunction")
public interface NewableFunction extends Function
{
@JsMethod(name="apply")
<T> void apply(T _this, T thisArg);
@JsMethod(name="apply")
<T,A> void apply(T _this, T thisArg, A args);
@JsMethod(name="call")
<T,A> void call(T _this, T thisArg, A... args);
@JsMethod(name="bind")
<A,R> R bind(R _this, java.lang.Object thisArg);
@JsMethod(name="bind")
<A0,A,R> R bind(R _this, java.lang.Object thisArg, A0 arg0);
@JsMethod(name="bind")
<A0,A1,A,R> R bind(R _this, java.lang.Object thisArg, A0 arg0, A1 arg1);
@JsMethod(name="bind")
<A0,A1,A2,A,R> R bind(R _this, java.lang.Object thisArg, A0 arg0, A1 arg1, A2 arg2);
@JsMethod(name="bind")
<A0,A1,A2,A3,A,R> R bind(R _this, java.lang.Object thisArg, A0 arg0, A1 arg1, A2 arg2, A3 arg3);
@JsMethod(name="bind")
<AX,R> R bind(R _this, java.lang.Object thisArg, AX... args);
}
