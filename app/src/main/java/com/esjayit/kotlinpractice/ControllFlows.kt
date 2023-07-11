package com.esjayit.kotlinpractice

fun main (){

    /**
     Labelled

     These labels are really helpful when dealing with nested loops or nested functions.
     Will explain the use cases in detail of label references but before that, we need to understand
     what are jump and return expressions.

     break : Terminates the  loop.
     continue : Proceeds to the next step of the loop.
     return : Return from the  function or anonymous function. */

    /**
     Now let’s take an example of nested loop first to understand the use of label reference. */

    for( i in 1..3) {
        for (j in 5..7){
            print ((i * 100) + j)
            print(" ")
        }

        println( i.toString() + " loop ends")
    }

    println("We are done")

    /**
    Now in the above example, what if I want to break the i loop (means the entire execution of loops)
    when i equals to 2 and j equals to 6 but still want to execute below code of lines.
    Means I want the output as :

    105 106 107 1 loop ends
    205
    We are done

    I’ll use a break statement with if condition (i == 2 && j == 6)
    inside the j loop and another if condition (i == 2) after execution of j loop.

   */

//    for( i in 1..3){
//        for (j in 5..7){
//            if(i == 2 && j == 6) break
//            print ((i * 100) + j)
//            print(" ")
//        }
//
//        if(i == 2) break
//        println( i.toString() + " loop ends")
//    }
//
//    println("We are done")


//    loopi@ for( i in 1..3){
//        for (j in 5..7){
//            if(i == 2 && j == 6) break@loopi
//            print ((i * 100) + j)
//            print(" ")
//        }
//        println( i.toString() + " loop ends")
//    }
//
//    println("We are done")

    /**
    In the above code, we labelled the outer loop as loopi and while checking the condition we break the loop using the same label.
    And this will break the entire execution of the loops when the condition will be true.

    The same can be used with continue expression also. The continue expression also works for the nearest enclosing loop but
    if we want to continue the outer loop, we can use the label reference.

     */


//    loopi@ for( i in 1..3){
//        for (j in 5..7){
//            if(i == 2 && j == 6) continue@loopi
//            print ((i * 100) + j)
//            print(" ")
//        }
//        println( i.toString() + " loop ends")
//    }
//
//    println("We are done")

    /**
     And the output will be :

     105 106 107 1 loop ends
     205
     305 306 307 3 loop ends
     We are done *


     Now that we understand that labels can be used to break or continue the non-nearest enclosing loops,
     lets understand the use of label reference in return expression.

     With function literals, local functions and object expression, functions can be nested in Kotlin.
     Qualified returns allow us to return from an outer function.Lets take an example of labmda expression.

     */

//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return
//        print(it)
//        println()
//    }
//    println("I will never be printed :( ")


    /**
    In the above code, the function will return from the outer most function when the condition
    will be true and the output will be 1 2

    If we need to return from a lambda expression, we have to label it and qualify the return.
   */

//    listOf(1, 2, 3, 4, 5).forEach lambda@{
//        if (it == 3) return@lambda
//        print(it)
//        print(" ")
//    }
//    println("I'll be printed too :) ")


    /**
    And the output will be

    1 2 4 5 I'll be printed too :)

    The reason why 4 and 5 were printed is that the forEach loop was called for each and every value separately.
    The condition for it == 3 passes and return for that condition only but not for 4 and 5.

    We can even use the implicit labels that are the same name as the function to which the
    lambda is passed and we don’t have to define the label explicitly.
    */

//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return@forEach
//        print(it)
//        print(" ")
//    }
//    println("I'll be printed too :) ")


    /**
    In the above example, we can even replace the lambda expression with an anonymous function.
    A return statement in an anonymous function will return from the anonymous function only and rest of the
    code will execute normally.*/

//    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
//        if (value == 3) return
//        print(value)
//        print(" ")
//    })
//    print("I'll be printed too :) ")


    /**
    The above code works as similar to the continue statement in for loop and will still print 4 and 5.
    If we want to break the loop or function execution based on some condition, we can use a nested labmda expression
    along with label referencing.*/

//    run loop@{
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) return@loop
//            print(it)
//            print(" ")
//        }
//    }
//    print("Now I'll be printed too :) ")


    /**
    In the above code, the inner lambda expression will return from outer lambda expression that is labelled as loop
    based on the condition and will execute after the outer lambda expression.

    The output for the above code will be

    1 2 I'll be printed too :) */


    //

}


class Labelled {

    fun outerFunction() {

        innerFunction@ fun() {
            println("TinnerFunction inside call")
            return@innerFunction // Return from innerFunction
        }

        // Call the inner function
        innerFunction()

        // Code here will not be executed after the return statement
        println("This line will not be printed")
    }

    fun innerFunction() {
        print("innerFunction call\n")
    }

}