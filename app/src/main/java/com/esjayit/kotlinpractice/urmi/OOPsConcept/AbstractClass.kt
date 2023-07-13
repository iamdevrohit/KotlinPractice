package com.esjayit.kotlinpractice.urmi.OOPsConcept
/**   abstract class ::
 *
 *             -  a class that cannot be instantiated and is meant to be subclassed.
 *             -  An abstract class may contain both abstract methods (methods without a body)
 *             -  and concrete methods (methods with a body)
 *             -  An abstract class is used to provide a common interface and implementation for its subclasses.**/

/**  We can’t create an object for abstract class.
 * All the variables (properties) and member functions of an abstract class are by default non-abstract.
 * So, if we want to override these members in the child class then we need to use open keyword.
 * If we declare a member function as abstract then we does not need to annotate with open keyword because these are open by default.
 * An abstract member function doesn’t have a body, and it must be implemented in the derived class.**/
/** Examplee::
 * */
//abstract class
//abstract class Employee(val name: String,val experience: Int) { // Non-Abstract
//    // Property
//    // Abstract Property (Must be overridden by Subclasses)
//    abstract var salary: Double
//
//    // Abstract Methods (Must be implemented by Subclasses)
//    abstract fun dateOfBirth(date:String)
//
//    // Non-Abstract Method
//    fun employeeDetails() {
//        println("Name of the employee: $name")
//        println("Experience in years: $experience")
//        println("Annual Salary: $salary")
//    }
//}
//// derived class
//class Engineer(name: String,experience: Int) : Employee(name,experience) {
//    override var salary = 500000.00
//    override fun dateOfBirth(date:String){
//        println("Date of Birth is: $date")
//    }
//}
//fun main(args: Array<String>) {
//    val eng = Engineer("Praveen",2)
//    eng.employeeDetails()
//    eng.dateOfBirth("02 December 1994")
//}
//Output:
//
//Name of the employee: Praveen
//Experience in years: 2
//Annual Salary: 500000.0
//Date of Birth is: 02 December 1994

/** Multiple derived classes –
 *              An abstract member of an abstract class can be overridden in all the derived classes.
 *
 *  Example::
 *  */
// abstract class
//abstract class Calculator {
//    abstract fun cal(x: Int, y: Int) : Int
//}
//// addition of two numbers
//class Add : Calculator() {
//    override fun cal(x: Int, y: Int): Int {
//        return x + y
//    }
//}
//// subtraction of two numbers
//class Sub : Calculator() {
//    override fun cal(x: Int, y: Int): Int {
//        return x - y
//    }
//}
//// multiplication of two numbers
//class Mul : Calculator() {
//    override fun cal(x: Int, y: Int): Int {
//        return x * y
//    }
//}
//fun main(args: Array<String>) {
//    var add: Calculator = Add()
//    var x1 = add.cal(4, 6)
//    println("Addition of two numbers $x1")
//    var sub: Calculator = Sub()
//    var x2 = sub.cal(10,6)
//    println("Subtraction of two numbers $x2")
//    var mul: Calculator = Mul()
//    var x3 = mul.cal(20,6)
//    println("Multiplication of two numbers $x3")
//}
//Output:
//
//Addition of two numbers 10
//Subtraction of two numbers 4
//Multiplication of two numbers 120
//Division of two numbers 3