package com.esjayit.kotlinpractice.urmi.NullSafety

/** Type Checking ::
 *      -we can check the type of certain variable using the is operator at runtime.
 *      -  in kotlin type checking in if else block
 *      Example::
 *      *
 */

//fun main(args: Array<String>) {
//    var name = "Praveen"
//    var age = 24
//    var salary = 5000.55
//    val employeeDetails: List<Any> = listOf(name,age,salary)
//
//    for(attribute in employeeDetails) {
//        if (attribute is String) {
//            println("Name: $attribute")
//        } else if (attribute is Int) {
//            println("Age: $attribute")
//        } else if (attribute is Double) {
//            println("Salary: $attribute")
//        } else {
//            println("Not an attribute")
//        }
//    }
//}
//Output:
//
//Name: Praveen
//Age: 24
//Salary: 5000.55

/** Smart Casting –
 *          -this nullable types we have an option to use smart casts
 *           - smart class compile inside  if expression
 *            - if compler found the non null of type  nullable then the compiler will allow to access the variable.
 *            - in java we are ude a instanceof key word in if condition
 *            - but in kotlin we are use a  !is opetoer to check thtype vriable
 *          Example::
 *          */
//fun main(args: Array<String>) {
//    val str1: String? = "GeeksforGeeks"
//    var str2: String? = null  // prints String is null
//    if(str1 !is String) {
//        println("String is null")
//    }
//    else {
//        println("length of String ${str1.length}")
//    }
//}
//Output:
//
//length of String 13
/**  Note: Smart cast don’t work when the compiler can’t guarantee
           that the variable cannot change between the check and the usage.
        : - A val variable always aspect for local properties.
        : - If a val property is private or internal the check is performed in the same module where the property is declared.
        : - If the local var variable is not modified between the check and the usage,
            is not captured in a lambda that modifies it.**/