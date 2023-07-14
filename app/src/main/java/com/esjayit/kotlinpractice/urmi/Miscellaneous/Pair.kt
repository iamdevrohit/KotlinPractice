package com.esjayit.kotlinpractice.urmi.Miscellaneous

/*** Pair::
 *          provides a simple datatype to store two values in a single instance.
 *          It is a simple generic class that can store two values
 *          it can be same data type or can be not same data type
 *          there can or can not be a relationship between the two values.
 *          [[data class Pair<out A, out B> : Serializable]]
 *          */

//Kotlin program to retrieve the values of Pair using properties –
//
//fun main() {
//    // declare pair
//    var pair = Pair("Hello Geeks", "This is Kotlin tutorial")
//    println(pair.first)
//    println(pair.second)
//}
//Output:
//
//Hello Geeks
//This is Kotlin tutorial

/** using ToString and list of ()::
 *
 *  */

//fun main() {
//    val obj = Pair(5,5)
//    println("String representation is "+obj.toString())
//    val pair = Pair("Geeks", listOf("Praveen", "Gaurav", "Abhi"))
//    print("Another string representation is "+pair.toString())
//}
//Output:
//
//String representation is (5, 5)
//Another string representation is (Geeks, [Praveen, Gaurav, Abhi])


/** With a Extension Functions :: toList()
 * **/

//fun main() {
//    // first pair
//    var obj = Pair(1,2)
//    val list1: List<Any> = obj.toList()
//    println(list1)
//    // second pair
//    var obj2 = Pair("Hello","Geeks")
//    val list2: List<Any> = obj2.toList()
//    println(list2)
//}
//Output
//
//[1, 2]
//[Hello, Geeks]