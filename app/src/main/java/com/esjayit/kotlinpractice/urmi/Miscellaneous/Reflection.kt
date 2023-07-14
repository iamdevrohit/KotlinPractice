package com.esjayit.kotlinpractice.urmi.Miscellaneous

/** Reflection::
 *         - set of language and library features that provides the feature of introspecting a given program at runtime.
 *         -  set at runtime to utilize a class and its members, such as properties, methods, and constructors
 *         -  allows inspection of classes, interfaces, fields and methods at runtime
 *                 without knowing the names of the interfaces, fields, methods at compile time.
 *         - gives us information about the class to which an object belongs and also the methods of that class that can be executed by using the object
 *          - it gives access to properties and nullable types
            - Kotlin reflection has some additional features to Java reflection.
            - kotlin reflection helps in accessing the JVM code, written by a language
 *
 *
 *         */


/** Class references
 *          - the class reference operator is used to get a reference to a statically known class.
 *
 *          Example::
 *          */

//// A sample empty class
//class ReflectionDemo {
//}
//
//fun main()
//{
//	// Reference obtained using class name
//	val abc = ReflectionDemo::class
//	println("This is a class reference $abc")
//
//	// Reference obtained using object
//	val obj = ReflectionDemo()
//	println("This is a bounded class reference ${obj::class}")
//}
//output
//This is a class reference class kotlin1.com.programmingKotlin.chapter1.ReflectionDemo
//This is a bounded class reference class kotlin1.com.programmingKotlin.chapter1.ReflectionDemo

/**  Function references::
 *                 - using with :: operator
 *                 - in the case of overloaded functions, we can either explicitly specify the type of the function
 *                    or it can be implicitly determined from the content
 *        Example::
 *        ***/

//fun add(a: Int,b: Int) : Int{
//	return a+b;
//}
//
//fun add(a: String,b: String): String{
//	return """$a$b"""
//}
//
//fun isDivisibleBy3(a: Int): Boolean{
//	return a%3 == 0
//}
//fun main(){
//	// Function reference obtained using :: operator
//	val ref1 = ::isDivisibleBy3
//	val array = listOf<Int>(1,2,3,4,5,6,7,8,9)
//	println(array.filter(ref1))
//
//	// Function reference obtained for an overloaded function
//	// By explicitly specifying the type
//	val ref2: (String,String) -> String = ::add;
//	println(ref2)
//
//	// Function reference obtained implicitly
//	val x = add(3,5)
//	println(x)
//}
//Output
//
//[3, 6, 9]
//fun add(kotlin.String, kotlin.String): kotlin.String
//8

/**  Property References::
 *                           we can obtain their values using get function or modify it using set function.
 *                           –**/
//
//class Property(var a: Float){
//}
//
//val x = 10;
//
//fun main(){
//    // Property Reference for a package level property
//    val z = ::x
//    println(z.get())
//    println(z.name)
//
//    // Property Reference for a class property
//    val y = Property::a
//    println(y.get(Property(5.899f)))
//}
/**Constructor References –**/

//class Property(var a: Float){
//}
//fun main(){
//    // Constructor Reference
//    val y = ::Property
//    println(y.name)
//}
//Output
//
//<init>