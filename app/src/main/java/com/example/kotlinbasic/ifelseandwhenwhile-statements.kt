package com.example.kotlinbasic

fun main (args:Array<String>){
    var isActive = false
    // if\else Statements
    if(isActive == true){
        println("the user is active") // checking if isActive equals true,
        // if so print "the user is active"
    }else if (isActive == false){
        println("The user is not active") // checking if isActive equals false,
        // if so print "the user is not active"
    }else {
        println("All the condition failed")
    }
    // when Statement:
    val alarm = 25
    when(alarm){
        12,10, 15 -> println("The time is $alarm")
        7 -> println("The time is $alarm")
        14 -> println("The time is $alarm")
        in 20 .. 30 -> println(" The number is in range(20 .. 30) : $alarm" )
        else -> println("The time is $alarm")
    }
    var Studentage = 50
    when(Studentage){
        in 1 .. 20 -> println("age is to young for Bar hopping ")
        in 21 .. 40 -> println("age is good for Bar hopping ")
        else -> println("too old for bar hopping")

    }
    var element: Any = 13.372
    when(element){
        is Int -> println("$element is a  Integer")
        is String -> println("$element is a  String")
        is Float -> println("$element is a Float")
        is Double -> println("$element is a Double ")
        else -> println("$element is none of the ones above")
    }
    // while loop example (break\continue)
    var num = 0
    while (num < 10) {
        num++
        if (num > 2 && num < 8){
            continue
        }
        else if (num == 9){
            break
        }
        println(num)


    }
    /*
    results:
                1
                2
                8
     */
    // Arrays
    val names = arrayOf("John", "Stephen", "Megan")
    println("The name is ${names [0]}")
    val ages = arrayOf(30, 50,83,26,36)
    println("The age is ${ages[2]}")

    // do while loop
    element = 1
    do{
        print("$element ")
        element++
    }while (element <= 10 )
    var Felttemp = "cold"
    var roomTemp = 10
    do {
        println("It is $Felttemp in the room and the temperature is $roomTemp")
        roomTemp++
        if (roomTemp >= 20) {
            Felttemp = "hot"
            println("It is $Felttemp in the room and the temperature is $roomTemp")
        }
    }while(Felttemp == "cold")



}

