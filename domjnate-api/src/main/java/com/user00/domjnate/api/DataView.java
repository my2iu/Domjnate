package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DataView")
public interface DataView extends ArrayBufferView
{
@JsProperty(name="buffer")
ArrayBuffer getBuffer();
@JsProperty(name="byteLength")
double getByteLength();
@JsProperty(name="byteOffset")
double getByteOffset();
@JsMethod(name="getFloat32")
double getFloat32(double byteOffset);
@JsMethod(name="getFloat32")
double getFloat32(double byteOffset, boolean littleEndian);
@JsMethod(name="getFloat64")
double getFloat64(double byteOffset);
@JsMethod(name="getFloat64")
double getFloat64(double byteOffset, boolean littleEndian);
@JsMethod(name="getInt8")
double getInt8(double byteOffset);
@JsMethod(name="getInt16")
double getInt16(double byteOffset);
@JsMethod(name="getInt16")
double getInt16(double byteOffset, boolean littleEndian);
@JsMethod(name="getInt32")
double getInt32(double byteOffset);
@JsMethod(name="getInt32")
double getInt32(double byteOffset, boolean littleEndian);
@JsMethod(name="getUint8")
double getUint8(double byteOffset);
@JsMethod(name="getUint16")
double getUint16(double byteOffset);
@JsMethod(name="getUint16")
double getUint16(double byteOffset, boolean littleEndian);
@JsMethod(name="getUint32")
double getUint32(double byteOffset);
@JsMethod(name="getUint32")
double getUint32(double byteOffset, boolean littleEndian);
@JsMethod(name="setFloat32")
void setFloat32(double byteOffset, double value);
@JsMethod(name="setFloat32")
void setFloat32(double byteOffset, double value, boolean littleEndian);
@JsMethod(name="setFloat64")
void setFloat64(double byteOffset, double value);
@JsMethod(name="setFloat64")
void setFloat64(double byteOffset, double value, boolean littleEndian);
@JsMethod(name="setInt8")
void setInt8(double byteOffset, double value);
@JsMethod(name="setInt16")
void setInt16(double byteOffset, double value);
@JsMethod(name="setInt16")
void setInt16(double byteOffset, double value, boolean littleEndian);
@JsMethod(name="setInt32")
void setInt32(double byteOffset, double value);
@JsMethod(name="setInt32")
void setInt32(double byteOffset, double value, boolean littleEndian);
@JsMethod(name="setUint8")
void setUint8(double byteOffset, double value);
@JsMethod(name="setUint16")
void setUint16(double byteOffset, double value);
@JsMethod(name="setUint16")
void setUint16(double byteOffset, double value, boolean littleEndian);
@JsMethod(name="setUint32")
void setUint32(double byteOffset, double value);
@JsMethod(name="setUint32")
void setUint32(double byteOffset, double value, boolean littleEndian);
@JsOverlay
public static DataView _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object buffer) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DataView");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DataView.class, buffer);
}
@JsOverlay
public static DataView _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object buffer, double byteOffset) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DataView");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DataView.class, buffer, byteOffset);
}
@JsOverlay
public static DataView _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object buffer, double byteOffset, double byteLength) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DataView");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DataView.class, buffer, byteOffset, byteLength);
}
}
