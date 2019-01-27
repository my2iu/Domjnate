# DOM*j*nate

DOMjnate is a Java library that allows you to manipulate HTML DOM JavaScript APIs entirely from Java. The name comes from the DOM of HTML's Document Object Model, a J for Java, and the word "dominate" to represent the goal of using HTML5 for all Java user interface code.

*brief blurb on what DOMjnate is for*

## Comparison to Elemental 2

It is mainly intended as an alternative to [Elemental 2](https://github.com/google/elemental2). DOMjnate has different goals and use-cases than Elemental 2, resulting in a slightly different API. Elemental 2 uses real Java classes to represent JavaScript types and Java fields to represent JavaScript properties. This allows for proper run-time type checking and a Java API that feels more like the native JavaScript. DOMjnate uses only Java interfaces to represent JavaScript types and Java getter/setter methods to represent JavaScript properties. This makes it easier to mock the interfaces in test code and gives the API a more "Java" feel. Although run-time type-checking is less strict because of the use of interfaces, this extra flexibility makes DOMjnate usable in unusual situations like having multiple global scopes (e.g. if you use iframes). DOMjnate is generated based on Microsoft's Typescript typing of the DOM API (with the intention of supplementing it WebIDL type information) while Elemental 2 is based on Google's Closure externs. The main advantage of DOMjnate over Elemental 2 though, is that in many cases, you can run and debug your code entirely from within Java without recompiling everything to JavaScript first.

DOMjnate is primarily intended to be used with the GWT compiler. This lets you write all your code in Java, and then translate all your Java code into JavaScript to run things in a browser. But DOMjnate is also able to interface with the JavaFX webview and wrap all the JavaScript objects in the webview, so that you can run your Java code as normal Java code in a Java debugger without translating it to JavaScript first. Although this interfacing is a little clunky, it can potentially accelerate your development cycles because you don't need to compile your code to JavaScript everytime you want to debug your user interface. The same Java code will run the same in both your Java debugger and in a browser.

## Building

### Generating the API

## Using DOM*j*nate in GWT

## Using DOM*j*nate in Java

## Making programs that run in both GWT and from Java
