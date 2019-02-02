package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadonlyArray")
public interface ReadonlyArray<T> 
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="toString")
String toString();
@JsMethod(name="toLocaleString")
String toLocaleString();
@JsMethod(name="concat")
Array<T> concat(ConcatArray<T>... items);
@JsMethod(name="concat")
Array<T> concat(T... items);
@JsMethod(name="join")
String join();
@JsMethod(name="join")
String join(String separator);
@JsMethod(name="slice")
Array<T> slice();
@JsMethod(name="slice")
Array<T> slice(double start);
@JsMethod(name="slice")
Array<T> slice(double start, double end);
@JsMethod(name="indexOf")
double indexOf(T searchElement);
@JsMethod(name="indexOf")
double indexOf(T searchElement, double fromIndex);
@JsMethod(name="lastIndexOf")
double lastIndexOf(T searchElement);
@JsMethod(name="lastIndexOf")
double lastIndexOf(T searchElement, double fromIndex);
@JsMethod(name="every")
boolean every(EveryCallback<T> callbackfn);
@JsMethod(name="every")
boolean every(EveryCallback<T> callbackfn, java.lang.Object thisArg);
@JsMethod(name="some")
boolean some(SomeCallback<T> callbackfn);
@JsMethod(name="some")
boolean some(SomeCallback<T> callbackfn, java.lang.Object thisArg);
@JsMethod(name="forEach")
void forEach(ForEachCallback0<T> callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0<T> callbackfn, java.lang.Object thisArg);
@JsMethod(name="map")
<U> Array<U> map(MapCallback<U, T> callbackfn);
@JsMethod(name="map")
<U> Array<U> map(MapCallback<U, T> callbackfn, java.lang.Object thisArg);
@JsMethod(name="filter")
Array<T> filter(FilterCallback<T> callbackfn);
@JsMethod(name="filter")
Array<T> filter(FilterCallback<T> callbackfn, java.lang.Object thisArg);
@JsMethod(name="reduce")
T reduce(ReduceCallback<T> callbackfn);
@JsMethod(name="reduce")
<U> U reduce(ReduceCallback0<U, T> callbackfn, U initialValue);
@JsMethod(name="reduceRight")
T reduceRight(ReduceRightCallback<T> callbackfn);
@JsMethod(name="reduceRight")
<U> U reduceRight(ReduceRightCallback0<U, T> callbackfn, U initialValue);
@JsOverlay
public default T get(double n, Class<T> _type) {
  return (T)com.user00.domjnate.util.Js.getIndex(this, n, _type);
}
@JsFunction public static interface EveryCallback<T> 
{
boolean apply(T value, double index, ReadonlyArray<T> array);
}
@JsFunction public static interface FilterCallback<T> 
{
java.lang.Object apply(T value, double index, ReadonlyArray<T> array);
}
@JsFunction public static interface ReduceRightCallback<T> 
{
T apply(T previousValue, T currentValue, double currentIndex, ReadonlyArray<T> array);
}
@JsFunction public static interface SomeCallback<T> 
{
boolean apply(T value, double index, ReadonlyArray<T> array);
}
@JsFunction public static interface MapCallback<U,T> 
{
U apply(T value, double index, ReadonlyArray<T> array);
}
@JsFunction public static interface ReduceRightCallback0<U,T> 
{
U apply(U previousValue, T currentValue, double currentIndex, ReadonlyArray<T> array);
}
@JsFunction public static interface ReduceCallback<T> 
{
T apply(T previousValue, T currentValue, double currentIndex, ReadonlyArray<T> array);
}
@JsFunction public static interface ReduceCallback0<U,T> 
{
U apply(U previousValue, T currentValue, double currentIndex, ReadonlyArray<T> array);
}
@JsFunction public static interface ForEachCallback0<T> 
{
void apply(T value, double index, ReadonlyArray<T> array);
}
}
