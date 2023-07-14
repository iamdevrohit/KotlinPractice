package com.esjayit.kotlinpractice.urmi.Miscellaneous

/** Triple
 *       -a datatype that is recommended to store three related values together or return three values from a function
        - it is a simple generic class that stores any three values,
        - there is no valuable meaning of the relationship between the three values
        - the constructor is a special member function that is invoked when an object of the class
            is created primarily to initialize variables or properties.
 *    Example::
 *    **/
//fun main() {
//    val (x, y, z) = Triple(1, "Geeks", 2.0)
//    println(x)
//    println(y)
//    println(z)
//}

//Output:
//
//1
//Geeks
//2.0


/***Kotlin program to retrieve the values of Triple using properties:*/
//fun main() {
//    // declare triple
//    var triple = Triple("Hello Geeks",
//                        "This is Kotlin tutorial",
//                        listOf(10, 20, 30))
//    println(triple.first)
//    println(triple.second)
//    println(triple.third)
//}
//Output:
//
//Hello Geeks
//This is Kotlin tutorial
//[10, 20, 30]


/**  Functions::
                toString(): This function returns the string equivalent of the Triple. **/

//fun main() {
//    // first triple
//    val triple = Triple(5, 5, 5)
//    println("String representation is "+triple.toString())
//
//      // second triple
//    val triple2 = Triple("Geeks",
//                         listOf("Praveen", "Gaurav", "Abhi"),
//                         12345)
//    print("Another string representation is "+ triple2.toString())
//}
//Output:
//
//String representation is (5, 5, 5)
//Another string representation is (Geeks, [Praveen, Gaurav, Abhi], 12345)
/**  Extension Functions::
 *                   add more functionality to the existing classes, without inheriting them.
 *                   */
//fun main() {
//    // first triple
//    var obj = Triple(1, 2, 3)
//    val list1: List<Any> = obj.toList()
//    println(list1)
//
//      // second triple
//    var obj2 = Triple("Hello", 2.0000 ,
//                      listOf(10, 20, 30))
//    val list2: List<Any> = obj2.toList()
//    println(list2)
//}
//Output:
//
//[1, 2, 3]
//[Hello, 2.0, [10, 20, 30]]
