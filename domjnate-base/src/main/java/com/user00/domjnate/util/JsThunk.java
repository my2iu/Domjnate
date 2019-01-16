package com.user00.domjnate.util;

public interface JsThunk
{
   Object getConstructor(String className);
   <T> T construct(Object constructor, Class<T> type, Object...args);
   <T> T callMethod(Object obj, String methodName, Class<T> type, Object...args);
   <T> T getMember(Object scope, String member, Class<T> type);
   <T> void setMember(Object scope, String member, T val);
   <T> T getIndex(Object obj, int idx, Class<T> type);
   <T> void setIndex(Object obj, int idx, T val);
   <T> T cast(Object obj, Class<T> type);
}
