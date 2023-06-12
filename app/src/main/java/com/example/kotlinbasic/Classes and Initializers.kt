package com.example.kotlinbasic

fun main (args: Array<String>){
    //Person Class example:

    var Student = Person("Samuel","Gnahoui-David", 24,"Cosc 250") // created our own type called Person using Classes
    /*
    Student.Cosc_class = "Cosc 450"
    Student.age = 25
    println("Student is ${Student.age} years old")
    //var Unknown = Person() // No data arguments are passed in to Person so the default data was used
    */
    Student.stateClasses()
    /*
    var MyCar = Cars()
    println("The brand of the car is ${MyCar.myBrand} ")
    MyCar.maxSpeed = -5 // In this line we are setting the Member Variables with the data 200
    println("The car has a max speed of ${MyCar.maxSpeed}") // In this line were getter the date within the Member Variables (maxSpeed)
    // MyCar.myModel = "GS"  Cannot assign to myModel because it is a private Setter in the class Cars
    println("The model of the car is ${MyCar.myModel} ") // (Getter) We can still get the information assign to
    // myModel because the getter is not private.
    */
    // Data class functionalities
    val user = User(1,"Samuel")
    val updatedUser = user.copy(name = "Joel") // here we are using .copy to copy the info from user
    // to updatedUser and changing the date assigned to name from "Samuel" to "Joel"
    println("User Details: $updatedUser")
    println(updatedUser.component1()) // prints the first member variable (id) data
    println(updatedUser.component2()) // prints the second member variable (name) data
    // Deconstructor
    val (id,name) = updatedUser // this line is the same as (val id = updatedUser.id)
    // (val name = updatedUser.name)
    println("id = $id, name = $name" )
}
