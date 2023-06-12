package com.example.kotlinbasic

// set is a type of collection that eliminates duplicate data
// This collection is unordered which means the elements are not sorted the immutable class
// is set off the mutable types are mutable set.
fun main(args: Array<String>){
    // SET:
    val fruits = setOf("Orange", "Apple", "Grape","Mango","Apple","Grape") // the size of the set is four because
    println(fruits.size)// there is only 4 unique item inside the set (Apple,Orange,Grape)
    println(fruits.toSortedSet()) // "duplicates are ignored" // The set is not mutable
    val newFruits = fruits.toMutableSet() // making the set a mutable set
    newFruits.add("Water Melon") // add Water Melon to the set
    newFruits.add("Pear") // add Pear to the set
    println(newFruits)
    // To access a certain element within a set
    println(newFruits.elementAt(4)) // Water Melon
    //LIST:
    // creating a list and making it mutable to new element can be added.
    val fruit = listOf("Orange", "Apple", "Grape","Mango","Apple","Grape")
    val newFruit = fruit.toMutableList()
    newFruit.add("Strawberry")
    println(newFruit)

    //MAP:
    // map list are a type of collection that holds data in the form of a key value
    // pair and the map keys are unique and hold only one value for each key
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday", 4 to "Thursday", 5 to "Friday")
    println("Today is ${daysOfTheWeek[1]}") // Monday
    // Looping through the unique keys within map add also accessing the elements (daysOfTheWeek)
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }
    // using a data class to create a map of numbers (keys) and the name, prices and number of Fruits (element)
    val fruitsMap = mapOf("Grapes" to Fruit(3.65 , 16), "Apple" to Fruit(2.00, 4),
        "Oranges" to Fruit(4.00, 5),"Mangoes" to Fruit( 3.25,3))
    //To make changes fruitsMap
    val mutfruitsMap = fruitsMap.toMutableMap()
    mutfruitsMap["Banana"] = Fruit(2.34,4)

    for (fruit in mutfruitsMap.keys)
        println("$fruit is to ${mutfruitsMap[fruit]}")
}
data class  Fruit( val price: Double, val numberOfFruits: Int)