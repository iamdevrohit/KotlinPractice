package com.esjayit.kotlinpractice.urmi.NullSafety

/*** NullSafety ::
 *          - a procedure to eliminate the risk of null reference from the code.
 *
 *   possible causes::
 *          - Explicit call to throw NullPointerException()
            - Use of the !! operator
            - Some data inconsistency with regard to initialization
            - Use of external java code as Kotlin is Java interoperability.
 *
*/
/** String can not hold null. If we try to assign null to the variable, it gives compiler error.


var s1: String = "Geeks"
s1 = null // compilation error

 **** To allow a variable to hold null, we can declare a variable as nullable string,
 *
var s2: String? = "GeeksforGeeks"
s2 = null // ok
print(s2)
 */

/**  program of non-nullable type – **/
//fun main(args: Array<String>){
//    // variable is declared as non-nullable
//    var s1 : String = "Geeks"
//
//    //s1 = null  // gives compiler error
//
//    print("The length of string s1 is: "+s1.length)
//}
//Output:
//
//
//The length of string s1 is: 5
/**  Kotlin program of nullable type- */
// fun main(args: Array<String>) {
//    // variable is declared as nullable
//    var s2: String? = "GeeksforGeeks"
//
//    s2 = null    // no compiler error
//
//    println(s2.length)  // compiler error because string can be null
//}
//Output:
//
//
//Error:(8, 15) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?


/**  Checking for null in conditions –
        - The most common way of checking null reference is using if-else expression.
        - We can explicitly check if variable is null, and handle the two options separately.*/

//checking null in conditions –
//fun main(args: Array<String>) {
//    // variable declared as nullable
//    var s: String? = "GeeksforGeeks"
//    println(s)
//    if (s != null) {
//        println("String of length ${s.length}")
//    } else {
//        println("Null string")
//    }
//    // assign null
//    s = null
//    println(s)
//    if (s != null) {
//        println("String of length ${s.length}")
//    } else {
//        println("Null String")
//    }
//}
//Output:
//
//
//GeeksforGeeks
//String of length 13
//null
//Null String

/**  Safe Call operator(?.)::
 *          that reduces this complexity and execute an action only when the specific reference holds a non-null value..
 *          It allows us to combine a null-check and a method call in a single expression.
 *      */
//fun main(args: Array<String>) {
//    // variable declared as nullable
//    var firstName: String? = "Praveen"
//    var lastName: String? = null
//
//    println(firstName?.toUpperCase())
//    println(firstName?.length)
//    println(lastName?.toUpperCase())
//}
//Output:
//
//
//PRAVEEN
//7
//null

/**  let() method –
        - To execute an action only when a reference holds a non-nullable value, we can use a let operator.*/
//fun main(args: Array<String>) {
//    // created a list contains names
//    var stringlist: List<String?> = listOf("Geeks","for", null, "Geeks")
//    // created new list
//    var newlist = listOf<String?>()
//    for (item in stringlist) {
//        // executes only for non-nullable values
//        item?.let { newlist = newlist.plus(it) }
//    }
//    // to print the elements stored in newlist
//    for(items in newlist){
//        println(items)
//    }
//}
//Output:
//
//
//Geeks
//for
//Geeks
/**  Also() method :: –
        -If we want to apply some additional operation like printing the non-nullable items of the list we can use an also() method **/

//fun main(args: Array<String>) {
//    // created a list contains names
//    var stringlist: List<String?> = listOf("Geeks","for", null, "Geeks")
//    // created new list
//    var newlist = listOf<String?>()
//    for (item in stringlist) {
//        // executes only for non-nullable values
//        item?.let { newlist = newlist.plus(it) }
//        item?.also{it -> println(it)}
//    }
//}
//Output:
//
//
//Geeks
//for
//Geeks

/**  run() method –
        -Kotlin has a run() method to execute some operation on a nullable reference*
        - it seems to be very similar to let() but inside of a function body,
        - the run() method operates only when we use this reference instead of a function parameter:

 */

//fun main(args: Array<String>) {
//    // created a list contains names
//    var stringlist: List<String?> = listOf("Geeks","for", null, "Geeks")
//    // created new list
//    var newlist = listOf<String?>()
//    for (item in stringlist) {
//        // executes only for non-nullable values
//        item?.run { newlist = newlist.plus(this) } // this reference
//        item?.also{it -> println(it)}
//    }
//}
//Output:
//
//
//Geeks
//for
//Geeks
/**Elvis Operator(?:) –
        The Elvis operator is used to return a non-null value or a default value when the original variable is null.
 * Example;:*/
//fun main(args: Array<String>) {
//    var str : String?  = "GeeksforGeeks"
//    println(str?.length)
//    str = null
//    println(str?.length ?: "-1")
//
//}
//Output:
//
//
//13
//-1
/** Not null assertion : !! Operator
    -The not null assertion (!!) operator converts any value to a non-null type and throws an exception if the value is null.
 Example::
 */

//fun main(args: Array<String>) {
//    var str : String?  = "GeeksforGeeks"
//    println(str!!.length)
//    str = null
//    str!!.length
//}
//Output:
//
//
//13
//Exception in thread "main" kotlin.KotlinNullPointerE