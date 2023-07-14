package com.esjayit.kotlinpractice.urmi.ControlFlow

/**Unlabelled break::
 *           is to used to exit the loop when it satisfies a specific condition without checking the test expression.
 * */

/** Use of unlabelled break in while loop::
 *               used to exit the loop when it satisfies a specific condition without checking the test expression
 *               Example::
 *               */
//fun main(args: Array<String>) {
//    var sum = 0
//    var i = 1
//    while(i <= Int.MAX_VALUE) {
//        sum += i
//        i++
//        if(i == 11) {
//            break
//        }
//    }
//    print("The sum of integers from 1 to 10: $sum")
//}
//Output:
//
//The sum of integers from 1 to 10: 55

/** Use of unlabelled break in do-while loop –
            - In do-while loop also we can use the break expression to exit the loop without checking the test expression.*/

//fun main(args: Array<String>) {
//    var names = arrayOf("Earth","Mars","Venus","Jupiter","Saturn","Uranus")
//    var i = 0
//
//    do{
//        println("The name of $i th planet: "+names[i])
//        if(names[i]=="Jupiter") {
//            break
//        }
//        i++
//    }while(i<=names.size)
//}
//Output:
//
//The name of 0 th planet: Earth
//The name of 1 th planet: Mars
//The name of 2 th planet: Venus
//The name of 3 th planet: Jupiter


/**  Use of unlabelled break in for loop –
            We can use break expression while traversing the for loop with in an array or string.
 `          we traverse the string to break at a particular position by comparing the char value.*

Example::
 */
//fun main(args: Array<String>) {
//
//    var name = "GeeksforGeeks"
//    for (i in name){
//     print("$i")
//          if(i == 's') {
//            break
//          }
//    }
//}
//Output:
//
//Geeks