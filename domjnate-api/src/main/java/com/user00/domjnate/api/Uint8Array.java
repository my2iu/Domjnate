package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Uint8Array")
public interface Uint8Array extends ArrayBufferView
{
@JsProperty(name="BYTES_PER_ELEMENT")
double BYTES_PER_ELEMENT();
@JsProperty(name="buffer")
java.lang.Object getBuffer();
@JsProperty(name="byteLength")
double getByteLength();
@JsProperty(name="byteOffset")
double getByteOffset();
@JsProperty(name="length")
double getLength();
@JsMethod(name="copyWithin")
Uint8Array copyWithin(double target, double start);
@JsMethod(name="copyWithin")
Uint8Array copyWithin(double target, double start, double end);
@JsMethod(name="every")
boolean every(EveryCallback callbackfn);
@JsMethod(name="every")
boolean every(EveryCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="fill")
Uint8Array fill(double value);
@JsMethod(name="fill")
Uint8Array fill(double value, double start);
@JsMethod(name="fill")
Uint8Array fill(double value, double start, double end);
@JsMethod(name="filter")
Uint8Array filter(FilterCallback callbackfn);
@JsMethod(name="filter")
Uint8Array filter(FilterCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="find")
java.lang.Object find(FindCallback predicate);
@JsMethod(name="find")
java.lang.Object find(FindCallback predicate, java.lang.Object thisArg);
@JsMethod(name="findIndex")
double findIndex(FindIndexCallback predicate);
@JsMethod(name="findIndex")
double findIndex(FindIndexCallback predicate, java.lang.Object thisArg);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsMethod(name="indexOf")
double indexOf(double searchElement);
@JsMethod(name="indexOf")
double indexOf(double searchElement, double fromIndex);
@JsMethod(name="join")
String join();
@JsMethod(name="join")
String join(String separator);
@JsMethod(name="lastIndexOf")
double lastIndexOf(double searchElement);
@JsMethod(name="lastIndexOf")
double lastIndexOf(double searchElement, double fromIndex);
@JsMethod(name="map")
Uint8Array map(MapCallback callbackfn);
@JsMethod(name="map")
Uint8Array map(MapCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="reduce")
double reduce(ReduceCallback callbackfn);
@JsMethod(name="reduce")
double reduce(ReduceCallback0 callbackfn, double initialValue);
@JsMethod(name="reduce")
<U> U reduce(ReduceCallback1<U> callbackfn, U initialValue);
@JsMethod(name="reduceRight")
double reduceRight(ReduceRightCallback callbackfn);
@JsMethod(name="reduceRight")
double reduceRight(ReduceRightCallback0 callbackfn, double initialValue);
@JsMethod(name="reduceRight")
<U> U reduceRight(ReduceRightCallback1<U> callbackfn, U initialValue);
@JsMethod(name="reverse")
Uint8Array reverse();
@JsMethod(name="set")
void set(ArrayLike<Double> array);
@JsMethod(name="set")
void set(ArrayLike<Double> array, double offset);
@JsMethod(name="slice")
Uint8Array slice();
@JsMethod(name="slice")
Uint8Array slice(double start);
@JsMethod(name="slice")
Uint8Array slice(double start, double end);
@JsMethod(name="some")
boolean some(SomeCallback callbackfn);
@JsMethod(name="some")
boolean some(SomeCallback callbackfn, java.lang.Object thisArg);
@JsMethod(name="sort")
Uint8Array sort();
@JsMethod(name="sort")
Uint8Array sort(SortCallback compareFn);
@JsMethod(name="subarray")
Uint8Array subarray(double begin);
@JsMethod(name="subarray")
Uint8Array subarray(double begin, double end);
@JsMethod(name="toLocaleString")
String toLocaleString();
@JsMethod(name="toString")
String toString();
@JsOverlay
public default double get(double index) {
  return (double)com.user00.domjnate.util.Js.getIndex(this, index, double.class);
}
@JsOverlay
public default void set(double index, double val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface FilterCallback
{
java.lang.Object apply(double value, double index, Uint8Array array);
}
@JsFunction public static interface FindIndexCallback
{
boolean apply(double value, double index, Uint8Array obj);
}
@JsFunction public static interface SomeCallback
{
boolean apply(double value, double index, Uint8Array array);
}
@JsFunction public static interface MapCallback
{
double apply(double value, double index, Uint8Array array);
}
@JsFunction public static interface ReduceRightCallback1<U> 
{
U apply(U previousValue, double currentValue, double currentIndex, Uint8Array array);
}
@JsFunction public static interface ReduceRightCallback0
{
double apply(double previousValue, double currentValue, double currentIndex, Uint8Array array);
}
@JsFunction public static interface ReduceCallback
{
double apply(double previousValue, double currentValue, double currentIndex, Uint8Array array);
}
@JsFunction public static interface ReduceCallback0
{
double apply(double previousValue, double currentValue, double currentIndex, Uint8Array array);
}
@JsFunction public static interface ForEachCallback0
{
void apply(double value, double index, Uint8Array array);
}
@JsFunction public static interface ReduceCallback1<U> 
{
U apply(U previousValue, double currentValue, double currentIndex, Uint8Array array);
}
@JsFunction public static interface SortCallback
{
double apply(double a, double b);
}
@JsFunction public static interface EveryCallback
{
boolean apply(double value, double index, Uint8Array array);
}
@JsFunction public static interface ReduceRightCallback
{
double apply(double previousValue, double currentValue, double currentIndex, Uint8Array array);
}
@JsFunction public static interface FromCallback
{
double apply(double v, double k);
}
@JsFunction public static interface FindCallback
{
boolean apply(double value, double index, Uint8Array obj);
}
@JsOverlay
public static Uint8Array getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Uint8Array", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Uint8Array.class);
}
@JsOverlay
public static double BYTES_PER_ELEMENT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Uint8Array", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "BYTES_PER_ELEMENT", double.class);
}
@JsOverlay
public static Uint8Array of(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double... items) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Uint8Array", "of", Uint8Array.class, items);
}
@JsOverlay
public static Uint8Array from(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayLike<Double> arrayLike) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Uint8Array", "from", Uint8Array.class, arrayLike);
}
@JsOverlay
public static Uint8Array from(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayLike<Double> arrayLike, FromCallback mapfn) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Uint8Array", "from", Uint8Array.class, arrayLike, mapfn);
}
@JsOverlay
public static Uint8Array from(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayLike<Double> arrayLike, FromCallback mapfn, java.lang.Object thisArg) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Uint8Array", "from", Uint8Array.class, arrayLike, mapfn, thisArg);
}
@JsOverlay
public static Uint8Array _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double length) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Uint8Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Uint8Array.class, length);
}
@JsOverlay
public static Uint8Array _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object arrayOrArrayBuffer) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Uint8Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Uint8Array.class, arrayOrArrayBuffer);
}
@JsOverlay
public static Uint8Array _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayLike<Double> arrayOrArrayBuffer) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Uint8Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Uint8Array.class, arrayOrArrayBuffer);
}
@JsOverlay
public static Uint8Array _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object buffer, double byteOffset) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Uint8Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Uint8Array.class, buffer, byteOffset);
}
@JsOverlay
public static Uint8Array _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object buffer, double byteOffset, double length) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Uint8Array");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Uint8Array.class, buffer, byteOffset, length);
}
}
