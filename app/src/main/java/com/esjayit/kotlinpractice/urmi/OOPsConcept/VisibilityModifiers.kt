package com.esjayit.kotlinpractice.urmi.OOPsConcept

/**Visibility Modifiers:- restrict the use of class, interface, methods, and property of Kotlin in the application.
 *                         : used at multiple places such as class header or method body.
 * there are 4 type of modifires :-
 *                          public :-  accessible from everywhere in the project.
 *                                 :-  default modifier in Kotlin
 *                                 :-  All the above declarations are the in the top level of the file.
 *                                 :-  we apply the public modifier to top-level elements – classes,
 *                                      functions or variables declared directly inside a package,
  *   Example :-   */
// by default public
//class A {
//    var int = 10
//}
//
//// specified with public modifier
//      public class B {
//           var int2 = 20
//               fun display() {
//                    println("Accessible everywhere")
//                    }
//  }

 /**private:- private modifiers allow only the code declared inside the same scope, access.
  *        :-  does not allow access to the modifier variable or function outside the scope
  *        :- allow only the code declared inside the same scope, access.
  *
  *
  *
  * Example :
  * */
// open class A() {
//     private val i = 1
//
//     fun doSomething(){
//         println("Inside doSomething" )
//         println("Value of i is $i" )
//     }
// }
//class B : A() {
//    fun printValue(){
//        doSomething()
//        // println("Value of i is $i" )
//    }
//}
//fun main(args: Array<String>) {
//    val a = A()
//    val b = B()
//
//    b.printValue()
//}
//output:
//Inside doSomething
//Value of i is 1
/**  internal:-
 *              the internal modifier is a newly added modifier that is not supported by Java
 *               it will be available in the same module,
 *               if we try to access the declaration from another module it will give an error
 *               module means a group of files that are compiled together.
 *               ex:we can have separate modules for login and registrations.
 *  Example:
 *  */
//
//package com.tutorialspoint.modifiers
//
//open class A() {
//    internal val i = 1
//
//    internal fun doSomething(){
//        println("Inside doSomething" )
//        println("Value of i is $i" )
//    }
//}
//class B : A() {
//    fun printValue(){
//        doSomething()
//        println("Value of i is $i" )
//    }
//}
//
//fun main(args: Array<String>) {
//    val a = A()
//    val b = B()
//
//    a.doSomething()
//
//    b.printValue()
//}
//output:-
//Inside doSomething
//Value of i is 1
//Inside doSomething
//Value of i is 1
//Value of i is 1

/** protected:-protected modifier can not be declared at the top level
 *           :-strictly allows accessibility to the declaring class and its subclasses
 *           :-
 *             */
//open class A() {
//   protected val i = 1
//
//   protected fun doSomething(){
//      println("Inside doSomething" )
//      println("Value of i is $i" )
//   }
//}
//class B : A() {
//   fun printValue(){
//       doSomething()
//       println("Value of i is $i" )
//   }
//}
//
//fun main(args: Array<String>) {
//   val a = A()
//   val b = B()
//
//   //a.doSomething()
//
//   b.printValue()
//}
//output:
//Inside doSomething
//Value of i is 1
//Value of i is 1