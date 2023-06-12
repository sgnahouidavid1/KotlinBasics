package com.example.kotlinbasic

fun main(args: Array<String>){
    val stringList: List<String> =  listOf("Denis","Frank","Michael", "Garry") // list of string objects
    val mixedTypeList: List<Any> = listOf("Denis", 31,5,"BDay",70.5,"weighs","Kg")// list of any data type objects

    for(value in mixedTypeList){
        if (value is Int){
            println("Integer: $value")
        }else if (value is Double){
            println("Double: $value with Floor value ${Math.floor(value)}")
        }else if (value is String){
            println("Unknown type")
        }
    }
    // Alternative way to what is shown above
    for(value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${Math.floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else->println("Unknown Type")
        }
    }
    // Smart Cast
    val obj1: Any = "I have a dream"
    if(obj1 !is String){ // checking if obj1 is not a String
        println("Not a String")
    }else {
        // obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    //Explicit (unsafe) Casting using the "as" Keyword - can go wrong
    val str1: String = obj1 as String // created value str1 as a string data type and assign the data in
    // obj1 as a string, this could only work if obj1 is a string
    println(str1.length)
    /*
    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)
    // this can go wrong because it is unsafe casting.
    // obj2 is of Any type and is assign data the is an Integer so now obj2 is of type Int, so when str2
    // is assigning obj2 as a string it cause an error because obj2 is already of type Int and can't be change.
     */

    // Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // Works
    println(str3) // Prints null
}


