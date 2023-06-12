package com.example.kotlinbasic

// Visibility Modifiers
/*
Visibility Modifiers are keywords which are used to restrict the use of classes interfaces, methods and
properties in Kotlin.

These modifiers are used at multiple places such as class header or method body

Visibility Modifiers are categorized into four different types:

- public modifier
 A public modified element is accessible from everywhere in the project.
 It is a default modifier If any class, interface etc. are not specified with ny access/ visibility modifier
 then that class,interface etc. is used in a public scope.
 All public declarations can be place at the top of the file.
 If a member of a class is not specified then it is by default public.
- private modifier
A private modifier allows the element to be accessible only within the block in which properties, fields,
etc are declared.
The private modifier declaration does not allow access outside the scope.
a private package can be accessible within that specific file.
- protected modifier
A protected modifier with a class or interface allows visibility to its class or subclass only.
A protected declaration (when overridden) in its subclass is also protected  unless it is explicitly changed.
The Protected modifier CANNOT de declared at the top level. (for Packages)
- internal modifier
The internal modifier is feature, which is not available in java.
the internal modifier makes the field visible only inside the module in which it is implemented in.
All the fields are declared as internal which are accessible only inside the module in which they are implemented in.
- open keyword
To make a class inheritable to other classes you must mark it with the open keyword, else you get an error
"type is final so can't be inherited.
 */
// Example of the Visibility Modifier:
open class Base (){
    var a = 1// public by default
    private var b = 2 // private to Base class
    protected open val c = 3 // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e(){ } // visible to the base and the Derived class
}
class Derived:Base (){
    // a,c,d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is still protected
}
fun main (args: Array<String>){
    val base = Base()
    // base.b, base.c and base.e() are not visible
    // base.a and base.d are visible
    val derived = Derived()
    // derived.c is not visible
}