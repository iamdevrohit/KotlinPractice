package com.esjayit.kotlinpractice.urmi.ControlFlow

/** unlabelled continue ::
 *          -breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.*/

/**  Use of unlabelled continue in while loop –
* - In Kotlin, unlabelled continue is used to skip the current iteration of the nearest enclosing while loop.
* - If the condition for continue is true, then it skips the following instructions of continue and reaches to the starting of while loop.
* - Again, it will check for the condition and loop will be in repetition mode until it becomes false.**/

//Example::

//fun main(args: Array<String>) {
//    var num = 0
//    while (num <= 12) {
//        if (num % 3 == 0) {
//            num++
//            continue
//        }
//        println(num)
//        num++
//    }
//}
//Output:
//
//
//1
//2
//4
//5
//7
//8
//10
//11

/**Use of unlabelled continue in do-while loop –::
 *          -we can use the unlabelled continue to skip the iteration of the nearest closing loop.
 *          -we need to put the condition for continue in do block.
 *          -If condition becomes false it will skip the following instruction and transfer control to the while condition.*/

//fun main(args: Array<String>) {
//    var num = 1
//    do {
//        if (num <= 5 || num >=15) {
//            num++
//            continue
//        }
//        println("$num")
//        num++
//    } while (num < 20)
//}
//Output:
//
//
//6
//7
//8
//9
//10
//11
//12
//13
//14

/** Use of unlabelled continue in for loop –::
 *          we can use unlabelled continue to skip the current iteration to the closing loop
 * */

//Example::
//fun main(args: Array<String>) {
//	var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
//	for (i in planets.indices) {
//		if(i < 2){
//			continue
//		}
//		println(planets[i])
//	}
//}
//Output:
//
//
//Venus
//Jupiter
//Saturn