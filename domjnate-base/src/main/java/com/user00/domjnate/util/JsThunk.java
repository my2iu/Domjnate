package com.user00.domjnate.util;

import java.lang.reflect.Type;

public interface JsThunk
{
   Object getConstructor(String className);
   <T> T construct(Object constructor, Type type, Object...args);
   <T> T callMethod(Object obj, String methodName, Type type, Object...args);
   <T> T getMember(Object scope, String member, Type type);
   <T> void setMember(Object scope, String member, T val);
   <T> T getIndex(Object obj, int idx, Type type);
   <T> void setIndex(Object obj, int idx, T val);
   <T> T cast(Object obj, Type type);
}
