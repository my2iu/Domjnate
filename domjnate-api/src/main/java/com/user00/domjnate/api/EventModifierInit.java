package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EventModifierInit")
public interface EventModifierInit extends UIEventInit
{
@JsProperty(name="altKey")
Boolean getAltKey();
@JsProperty(name="altKey")
void setAltKey(Boolean val);
@JsProperty(name="ctrlKey")
Boolean getCtrlKey();
@JsProperty(name="ctrlKey")
void setCtrlKey(Boolean val);
@JsProperty(name="metaKey")
Boolean getMetaKey();
@JsProperty(name="metaKey")
void setMetaKey(Boolean val);
@JsProperty(name="modifierAltGraph")
Boolean getModifierAltGraph();
@JsProperty(name="modifierAltGraph")
void setModifierAltGraph(Boolean val);
@JsProperty(name="modifierCapsLock")
Boolean getModifierCapsLock();
@JsProperty(name="modifierCapsLock")
void setModifierCapsLock(Boolean val);
@JsProperty(name="modifierFn")
Boolean getModifierFn();
@JsProperty(name="modifierFn")
void setModifierFn(Boolean val);
@JsProperty(name="modifierFnLock")
Boolean getModifierFnLock();
@JsProperty(name="modifierFnLock")
void setModifierFnLock(Boolean val);
@JsProperty(name="modifierHyper")
Boolean getModifierHyper();
@JsProperty(name="modifierHyper")
void setModifierHyper(Boolean val);
@JsProperty(name="modifierNumLock")
Boolean getModifierNumLock();
@JsProperty(name="modifierNumLock")
void setModifierNumLock(Boolean val);
@JsProperty(name="modifierOS")
Boolean getModifierOS();
@JsProperty(name="modifierOS")
void setModifierOS(Boolean val);
@JsProperty(name="modifierScrollLock")
Boolean getModifierScrollLock();
@JsProperty(name="modifierScrollLock")
void setModifierScrollLock(Boolean val);
@JsProperty(name="modifierSuper")
Boolean getModifierSuper();
@JsProperty(name="modifierSuper")
void setModifierSuper(Boolean val);
@JsProperty(name="modifierSymbol")
Boolean getModifierSymbol();
@JsProperty(name="modifierSymbol")
void setModifierSymbol(Boolean val);
@JsProperty(name="modifierSymbolLock")
Boolean getModifierSymbolLock();
@JsProperty(name="modifierSymbolLock")
void setModifierSymbolLock(Boolean val);
@JsProperty(name="shiftKey")
Boolean getShiftKey();
@JsProperty(name="shiftKey")
void setShiftKey(Boolean val);
}
