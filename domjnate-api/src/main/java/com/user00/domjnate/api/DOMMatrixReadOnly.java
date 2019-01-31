package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMMatrixReadOnly")
public interface DOMMatrixReadOnly
{
@JsProperty(name="a")
double getA();
@JsProperty(name="b")
double getB();
@JsProperty(name="c")
double getC();
@JsProperty(name="d")
double getD();
@JsProperty(name="e")
double getE();
@JsProperty(name="f")
double getF();
@JsProperty(name="is2D")
boolean getIs2D();
@JsProperty(name="isIdentity")
boolean getIsIdentity();
@JsProperty(name="m11")
double getM11();
@JsProperty(name="m12")
double getM12();
@JsProperty(name="m13")
double getM13();
@JsProperty(name="m14")
double getM14();
@JsProperty(name="m21")
double getM21();
@JsProperty(name="m22")
double getM22();
@JsProperty(name="m23")
double getM23();
@JsProperty(name="m24")
double getM24();
@JsProperty(name="m31")
double getM31();
@JsProperty(name="m32")
double getM32();
@JsProperty(name="m33")
double getM33();
@JsProperty(name="m34")
double getM34();
@JsProperty(name="m41")
double getM41();
@JsProperty(name="m42")
double getM42();
@JsProperty(name="m43")
double getM43();
@JsProperty(name="m44")
double getM44();
@JsMethod(name="flipX")
DOMMatrix flipX();
@JsMethod(name="flipY")
DOMMatrix flipY();
@JsMethod(name="inverse")
DOMMatrix inverse();
@JsMethod(name="multiply")
DOMMatrix multiply();
@JsMethod(name="multiply")
DOMMatrix multiply(DOMMatrixInit other);
@JsMethod(name="rotate")
DOMMatrix rotate();
@JsMethod(name="rotate")
DOMMatrix rotate(double rotX);
@JsMethod(name="rotate")
DOMMatrix rotate(double rotX, double rotY);
@JsMethod(name="rotate")
DOMMatrix rotate(double rotX, double rotY, double rotZ);
@JsMethod(name="rotateAxisAngle")
DOMMatrix rotateAxisAngle();
@JsMethod(name="rotateAxisAngle")
DOMMatrix rotateAxisAngle(double x);
@JsMethod(name="rotateAxisAngle")
DOMMatrix rotateAxisAngle(double x, double y);
@JsMethod(name="rotateAxisAngle")
DOMMatrix rotateAxisAngle(double x, double y, double z);
@JsMethod(name="rotateAxisAngle")
DOMMatrix rotateAxisAngle(double x, double y, double z, double angle);
@JsMethod(name="rotateFromVector")
DOMMatrix rotateFromVector();
@JsMethod(name="rotateFromVector")
DOMMatrix rotateFromVector(double x);
@JsMethod(name="rotateFromVector")
DOMMatrix rotateFromVector(double x, double y);
@JsMethod(name="scale")
DOMMatrix scale();
@JsMethod(name="scale")
DOMMatrix scale(double scaleX);
@JsMethod(name="scale")
DOMMatrix scale(double scaleX, double scaleY);
@JsMethod(name="scale")
DOMMatrix scale(double scaleX, double scaleY, double scaleZ);
@JsMethod(name="scale")
DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX);
@JsMethod(name="scale")
DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX, double originY);
@JsMethod(name="scale")
DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX, double originY, double originZ);
@JsMethod(name="scale3d")
DOMMatrix scale3d();
@JsMethod(name="scale3d")
DOMMatrix scale3d(double scale);
@JsMethod(name="scale3d")
DOMMatrix scale3d(double scale, double originX);
@JsMethod(name="scale3d")
DOMMatrix scale3d(double scale, double originX, double originY);
@JsMethod(name="scale3d")
DOMMatrix scale3d(double scale, double originX, double originY, double originZ);
@JsMethod(name="skewX")
DOMMatrix skewX();
@JsMethod(name="skewX")
DOMMatrix skewX(double sx);
@JsMethod(name="skewY")
DOMMatrix skewY();
@JsMethod(name="skewY")
DOMMatrix skewY(double sy);
@JsMethod(name="toFloat32Array")
Float32Array toFloat32Array();
@JsMethod(name="toFloat64Array")
Float64Array toFloat64Array();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsMethod(name="transformPoint")
DOMPoint transformPoint();
@JsMethod(name="transformPoint")
DOMPoint transformPoint(DOMPointInit point);
@JsMethod(name="translate")
DOMMatrix translate();
@JsMethod(name="translate")
DOMMatrix translate(double tx);
@JsMethod(name="translate")
DOMMatrix translate(double tx, double ty);
@JsMethod(name="translate")
DOMMatrix translate(double tx, double ty, double tz);
@JsOverlay
public static DOMMatrixReadOnly getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMMatrixReadOnly", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMMatrixReadOnly.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMMatrixReadOnly val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMMatrixReadOnly", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMMatrixReadOnly fromFloat32Array(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Float32Array array32) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrixReadOnly", "fromFloat32Array", DOMMatrixReadOnly.class, array32);
}
@JsOverlay
public static DOMMatrixReadOnly fromFloat64Array(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Float64Array array64) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrixReadOnly", "fromFloat64Array", DOMMatrixReadOnly.class, array64);
}
@JsOverlay
public static DOMMatrixReadOnly fromMatrix(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrixReadOnly", "fromMatrix", DOMMatrixReadOnly.class);
}
@JsOverlay
public static DOMMatrixReadOnly fromMatrix(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMMatrixInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrixReadOnly", "fromMatrix", DOMMatrixReadOnly.class, other);
}
@JsOverlay
public static DOMMatrixReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMMatrixReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMMatrixReadOnly.class);
}
@JsOverlay
public static DOMMatrixReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<Double> init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMMatrixReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMMatrixReadOnly.class, init);
}
@JsOverlay
public static DOMMatrixReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMMatrixReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMMatrixReadOnly.class, init);
}
}
