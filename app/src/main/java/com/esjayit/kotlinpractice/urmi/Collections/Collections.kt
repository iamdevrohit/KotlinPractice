package com.esjayit.kotlinpractice.urmi.Collections

import android.os.Build
import androidx.annotation.RequiresApi

/***Collections::
 *
 * Type of collection ::
 *          1) mutable :: that can  be change , support read and write
 *          2) immutable :: that can not be change ,support  read only
 */
/**  1) immutable
 * List():: collection of list that allow a duplication 
 * */
//fun main() {
//     val student = listOf("aaa" , "bbb" , "ccc")
//    for (item in student){
//        println(item
//        )
//    }
//}
//output::
//aaa
//bbb
//ccc

/**  setof() :: it support a all type of data type
 *              not support a duplication value
 *              */
//fun main() {
//    val employee = setOf("developer","coder", "hr" , "hr", 100.000,2000,30000)
//    for (item in employee ){
//        println(item)
//    }
//}
//output::
//developer
//coder
//hr
//100.0
//2000
//30000

/**MapOf():: it always define in pair of key and value
 *        ::* it don't allow a duplicate value(key is different but value is same  taht is support)  */

//fun main() {
//    val food = mapOf(1 to "panipuri" , 2 to "pizza" , 3 to "burger",4 to "burger")
//    for (item in food){
//        println(item)
//    }
//}
//output::
//1=panipuri
//2=pizza
//3=burger
//4=burger


/**  mutable::
 * List – mutableListOf(),arrayListOf() and ArrayList
    Set – mutableSetOf(), hashSetOf()
    Map – mutableMapOf(), hashMapOf() and HashMap
 */
/** List – mutableListOf(),*/
//fun main() {
//    var employee = mutableListOf("riya","priya","mira")
//    employee[0]= "radha"
//    employee.add("gopi")
//    for (item in employee){
//        println(item)
//    }
//}
//output::
//radha
//priya
//mira
//gopi
/*** List –arrayListOf()*/
//fun main() {
//    var employee = arrayListOf("riya","priya","mira")
//    employee[0]= "radha"
//    employee.add("gopi")
//    for (item in employee){
//        println(item)
//    }
//}
//Output::
//radha
//priya
//mira
//gopi
/** Set – mutableSetOf(), */

//fun main() {
//    var student = mutableSetOf( "urmi" ,"simran","bhumi","shreya")
//    student.add("niyati")
//    student.remove("urmi")
//  //  student.clear()
//    for (item in student){
//        println(item)
//    }
//}
//output::
//simran
//bhumi
//shreya
//niyati
/** Set –  hashSetOf()**/
//fun main() {
//    val rollNo = hashSetOf(1,2,3,4,5)
//    println(rollNo)
//    print("")
//    rollNo.add(9)
//    rollNo.remove(2)
//    println(rollNo)
//    val student = hashSetOf("aaa","bbb","ccc")
//    println(student)
//    print("")
//    student.add("ddd")
//    student.remove("ccc")
//    println(student)
//}
//output::
//[1, 2, 3, 4, 5]
//[1, 9, 3, 4, 5]
//[aaa, ccc, bbb]
//[aaa, bbb, ddd]
/**   Map – mutableMapOf() **/
//
//@RequiresApi(Build.VERSION_CODES.N)
//fun main() {
//    val set = mutableMapOf( 1 to "aaa", 2 to "qqqq", 3 to "pppp")
//    println(set)
//    set.replace(2, "qqqq", "bbb")
//    println(set)
//}
//output::
//{1=aaa, 2=qqqq, 3=pppp}
//{1=aaa, 2=bbb, 3=pppp}

/**   Map –  hashMapOf() *///

//@RequiresApi(Build.VERSION_CODES.N)
//fun main() {
//    val set = hashMapOf( 1 to "aaa", 2 to "qqqq", 3 to "pppp")
//    println(set)
//    set.replace(2, "qqqq", "bbb")
//    println(set)
//}
//output::
//{1=aaa, 2=qqqq, 3=pppp}
//{1=aaa, 2=bbb, 3=pppp}
