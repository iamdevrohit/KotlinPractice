package com.esjayit.kotlinpractice

fun main(){

    /**
     Let Keyword

     let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
     Kotlin let is a scoping function wherein the variables declared inside the expression cannot be used outside.
     An example demonstrating kotlin let function is given below. */

//     var str = "Hello World"
//     str.let { println("$it!!") }
//     println(str)

     /**
     it keyword contains the copy of the property inside let.
     The last value from the let is returned as an argument as shown below. */

     /**
      * Chaining let functions
      */

//     var a = 1
//     var b= 2
//
//     a = a.let { it + 2 }.let { it + b }.let { var i = it+100
//     i.let { it+1000 }
//     }
//     println(a) //5

     /**
      * Nesting let
      */

//     var x = "Anupam"
//     x.let {
//               outer -> outer.let {
//               inner -> print("Inner is ${inner.let { it+"a" }} and outer is $outer")
//     } }  //Inner is Anupam and outer is Anupam

     /**
     For nested let, we can’t use it keyword. We need to assign explicit names to it in both the let functions.
     Only the outermost let returns the value as shown below.
     */

     var x = "Anupam"
     x = x.let { outer ->
          outer.let { inner ->
             println("Inner is $inner and outer is $outer")
             "Kotlin Tutorials Inner let"
          }
          "Kotlin Tutorials Outer let"
     }
     println(x) //prints Kotlin Tutorials Outer let


     /**
      * let for null checks
      */

//     var name : String? = "Kotlin let null check"
//     name?.let { println(it) } //prints Kotlin let null check
//     name = null
//     name?.let { println(it) } //nothing happens

}