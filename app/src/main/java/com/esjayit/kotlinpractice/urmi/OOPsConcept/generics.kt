package com.esjayit.kotlinpractice.urmi.OOPsConcept

/** Generics::
 *  powerful features that allow us to define classes,
 * methods and properties which are accessible using different data types while keeping a check on the compile-time type safety
 * We always use angle brackets <> to specify the type parameter in the program
 *
 * Type casting is evitable- No need to typecast the object.
 *  Type safety- Generic allows only a single type of object at a time.
 *  Compile time safety- Generics code is checked at compile time for the parameterized type so that it avoids run-time error.
 *
 *
 * Example::
 * */
//class Company<l> (text : l){
//    var x = text
//    init{
//        println(x)
//    }
//}
//fun main(args: Array<String>){
//    var name: Company<String> = Company<String>("GeeksforGeeks")
//    var rank: Company<Int> = Company<Int>(12)
//}
//outPut::
//GeeksforGeeks
//12

/** The out Keyword –
 *   In Kotlin, we can use the out keyword on the generic type which means we can assign this reference to any of its supertypes.
 *   If we have not used the out type in the above class, then given statement will produce a compiler error.
 *  The In keywod -
 *   The in keyword can be used only on the parameter type that is consumed,
 *
 *   */



/***Contracovariance –
It is used to substitute a supertype value in the subtypes*/
//fun main(args: Array<String>) {
//		var a: Container<Dog> = Container<Animal>() //compiles without error
//		var b: Container<Animal> = Container<Dog>() //gives compilation error
//}
//open class Animal
//class Dog : Animal()
//class Container<in T>

/**  Star projections –
When we do not know about the specific type of the value and
we just want to print all the elements of an array then we use star(*) projection. **/

//// star projection in array
//fun printArray(array: Array<*>) {
//	array.forEach { print(it) }
//}
//fun main(args :Array<String>) {
//	val name = arrayOf("Geeks","for","Geeks")
//	printArray(name)
//}