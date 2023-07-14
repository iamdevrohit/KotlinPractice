package com.esjayit.kotlinpractice.urmi.ControlFlow

/**  When Expression ::
 *              A certain block of code needs to be executed when some condition is fulfilled.
 *              The argument of when expression compares with all the branches one by one until some match is found
 *
 *              Example:
 *              **/
//Using when as a statement with else
//fun main (args : Array<String>) {
//	print("Enter the name of heavenly body: ")
//	var name= readLine()!!.toString()
//	when(name) {
//		"Sun" -> print("Sun is a Star")
//		"Moon" -> print("Moon is a Satellite")
//		"Earth" -> print("Earth is a planet")
//		else -> print("I don't know anything about it")
//	}
//}//output
//Enter the name of heavenly body: Sun
//Sun is a Star
//
//Enter the name of heavenly body: Mars
//I don't know anything about it

//Using when as a statement without else

//fun main (args : Array<String>) {
//    print("Enter the name of heavenly body: ")
//    var name= readLine()!!.toString()
//    when(name) {
//        "Sun" -> print("Sun is a Star")
//        "Moon" -> print("Moon is a Satellite")
//        "Earth" -> print("Earth is a planet")
//
//    }
//}
//output::
//Enter the name of heavenly body: : Mars
//Process finished with exit code 0

/**Using when as an- expression::
 *                  - expression, the value of the branch with which condition satisfied will be the value of overall expression
 *                  - As an expression when returns a value with which the argument matches and we can store it in a variable or print directly.
 *                  - in this case we are not put the else part there are throw a compiler error
 *                  -  Combine multiple branches in one using comma:
 *                 Example::
 *
 *
 *                 */
//fun main(args : Array<String>) {
//	print("Enter number of the Month: ")
//	var monthOfYear = readLine()!!.toInt()
//	var month= when(monthOfYear) {
//		1->"January"
//		2->"February"
//		3->"March"
//		4->"April"
//		5->"May"
//		6->"June"
//		7->"July"
//		8->"August"
//		9->"September"
//		10->"October"
//		11->"November"
//		12->"December"
//		else-> "Not a month of year"
//	}

/**  using a coma ::
 *  */
//when(name) {
//    "Mercury","Earth","Mars","Jupiter"
//    ,"Neptune","Saturn","Venus","Uranus" -> print("This is a planet")
//    else -> print("This not a planet")
//	print(month)
//}
//Output:
//
//Enter number of the Month: 8
//August
/** Check the input value in the range or not::
 *                               use the "in"  keyword
 *
 *           Example::
 *           */
//fun main (args:Array<String>) {
//	print("Enter the month number of year: ")
//	var num= readLine()!!.toInt()
//	when(num) {
//		in 1..3 -> print("Spring season")
//		in 4..6 -> print("Summer season")
//		in 7..8 -> print("Rainy season")
//		in 9..10 -> print("Autumn season")
//		in 11..12 -> print("Winter season")
//		!in 1..12 -> print("Enter valid month of year")
//	}
//}
//Output:
//
//Enter the month number of year: 5
//It is summer season
//
//Enter the month number of year: 14
//Enter valid month of year

/**Check given variable is of a certain type or not:

            Using is or !is operator we can check the type of variable passed as an argument in when block.
            If the variable is Integer type then is Int returns true else return false.
 * */
//
//fun main(args: Array<String>) {
//    var num: Any = "GeeksforGeeks"
//    when(num){
//        is Int -> println("It is an Integer")
//        is String -> println("It is a String")
//        is Double -> println("It is a Double")
//    }
//}
//Output:
//
//It is a String

/** Check that a string contains a particular prefix or suffix:**/

//fun hasPrefix(company: Any) = when (company) {
//    is String -> company.startsWith("GeeksforGeeks")
//    else -> false
//}
//
//fun main(args: Array<String>) {
//    var company = "GeeksforGeeks a computer science portal"
//    var result = hasPrefix(company)
//    if(result) {
//        println("Yes, string started with GeeksforGeeks")
//    }
//    else {
//        println("No, String does not started with GeeksforGeeks")
//    }
//}
//Output:
//
//Yes, string started with GeeksforGeeks