# DOM*j*nate

DOMjnate is a Java library that allows you to manipulate HTML DOM JavaScript APIs entirely from Java. The name comes from the DOM of HTML's Document Object Model, a J for Java, and the word "dominate" to represent the goal of using HTML5 for all Java user interface code.

It is mainly intended as an alternative to [Elemental 2](https://github.com/google/elemental2). DOMjnate has different goals and use-cases than Elemental 2, resulting in a slightly different API. Elemental 2 uses real Java classes to represent JavaScript types and Java fields to represent JavaScript properties. This allows for proper run-time type checking and a Java API that feels more like the native JavaScript. DOMjnate uses only Java interfaces to represent JavaScript types and Java getter/setter methods to represent JavaScript properties. This makes it easier to mock the interfaces in test code and gives the API a more "Java" feel. Although run-time type-checking is less strict because of the use of interfaces, this extra flexibility makes DOMjnate usable in unusual situations like having multiple global scopes (e.g. if you use iframes). The main advantage of DOMjnate over Elemental 2, though, is that in many cases, you can run and debug your code entirely from within Java without recompiling everything to JavaScript first.


