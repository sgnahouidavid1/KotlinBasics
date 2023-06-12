package com.example.kotlinbasic
// Exception
/*
An Exception is a runtime problem which occurs in the program and leads to program termination.
- running out of memory
- array out of bound
-condition like divided by zero
To handle these type of problems during program execution the technique of exception handling is used.
Exception handling is a technique which handles the runtime problems and maintains the flow of program execution
// Throwable Class
throw MyException("This throws an exception")
There are four different keywords used in exception handling. these are:
- try
The try block contains a set of statements which might generate an exception. IT must be followed by
either catch or finally or both.
- catch
The catch block is used to catch the exception thrown try block.
- finally
finally block always execute whether exception is handled or not. So it is used to execute important code statement.
(like closing buffers)
- throw
The throw keyword is used to throw an exception explicitly.

// Unchecked Exception
Unchecked exception is that exception which is thrown due to mistakes in our code

This exception type extends the RuntimeException class.

The Unchecked exception is checked at run time.
// Example of in unchecked exception
- ArithmeticException:
thrown when we divide a number by zero
- ArrayIndexOutOfBoundExceptions:
thrown when an array hes been tried to access with incorrect index value
- SecurityException
thrown by the security manager to indicate a security violation.
- NullPointerException:
thrown when invoking a method or property on a null object.
// Checked Exception
A Check exception is checked at compile tim.
This exception type extends the Throwable class.
Example of checked exceptions:
- IOException
- SQLException etc.

// try catch
try-catch block is used for exception handling in the code
Syntax of try with catch block
try {
        // cade that may be throw the exception

    } catch (e:SomeException){
        // code that handles the exception
    }

// Multiple catch Blocks
We can use multiple catch blocks in our code.
Multiple catch blocks are used when we are using different types of operations in
a try block which may cause different exceptions in the try block.
// Multiple catch Block example
fun main(args: Array<String>){
try {
    val a = IntArray(5)
    a[5] = 10/10
} catch (e: ArithmeticException) {
        println("arithmetic exception catch")
} catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outbounds exception")
} catch (e: Exception) {
        println("parent exception class")
}println("code after try catch ... ")
}

// Output: arithmetic exception catch
           code after try catch ...

// Nested try-catch block
We can also use nested try blocks whenever required.
The  requirement of nested try catch block arises when a block of code generates an exception and
within that block another code statement also generates another exception.
// Syntax of nested try block example
try {
// code block
    try {
        // code block
        } catch (e: SomeException) {
            // exception
            }
        } catch(e: SomeException) {
          // exception
        }
finally Block
finally block such block which is always executes whether exception is handled or not.
So it is used to execute important code statement.

// finally Block Example
fun main (args: Array<String>){
try {
    val data = 10/5
    println(data)
    } catch (e: NullPointerException){
    println(e)
    } finally {
        println("finally block always executes")
    }
        println("below code...")
}

// Output:
2
finally block always executes
below code...


// throw keyword
The Throw keyword is used to throw an explicit exception.
It is used to throw a custom exception.
To throw an exception object we will use the throw-expression.
Syntax of throw keyword
- throw SomeException()

// throw example
fun main (args: Array<String>) {
validate(15) // Another function
println("code after validation check ...")
}
fun validate(age:Int){
if(age < 18)
    throw ArithmeticException("under age")
    else
        println("eligible for drive")
}
// Output: Exception in thread "main" java.lang.ArithmeticException: under age
*/

