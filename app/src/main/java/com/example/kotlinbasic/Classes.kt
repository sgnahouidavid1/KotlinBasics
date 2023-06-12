package com.example.kotlinbasic

import java.lang.IllegalArgumentException

class Person (firstName: String = "John" , lastName: String = "Doe"){
    // Member Variables (a variable within a class)
    var firstName = "John"
    var lastName = "Doe"
    var age: Int? = null
    var cosc_class : String = "Unknown"
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
        // this will be print when the class Person is used.
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int, Cosc_class: String): this(firstName,lastName)
    // firstName and lastName come from the primary constructor
    {
        this.age = age // putting data in age that belong to (Member Variables)
        this.firstName = firstName
        this.lastName = lastName
        this.cosc_class = Cosc_class
    }

    // Member functions - Methods (a function within a class)
    fun stateClasses (){
        println("$firstName $lastName is at age $age and has a $cosc_class class")

    }

}
class Cars (){
    // Member Variables
    lateinit var owner : String // lateinit is used for allowing the variable to be Initialize later
    val myBrand: String = "BMW"
    // Custom getter is Public
    get(){
        // field is use as a place holder for whatever Member Variables is going to use.
        return field.lowercase() //changing the member variables to lower case
    }
    var maxSpeed: Int = 250
    // Setter is Public
        set(value){
            field = if (value > 0)
            {
                value
            }else throw IllegalArgumentException("Maxspeed can not be less than zero")
        // here we have a if and else statement in one line, when setting the maxSpeed to a number less than zero
        // then a  arrow will be shown as a IllegalArgumentException "Maxspeed can not be less than zero"
    }
    // Setter is Private
    var myModel :  String = "M5"
        private set

    init{
        this.myModel = "M6" // (myModel) Setter is private so it can only be assign inside the
        // class Cars.
        this.owner = "Unknown" // you must initialize the variable before using it.
    }

}

