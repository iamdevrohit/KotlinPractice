package com.esjayit.kotlinpractice.urmi.Collections

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.coroutines.delay
import java.util.Random
import kotlin.math.log


/** Arraylist
 *       - it is create  dynamically array in class
 *       - we can ncurses or  decrees the type of array  per requesting
 *       - it also support a duplication value
 *
 * */
/** array with add function */
//fun main() {
//     var array =ArrayList<String>()
//    array.add("fruit" + " car " + " scouter")
//
//    println(array)
//
//    array.add(0, " mango")
//    array.add(1,"apple")
//
//    println(array)
//}
//output::
//[fruit car  scouter]
//[ mango, apple, fruit car  scouter]

/** array with addall()*/

//fun main() {
//    var student = ArrayList<String>()
//    student.add("urmi")
//    student.add("vyas")
//    student.add("mca")
//
//    var arraylist1 = ArrayList<String>()
//    println("-----")
//
//    arraylist1.addAll(student)
//    for (item in arraylist1){
//        println(item)
//    }
//}
//output::
//urmi
//vyas
//mca


//@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //filter
    var name = listOf( " abc " , "bvn","aml", "vimal","vv ")
     val length = name.filter { it.length > 3 }
    println(length) // abc

    //filter with map
    val student = mapOf( "riya" to 10 ,  "priya" to 90,  "jiya" to 50)

    val filteredMap = student.filter { (key, value) ->
        key.endsWith("riya") && value > 10}
    println(filteredMap) // {priya=90}

    //filterIndexed
    val fIndex = name.filterIndexed{ index, s -> (index != 2 ) && (s.length > 2) }
    println(fIndex)//[ abc , bvn, vimal, vv ]

    //   Partitioning = split a list into a pair of two lists by a given predicate function
    val fun1 = listOf("hello","how","are you","i ", "am ","fine ")

    val (first, second) = fun1.partition { it.length > 3}
    println(first)//[hello, are you, fine ]
    println(second)//[how, i , am ]

 //   any
    val fun2 = listOf("hello","how","pre you")
    println("any word is end with w:" +fun2.any{it.endsWith("w")})//any word is end with w :true
//    none
    println("any word is end with o:"+fun2.none{it.endsWith("o")})//any word is end with o:false
//    all
    println("hny hord htart with h:" +fun2.all { it.startsWith("h") })//any word start with h :false



}



//fun main() {
//    val myRandomValues = List(5) { Kotlin.random.Random }
//
//    // Prints a new sequence every time
//    println(myRandomValues)
//
//}
/*** parallelStream ::We can use the launch() and async() functions to run coroutines in parallel.
Launch()::
    The launch will not block the main thread, but on the other hand,
    the execution of the rest part of the code will not wait for the launch result since launch is not a suspend call.
    used at places where users do not want to use the returned result

 * */









