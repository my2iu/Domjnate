package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NotificationOptions")
public interface NotificationOptions
{
@JsProperty(name="actions")
Array<NotificationAction> getActions();
@JsProperty(name="actions")
void setActions(Array<NotificationAction> val);
@JsProperty(name="badge")
String getBadge();
@JsProperty(name="badge")
void setBadge(String val);
@JsProperty(name="body")
String getBody();
@JsProperty(name="body")
void setBody(String val);
@JsProperty(name="data")
java.lang.Object getData();
@JsProperty(name="data")
void setData(java.lang.Object val);
@JsProperty(name="dir")
String getDir();
@JsProperty(name="dir")
void setDir(String val);
@JsProperty(name="icon")
String getIcon();
@JsProperty(name="icon")
void setIcon(String val);
@JsProperty(name="image")
String getImage();
@JsProperty(name="image")
void setImage(String val);
@JsProperty(name="lang")
String getLang();
@JsProperty(name="lang")
void setLang(String val);
@JsProperty(name="renotify")
Boolean getRenotify();
@JsProperty(name="renotify")
void setRenotify(Boolean val);
@JsProperty(name="requireInteraction")
Boolean getRequireInteraction();
@JsProperty(name="requireInteraction")
void setRequireInteraction(Boolean val);
@JsProperty(name="silent")
Boolean getSilent();
@JsProperty(name="silent")
void setSilent(Boolean val);
@JsProperty(name="tag")
String getTag();
@JsProperty(name="tag")
void setTag(String val);
@JsProperty(name="timestamp")
Double getTimestamp();
@JsProperty(name="timestamp")
void setTimestamp(Double val);
@JsProperty(name="vibrate")
java.lang.Object getVibrate();
@JsProperty(name="vibrate")
void setVibrate(java.lang.Object val);
}
