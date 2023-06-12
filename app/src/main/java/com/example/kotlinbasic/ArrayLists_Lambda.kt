package com.example.kotlinbasic

//ArrayList:
/*
ArrayLists are used to create a dynamic array. Which means the size of an ArrayList can be increased
or decreased according to your requirement.

The ArrayList class provides both read and write functionalities.
The ArrayList follows the sequence of insertion order.
An ArrayList is non synchronized and it may contain duplicate elements.

// Constructor of Arraylist:
ArrayList<E>(): Is used to create an empty ArrayList. (basic)

ArrayList(capacity:Int): Is used to create an ArrayList of specified capacity.

ArrayList(elements:Collection<E>): Is used to create an ArrayList filled with the elements of a collection.

// Functions of ArrayList:
open fan add(element:E):Boolean -> used to add the specific element into
the collection.
open fun clear() -> used to remove all elements from the collection.
open fun get(index:Int):E -> used to return the element at specified index in the list.
open fun remove(element:E):Boolean -> used to remove a single instance of the specific element from current collection, if it is available.

 */
// ArrayList using coll
fun main (args: Array<String>){
    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")
    list.add("Three")
    list.add("Four")
    list.add("Five")
    list.add("Six")
    list.add("Seven")
    list.add("Eight")
    arrayList.addAll(list)
    println(arrayList)
    // Filled elements in ArrayList using collections
    val itr = arrayList.iterator()
    while(itr.hasNext()){ // this while will run as long as the another iterator/element the hasn't
        // been printed.
        println(itr.next())
    }
    println("size of arrayList = ${arrayList.size}")
    // (nameofArray).get(index) return the element within the array at a certain index.

}

// Lambda Expressions
/*
Lambda (Expression) is a function which has no name.

lambda expression and anonymous functions are "function literals', i.e functions that are not declared,
but passed immediately as an expression.

lambda is defined with curly braces {} which takes variables as a parameter (if any)and a body of a function

The body of a function is written after the variable (if any) followed by -> operator.

Syntax: {variable(s) -> body_of_lambda}

 */
// Example Lambda Expression function:
// Created a lambda expression called sum that takes two parameters that are Integers and we return a Integer
// of the sum of the two Integers.
val sum: (Int,Int) -> Int ={a: Int, b:Int -> a+b}