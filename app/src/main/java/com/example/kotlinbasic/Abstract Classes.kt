package com.example.kotlinbasic
// An abstract class cannot instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from an abstract class.
//The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.
abstract class Mammal(private val name: String, private val origin: String,
    private val weight: Double) { // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses and be override)
    abstract  var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses and be override)
    abstract fun run()
    abstract  fun breath()

    //Concrete (Non Abstract ) Method
    fun displayDetails() {
        println(" Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")

    }

    // Human class that Inherits from the abstract class Mammal
    class Human (name:String, origin:String, weight: Double, override var maxSpeed: Double ):Mammal(name, origin,weight)
    {
        override fun run() {
           // Code to run
            println("Runs on two legs")
        }

        override fun breath() {
            // Code to run
            println("Breath through mouth or nose")
        }
    }
    class Elephant(name:String, origin:String, weight:Double, override var maxSpeed: Double):Mammal(name,origin,weight){
        override fun breath() {
            //Code to run
            println("Runs on four legs")
        }

        override fun run() {
            // Code to breath
            println("Breath through the trunk")
        }
    }
}

fun main(args: Array<String>){
    // you can only make instances for classes the inherited from the abstract class.
    val human = Mammal.Human("Samuel", "USA", 135.0, 30.0)
    val elephant = Mammal.Elephant("Rosy", "India",5400.0, 25.0)
    // you can't create instances of a abstract class val mammal = Mammal("Jeff", "canada",35.0)
    human.run()
    elephant.run()
    human.breath()
    elephant.breath()
}

// What is the different between a classes and an Interface.
/*
An Interface can not hold state and can be implement multiple times but there can be only one class that can be inherited from.
also class have constructors. Interfaces can not hold fields
summary: abstract class has everything Interfaces has and additionally they can have fields and constructors
 */