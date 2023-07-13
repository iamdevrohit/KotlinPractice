package com.esjayit.kotlinpractice.urmi.ControlFlow

/**For Loop:
 *      for loop is used to traverse through any data structure which provides an iterator
 * **/

/** Iterate through range using for loop –
 *              The in operator used in for loop to check value lies within the Range or not.
 *
 *   Example::           **/

//Iterate through range to print the values:
//fun main(args: Array<String>)
//{
//    for (i in 1..6) {
//        print("$i ")
//    }
//}
//Output:
//
//1 2 3 4 5 6

/**Iterate through range to jump using step-3 :*/
//fun main(args: Array<String>)
//{
//    for (i in 1..10 step 3) {
//        print("$i ")
//    }
//}
//Output:
//
//1 4 7 10


/**  array using for loop –
 *              Array can be traversed using for loop because it also provides iterator.
 *              Each array has a starting index and by default, it is 0.*/

/**  without using index property:
fun main(args: Array<String>) {
var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)

for (num in numbers){
if(num%2 == 0){
print("$num ")
}
}
}
Output:

2 4 6 8 10*/