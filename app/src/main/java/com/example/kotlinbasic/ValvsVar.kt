package com.example.kotlinbasic
// Var vs. Val
fun main (args: Array<String>){
    var Myname = "Sam" // Created var (variable) named Myname
    Myname = "Samuel" // Can change the data assigned to the variable
    val Mylastname = "Gnahoui-David" // Created a val (value) named Mylastname
    var age = 24
    // val cannot be reassigned with new data
    println("My full name is $Myname $Mylastname and I'm $age") // prints the variable/value to the terminal
    // char (Characters)
    val letterChar = 'A'
    val digitChar = '1'
    // boolean (Boolean)
    var itsSunny = true // change the boolean variable from true to false.
    itsSunny = false

}
/*
    To comment out
    multiple lines
    of code.
*/