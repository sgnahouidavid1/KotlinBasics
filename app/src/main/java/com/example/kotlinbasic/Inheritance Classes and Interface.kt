package com.example.kotlinbasic

// The Class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class, and the class whose feature are
// inherited is called the Super class or Parent class
// or Base class

interface  breeders { // Interface are useful when you want to implement certain function later on
    val Gender: String
    fun young(): String
    fun matedWithMale(){ // because this function has a body while in the interface it doesn't need to
        // be override in the super class and can be used in the sup class.
        println("The bread able bird  has mated")
    }

}



// a class must be open for it to be inherited to another class
// Vehicles is the Super Class/Parent Class/Base Class
open class Vehicles {
    // properties
    // methods
}

// Inheriting from the class Vehicles above
// we will take the properties and methods and make them reusable.
// Car is the Sub Class/Child Class/Derived Class of Vehicle
// Car is the Super Class/Parent Class/Base Class of Vehicles
open class Car : Vehicles (){

}
// ElectricCars is the Sub Class/Child Class/Derived Class of Car
class ElectricCars : Car () {

}
// Birds is the Super Class/Parent Class/Base Class of FlyingBirds
open class Birds (override val Gender: String, val name: String, val species: String): breeders {
    open var range: Int = 0 // open properties can be override in a class that inherits the properties.
    fun updateSpeed (amount: Int){
        if (amount > 0)
            range += amount
    }
    // opening a class function so its possible to override in a inherited class.
    open fun flight (distance:Long) {
        println("$name flew for a distance of $distance KM")
    }
    fun running (distance: Long){
        println("$name ran for a distance of $distance KM")
    }
    // shorter way to write this function is override fun young(): String = "The bird is young enough to bear children"
    override fun young():String{
        return "The $name is young enough to bear children"
    }// the young function is coming from the Interface breeders that we created above.
}
// FlyingBirds is the Sub Class/Child Class/Derived Class of Birds
// must have the all the parameter as the class it being inherited from (Birds) and more parameters can be added
class FlyingBirds (Gender:String, name: String, species: String, Weight : Int): Birds(Gender, name, species) {
    // we can add other variable that doesn't belong the the the super class Birds
    var carnivores_omnivores_herbivores: String = "Unknown"
    // overriding properties:
    override var range = Weight * 3 // to override a properties the properties must be open
    override fun flight(distance: Long) {
        println("$name flew through the sky for a distance of $distance KM")
    }
    fun flight (){
        println("$name flew through the sky for a distance of $range KM")
    }

    override fun matedWithMale() {
        super.matedWithMale() // super keyword is used to call the matedWithMale() function from the super class.
        println("The bread able bird $name has mated")
    }
}

fun main(args: Array<String>){
    var bird = Birds("male","Emu", "ratites")
    var flyingbird = FlyingBirds("female", "Pigeons","Rock Dove", 60 )
    flyingbird.updateSpeed(50)
    flyingbird.flight()
    // Polymorphism
    bird.running(124)
    println(flyingbird.young())
    flyingbird.matedWithMale()


}
// the class FlyingBirds was able to use the function flight when it
// the function flight wasn't in FlyingBirds because the class FlyingBirds inherited the function from
// the class Birds.