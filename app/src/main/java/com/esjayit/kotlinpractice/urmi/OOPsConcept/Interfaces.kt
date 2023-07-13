package com.esjayit.kotlinpractice.urmi.OOPsConcept

/** Interface ::
 *         - is a collection of abstract methods and properties that define a common contract for classes
 *            that implement the interface
 *          - similar to an abstract class,
 *          -but it can be implemented by multiple classes, and it cannot have state.
 *          - interfaces are custom types provided by Kotlin that cannot be instantiated directly
 *          -  Using interface supports functionality of multiple inheritance.
            - It can be used achieve to loose coupling.
            - It is used to achieve abstraction.
 *   Implementing Interfaces –
 *              implemented by a class or an object
 *              the conforming type must provide the definition for all of its members
 *
 *
 * Example ::
 */

//interface MyInterface  {
//    var id: Int            // abstract property
//    fun absMethod():String    // abstract method
//    fun doSomthing() {
//        println("MyInterface doing some work") // 2nd exit
//    }
//}
//class InterfaceImp : MyInterface {
//    override var id: Int = 101
//    override fun absMethod(): String{
//        return "Implementing abstract method.."//3rd exit
//    }
//}
//fun main(args: Array<String>) {
//    val obj = InterfaceImp()
//    println("Calling overriding id value = ${obj.id}")//1st exit
//    obj.doSomthing()
//    println(obj.absMethod())
//    //output
//    //Calling overriding id value = 101
//    //MyInterface doing some work
//    //Implementing abstract method..
//}

/** Example ::*/


//interface MyInterface1 {
//    fun doSomthing() {
//        println("MyInterface 1 doing some work")
//    }
//    fun absMethod()
//}
//
//interface MyInterface2 {
//    fun doSomthing() {
//        println("MyInterface 2 doing some work")
//    }
//    fun absMethod() {
//        println("MyInterface 2 absMethod")
//    }
//
//}
//
//class C : MyInterface1 {
//    override fun absMethod() {
//        println("MyInterface1 absMethod implementation")
//    }
//}
//
//class D : MyInterface1, MyInterface2 {
//    override fun doSomthing() {
//        super<MyInterface1>.doSomthing()
//        super<MyInterface2>.doSomthing()
//    }
//
//    override fun absMethod() {
//
//        super<MyInterface2>.absMethod()
//    }
//}
//
//fun main(args: Array<String>) {
//    val d = D()
//    val c = C()
//    d.doSomthing()
//    d.absMethod()
//    c.doSomthing()
//    c.absMethod()
//        //output::
//        //MyInterface 1 doing some work
//    //MyInterface 2 doing some work
//    //MyInterface 2 absMethod
//    //MyInterface 1 doing some work
//    //MyInterface1 absMethod implementation
//}