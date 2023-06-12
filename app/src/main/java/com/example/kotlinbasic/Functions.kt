package com.example.kotlinbasic

fun main (args: Array<String>){
    var sum = addUp(5,6)
    println("The sum is $sum")
    var nullableName : String? = "Samuel" // the ?(the safe call operator) allow the variable to be null without any errors
    var word: String? = "Dog"
    word?.let { println("The word length is  ${it.length}") }
    // ?: Elvis operator setting up default data
    var Name = nullableName ?: "Guest" // The Elvis operator (?:) check if the variable (nullableName)
    // already have data assigned ("Samuel") and if does the data will be assigned to the variable Name
    // and will be print to the terminal
    println("Name is $Name") // output: Name is Samuel
    nullableName = null
    Name = nullableName ?: "Guest" // The Elvis operator (?:) check if the variable (nullableName)
    // already have data assigned if their no data/data equal null the default data "Guest" will be
    // assigned to Name and be printed out to the terminal.
    println("Name is $Name") // output: Name is Guest
}
// Parameters two integers returns an Integer
fun addUp(a: Int, b: Int) : Int {
    return a+b
}