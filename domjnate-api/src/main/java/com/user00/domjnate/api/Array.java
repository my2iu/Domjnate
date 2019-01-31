package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Array")
public interface Array<T> 
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
@JsMethod(name="toString")
String toString();
@JsMethod(name="toLocaleString")
String toLocaleString();
@JsMethod(name="pop")
java.lang.Object pop();
@JsMethod(name="push")
double push(T... items);
@JsMethod(name="concat")
Array<T> concat(ConcatArray<T>... items);
@JsMethod(name="concat")
Array<T> concat(T... items);
@JsMethod(name="join")
String join();
@JsMethod(name="join")
String join(String separator);
@JsMethod(name="reverse")
Array<T> reverse();
@JsMethod(name="shift")
java.lang.Object shift();
@JsMethod(name="slice")
Array<T> slice();
@JsMethod(name="slice")
Array<T> slice(double start);
@JsMethod(name="slice")
Array<T> slice(double start, double end);
@JsMethod(name="sort")
Array sort();
@JsMethod(name="sort")
Array sort(SortCallback compareFn);
@JsMethod(name="splice")
Array<T> splice(double start);
@JsMethod(name="splice")
Array<T> splice(double start, double deleteCount);
@JsMethod(name="splice")
Array<T> splice(double start, double deleteCount, T... items);
@JsMethod(name="unshift")
double unshift(T... items);
@JsMethod(name="indexOf")
double indexOf(T searchElement);
@JsMethod(name="indexOf")
double indexOf(T searchElement, double fromIndex);
@JsMethod(name="lastIndexOf")
double lastIndexOf(T searchElement);
@JsMethod(name="lastIndexOf")
double lastIndexOf(T searchElement, double fromIndex);
@JsMethod(name="every")
boolean every(EveryCallback callbackfn);
@JsMethod(name="every")
boolean every(EveryCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="some")
boolean some(SomeCallback callbackfn);
@JsMethod(name="some")
boolean some(SomeCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsMethod(name="map")
<U> Array<U> map(MapCallback callbackfn);
@JsMethod(name="map")
<U> Array<U> map(MapCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="filter")
Array<T> filter(FilterCallback callbackfn);
@JsMethod(name="filter")
Array<T> filter(FilterCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="reduce")
T reduce(ReduceCallback callbackfn);
@JsMethod(name="reduce")
<U> U reduce(ReduceCallback0 callbackfn, U initialValue);
@JsMethod(name="reduceRight")
T reduceRight(ReduceRightCallback callbackfn);
@JsMethod(name="reduceRight")
<U> U reduceRight(ReduceRightCallback0 callbackfn, U initialValue);
@JsOverlay
public default T get(double n, Class<T> _type) {
  return (T)com.user00.domjnate.util.Js.getIndex(this, n, _type);
}
@JsOverlay
public default void set(double n, T val) {
  com.user00.domjnate.util.Js.setIndex(this, n, val);
}
@JsFunction public static interface EveryCallback<T> 
{
boolean apply(T value, double index, Array<T> array);
}
@JsFunction public static interface FilterCallback<T> 
{
java.lang.Object apply(T value, double index, Array<T> array);
}
@JsFunction public static interface ReduceRightCallback<T> 
{
T apply(T previousValue, T currentValue, double currentIndex, Array<T> array);
}
@JsFunction public static interface SomeCallback<T> 
{
boolean apply(T value, double index, Array<T> array);
}
@JsFunction public static interface MapCallback<U,T> 
{
U apply(T value, double index, Array<T> array);
}
@JsFunction public static interface ReduceRightCallback0<U,T> 
{
U apply(U previousValue, T currentValue, double currentIndex, Array<T> array);
}
@JsFunction public static interface ReduceCallback<T> 
{
T apply(T previousValue, T currentValue, double currentIndex, Array<T> array);
}
@JsFunction public static interface ReduceCallback0<U,T> 
{
U apply(U previousValue, T currentValue, double currentIndex, Array<T> array);
}
@JsFunction public static interface ForEachCallback0<T> 
{
void apply(T value, double index, Array<T> array);
}
@JsFunction public static interface SortCallback<T> 
{
double apply(T a, T b);
}
@JsOverlay
public static Array<java.lang.Object> getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Array", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Array.class);
}
@JsOverlay
public static boolean isArray(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object arg) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Array", "isArray", boolean.class, arg);
}
@JsOverlay
public static <T> Array<T> call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double arrayLength) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Array", Array.class, arrayLength);
}
@JsOverlay
public static <T> Array<T> call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, T... items) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Array", Array.class, items);
}
@JsOverlay
public static <T> Array<T> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double arrayLength) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Array.class, arrayLength);
}
@JsOverlay
public static <T> Array<T> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, T... items) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Array.class, items);
}
}
