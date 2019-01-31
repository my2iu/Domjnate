package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CallableFunction")
public interface CallableFunction extends Function
{
@JsMethod(name="apply")
<T,R> R apply(ApplyCallback _this, T thisArg);
@JsMethod(name="apply")
<T,A,R> R apply(ApplyCallback0 _this, T thisArg, A args);
@JsMethod(name="call")
<T,A,R> R call(CallCallback _this, T thisArg, A... args);
@JsMethod(name="bind")
<T,A,R> BindCallback bind(BindCallback0 _this, T thisArg);
@JsMethod(name="bind")
<T,A0,A,R> BindCallback1 bind(BindCallback2 _this, T thisArg, A0 arg0);
@JsMethod(name="bind")
<T,A0,A1,A,R> BindCallback3 bind(BindCallback4 _this, T thisArg, A0 arg0, A1 arg1);
@JsMethod(name="bind")
<T,A0,A1,A2,A,R> BindCallback5 bind(BindCallback6 _this, T thisArg, A0 arg0, A1 arg1, A2 arg2);
@JsMethod(name="bind")
<T,A0,A1,A2,A3,A,R> BindCallback7 bind(BindCallback8 _this, T thisArg, A0 arg0, A1 arg1, A2 arg2, A3 arg3);
@JsMethod(name="bind")
<T,AX,R> BindCallback9 bind(BindCallback10 _this, T thisArg, AX... args);
@JsFunction public static interface BindCallback5<R,A> 
{
R apply(A... args);
}
@JsFunction public static interface BindCallback4<R,A,T,A0,A1> 
{
R apply(A0 arg0, A1 arg1, A... args);
}
@JsFunction public static interface BindCallback3<R,A> 
{
R apply(A... args);
}
@JsFunction public static interface BindCallback2<R,A,T,A0> 
{
R apply(A0 arg0, A... args);
}
@JsFunction public static interface BindCallback9<R,AX> 
{
R apply(AX... args);
}
@JsFunction public static interface BindCallback8<R,A,T,A0,A1,A2,A3> 
{
R apply(A0 arg0, A1 arg1, A2 arg2, A3 arg3, A... args);
}
@JsFunction public static interface ApplyCallback<R,T> 
{
R apply();
}
@JsFunction public static interface BindCallback7<R,A> 
{
R apply(A... args);
}
@JsFunction public static interface BindCallback6<R,A,T,A0,A1,A2> 
{
R apply(A0 arg0, A1 arg1, A2 arg2, A... args);
}
@JsFunction public static interface CallCallback<R,A,T> 
{
R apply(A... args);
}
@JsFunction public static interface BindCallback<R,A> 
{
R apply(A... args);
}
@JsFunction public static interface ApplyCallback0<R,A,T> 
{
R apply(A... args);
}
@JsFunction public static interface BindCallback1<R,A> 
{
R apply(A... args);
}
@JsFunction public static interface BindCallback10<R,AX,T> 
{
R apply(AX... args);
}
@JsFunction public static interface BindCallback0<R,A,T> 
{
R apply(A... args);
}
}
