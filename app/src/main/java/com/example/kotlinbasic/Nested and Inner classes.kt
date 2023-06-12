package com.example.kotlinbasic

// Nested class
/*
Nested class is such class which is created inside another class
In kotlin, a nested class is by default static, so it data members and member functions can be accessed without creating
an  object of class.
Nested classes cannot access the data members of outer classes.
 */
class OuterClass {
    private var name: String = "Mr X"
    class NestedClass {
        var description: String = "code inside nested class"
        private  var id: Int = 101
        fun foo (){
            // println("name is ${name}") // cannot access the outer class member
            println("Id is ${id}" )
        }
    }
}

// Inner class
/*
An Inner class is a class which is created inside another class with keyword inner.
A nested class which is marked as "inner" is called a inner class.
Inner class cannot be declared inside interfaces of non-inner nested classes.
The advantage of the inner class ove nested class is that, it is able to access members of its outer class even it is private.
The inner class keeps a references to an object of its outer class.
 */
class outerClass{
    private  var name: String = "Mr X"
    inner class InnerClass{
        var description: String = "code inside inner class"
        private  var id:Int = 101
        fun foo(){
            println("name is ${name}") // access the private outer class member.
            println("Id is ${id}")
        }
    }
}

fun main (args: Array<String>){
    // nested class must be initialized
    println(OuterClass.NestedClass().description)// accessing the property within the Nested class
    var obj = OuterClass.NestedClass()// object creation
    obj.foo()// access member function
    // Inner class be initialized
    println(outerClass().InnerClass().description) // accessing property
    var Obj = outerClass().InnerClass() // object creation
    Obj.foo()// access member function
    // Unsafe cast operator: as
    // Sometimes it not possible to cast a variable and and it throws an exception, this called an unsafe cast
    // The unsafe cast is performed by the infix operator as.
    // Nullable for Casting to work:
    // Source and target variable needs to be a nullable for casting to work:
    val objs: Any? = "String unsafe cast"
    val str: String? = objs as String? // Works
    println(str) // Output: String unsafe cast


}