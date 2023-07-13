package com.esjayit.kotlinpractice.urmi.ControlFlow

/**  if statement ::
 *          It is used to specify whether a block of statements will be executed or not
 *          Example::
 *          */
//fun main(args: Array<String>) {
//    var a = 3
//    if(a > 0){
//        print("Yes,number is positive")
//    }
//}
//Output:
//
//Yes, number is positive


/**  if-else statement:
 *               ‘if’ statement is used to execute the block of code when the condition becomes true
 *               else’ statement is used to execute a block of code when the condition becomes false.
 *
 * Example::
 *
 *  ***/
//fun main(args: Array<String>) {
//    var a = 5
//    var b = 10
//    if(a > b){
//        print("Number 5 is larger than 10")
//    }
//    else{
//        println("Number 10 is larger than 5")
//    }
//}
//Output:
//
//Number 10 is larger than 5
/** if-else expression as ternary operator:
 *           if-else can be used as an expression because it returns a value
 *           if-else returns the value according to the condition and works exactly similar to ternary.
 *
 * Example::
 * **/
//fun main(args: Array<String>) {
//    var a = 50
//    var b = 40
//
//    // here if-else returns a value which
//    // is to be stored in max variable
//    var max = if(a > b){
//        print("Greater number is: ")
//        a
//    }
//    else{
//        print("Greater number is:")
//        b
//    }
//    print(max)
//}
//Output:
//
//Greater number is: 50

/**  if-else-if ladder expression:
 *                  - ‘if’ statements are executed from the top to bottom
 *                   - One by one all the conditions are checked
 *                   - if any of the conditions is found to be true then the code associated with the
 *                          if statement will be executed and all other statements bypassed to the end of the block
 *
 *    Example::
 *    **/
//import java.util.Scanner
//
//fun main(args: Array<String>) {
//
//	// create an object for scanner class
//	val reader = Scanner(System.`in`)
//	print("Enter any number: ")
//
//	// read the next Integer value
//	var num = reader.nextInt()
//	var result = if ( num > 0){
//		"$num is positive number"
//	}
//	else if( num < 0){
//		"$num is negative number"
//	}
//	else{
//		"$num is equal to zero"
//	}
//	println(result)
//
//}
//Output:
//
//Enter any number: 12
//12 is positive number
//
//Enter any number: -11
//-11 is negative number
//
//Enter any number: 0
//0 is zero

/** nested if expression:
 *              If the first condition is true then code the associated block to be executed,
 *              again check for the if condition nested in the first block
 *              if it is also true then execute the code associated with it.
 *
 *        Example::
 *        **/
//import java.util.Scanner
//
//fun main(args: Array<String>) {
//
//	// create an object for scanner class
//	val reader = Scanner(System.`in`)
//	print("Enter three numbers: ")
//
//	var num1 = reader.nextInt()
//	var num2 = reader.nextInt()
//	var num3 = reader.nextInt()
//
//	var max = if ( num1 > num2) {
//		if (num1 > num3) {
//			"$num1 is the largest number"
//		}
//		else {
//			"$num3 is the largest number"
//		}
//	}
//	else if( num2 > num3){
//		"$num2 is the largest number"
//	}
//	else{
//		"$num3 is the largest number"
//	}
//	println(max)
//
//}
//Output:
//
//Enter three numbers: 123 231 321
//321 is the largest number