package com.user00.domjnate.javafx;

import netscape.javascript.JSObject;

/**
 * There seems to be problems with calling from JavaScript to Java
 * using anonymous classes and lambdas because there a problem
 * with permissions, so I need a public class to act as a 
 * passthrough to the actual function to call. I don't think this
 * existed before, so it might be a module issue or something.
 */
public interface ArgumentPasser
{
   public Object callFn(Object...args); 

   public static class FunctionPassthroughToJava 
   {
      /**
       * Java lambda that we will pass all our parameters to
       */
      ArgumentPasser passthrough;
      
      /** Reference to a JS function that will invoke this argument
       *  passer when called.
       */
      public JSObject jsFunction;
      
      public FunctionPassthroughToJava(ArgumentPasser passthrough) 
      {
         this.passthrough = passthrough;
      }
      public Object passthroughCall(Object argArrayRaw) 
      {
         JSObject argArray = (JSObject)argArrayRaw;
         int size = (int)argArray.getMember("length");
         Object[] args = new Object[size];
         for (int n = 0; n < size; n++)
            args[n] = argArray.getSlot(n);
         return passthrough.callFn(args);
      }
   }
   
}
