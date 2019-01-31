package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Comment")
public interface Comment extends CharacterData
{
@JsOverlay
public static Comment getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Comment", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Comment.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Comment val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Comment", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Comment _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Comment");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Comment.class);
}
@JsOverlay
public static Comment _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String data) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Comment");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Comment.class, data);
}
}
