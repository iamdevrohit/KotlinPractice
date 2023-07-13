package com.esjayit.kotlinpractice.urmi.OOPsConcept

/**constructor :-
 *              : is a block of code , similar to the method
 *              : constructor is a declared with ame nam as a class.
 *              : Follow by the parentheses'()'
 *              : used to initialize the variables at the time of object creation.
 *  Types of Kotlin constructors
        There are two types of constructors in Kotlin:

        Primary constructor :used to initialize the class
                            :declared at class header
                            :code is surrounded by parentheses'()' with optional parameter.      */
//class person( val name :String , var age : Int ){}
//
//fun main() {
//    val myperson = person("abc ", 12)
//    println("name = ${myperson.name}")
//    println("age = ${myperson.age}")//output: name = abc age = 12
//}
/**Primary constructor with initializer block
*          :Initializer blocks are used to initialization of code.
 *         :prefixed with init keyword.
 *         :The code inside the init block is the first to be executed when the class is instantiated
 * Example:-
 * */
//    class person( name :String ,  age : Int ){
//        var p_name :String
//        var p_age  :Int
//        init {
//            p_name = name
//            p_age = age
//
//            println("name = ${p_name}")
//            println("age = ${p_age}")
//        }
//    }
//fun main() {
//    val myperson = person("abc ", 12)
//}

/**Secondary constructor:
 *                      :secondary constructor can be created one or more in class
 *                       :created using "constructor" keyword.
 *                       :constructor into one more constructor
 *   Example :-
 *   */

//class  person(){
//    constructor(name : String, age :Int ): this(name , age ,"rajkot"){
//        println("name =${name }")
//        println("age = ${age}")
//    }
//    //constructor(name: String , age: Int , city :String) : this()
//    constructor(name: String, age: Int,city: String) : this()
//    {
//        println("name = ${name}")
//        println("age = ${age}")
//        println("city = ${city}")
//    }
//}
//fun main() {
//    var myperson = person("abc ",10)
//    //output: name : abc
//    //age : 10
//    //name : abc
//    //age : 10
//    //city : rajkot
//}

/** Calling supper class secondary constructor from derived class secondary constructor
 *                  :This is done using super keyword
 *                  : perent classs must be open with open keyword
 * Example :-
 * */

//open class  person(){
//    constructor(name : String, age :Int ) :this(){
//        println("name =${name }")
//        println("age = ${age}")
//    }
//    //constructor(name: String , age: Int , city :String) : this()
//    constructor(name: String, age: Int,city: String) : this()
//    {
//        println("name = ${name}")
//        println("age = ${age}")
//        println("city = ${city}")
//    }
//}
//class student : person {
//    constructor(name : String, age :Int ){
//        println("name =${name }")
//        println("age = ${age}")
//    }
//    constructor(name: String, age: Int,city: String)
//    {
//        println("name = ${name}")
//        println("age = ${age}")
//        println("city = ${city}")
//    }
//
//}
//fun main() {
//    var myperson = student("abc ",10)
//    var myperson2 = student ("mno ", 20 , "rajkot ")
////output:
////    name =abc
////    age = 10
////    name = mno
////    age = 20
////    city = rajkot
//}
