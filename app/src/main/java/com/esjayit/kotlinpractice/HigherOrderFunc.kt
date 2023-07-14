package com.esjayit.kotlinpractice

//fun main(){


    /**
     *
    Higher-order functions are a powerful feature in programming languages like Kotlin because
    they enable you to treat functions as first-class citizens. In Kotlin, a higher-order function is a function
    that can accept other functions as parameters, return functions as results, or both. */

    /**
    Abstraction:

    Higher-order functions allow you to abstract common patterns of behavior and encapsulate them in reusable functions.
    By passing functions as parameters, you can define generic algorithms that can operate on different functions,
    promoting code reuse and reducing duplication.


    Example */

//    fun applyOperation(operation: (Int, Int) -> Int, a: Int, b: Int): Int {   return operation(a, b) }
//
//    fun add(a: Int, b: Int): Int {  return a + b }
//
//    fun multiply(a: Int, b: Int): Int {   return a * b }
//
//    val result1 = applyOperation(::add, 3, 4)
//    println(result1)  // Output: 7
//    val result2 = applyOperation(::multiply, 2, 5)
//    println(result2)  // Output: 10


    /**
    Flexibility: Higher-order functions provide a flexible way to customize behavior.
    By accepting functions as arguments, you can parameterize functions to behave differently based on the supplied function.
    This promotes code modularity and allows you to adapt functionality to specific requirements without modifying the core
    implementation.

    Example */

//    fun processData(data: List<Int>, accepted: (Int) -> Boolean): List<Int> {
//        val result = mutableListOf<Int>()
//        for (item in data) {
//            if (accepted(item)) {
//                result.add(item)
//            }
//        }
//        return result
//    }
//
//    fun isEven(number: Int): Boolean {
//        return number % 2 == 0
//    }
//
//    fun isPositive(number: Int): Boolean {
//        return number > 0
//    }
//
//
//    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//
//    val evenNumbers = processData(numbers, ::isEven)
//    println(evenNumbers)  // Output: [2, 4, 6, 8, 10]
//
//    val positiveNumbers = processData(numbers, ::isPositive)
//    println(positiveNumbers)  // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    /**
    Function Composition: Higher-order functions facilitate function composition, which is the process of combining multiple
    functions to create new functions. You can take two or more functions and compose them to produce a new function that
    represents their combined behavior. This allows you to build complex operations by chaining together simpler functions.

    Example */

//    fun addOne(x: Int): Int {
//        return x + 1
//    }
//
//    fun multiplyByTwo(x: Int): Int {
//        return x * 2
//    }
//
//    fun compose(fun1: (Int) -> Int, fun2: (Int) -> Int): (Int) -> Int {
//        return {it -> fun1(fun2(it))}
//    }
//
//    val addAndMultiply = compose(::multiplyByTwo, ::addOne)
//    val result = addAndMultiply(3) // Result will be (3 + 1) * 2 = 8
//    println(result) // Output: 8


    /**
    Callbacks and Event Handling: Higher-order functions are commonly used for handling callbacks and events. For example,
    you can pass a function as a callback to be executed when an asynchronous operation completes. This enables you to write
    concise and expressive code for asynchronous programming, event-driven systems, and handling user interactions.
    Example */

    // Asynchronous Programming:

//    fun fetchDataFromServer(callback: (String) -> Unit) {
//        Thread.sleep(2000)
//        val data = "Data from server"
//        callback(data)
//    }
//
//    println("Program execution continues...")
//
//    fetchDataFromServer { data ->
//        println("Received data: $data")
//        // Process the received data here
//    }


    /**
    Functional Programming Paradigm: Kotlin supports functional programming paradigms, and higher-order functions are a fundamental
    component of functional programming. They allow you to write code in a more declarative and expressive manner,
    emphasizing immutability and composability. Higher-order functions enable functional programming techniques
    like map, filter, reduce, and more.

    Example */

  //  val numbers = listOf(1, 2, 3, 4, 5)
//
//    //map
//    val squaredNumbers = numbers.map { it * it }
//    println(squaredNumbers) // Output: [1, 4, 9, 16, 25]
//
//    //filter
//    val evenNumbers = numbers.filter { it % 2 == 0 }
//    println(evenNumbers) // Output: [2, 4]
//
//    //Reduce
//    val sum = numbers.reduce { acc, element -> acc + element }
//    println(sum) // Output: 15
//
//}


/**
 * https://medium.com/@summitkumar/10-practical-examples-of-higher-order-functions-in-android-development-84e9c6a4bdc3
 */

