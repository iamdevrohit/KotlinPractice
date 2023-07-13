package com.esjayit.kotlinpractice.urmi.OOPsConcept


/**  classes and objects are used to represent objects in the real world.
 *  class: class is a blueprint for creating objects
 *          providing initial values for state and implementations of behavior .
 *          We need to define a class before creating an object
 *          the class keyword is used to define a class.
 *
 *          class className {      // class header
                // property
                // member function
                }

    Class name: every class has a specific name
    Class header: header consists of parameters and constructors of a class
    Class body: surrounded by curly braces, contains member functions and other property
 *
 *   Objects: An object is an instance of a class ,
 *            its own state and behavior.
 *            You can create multiple objects from the same class
 *            each with its own unique state.
 *            Objects are used to access the properties and member functions of a class
 *            we can create multiple objects of a class.
 *
 *   Objects have a :-
 *              State: It is represented by the attributes of an object.
 *                     It also reflects the properties of an object.
                Behavior: It is represented by the methods of an object.
                          It also reflects the response of an object to other objects.
                Identity: It gives a unique name to an object and enables one object to interact with other objects.
 *
 *     Example :-
 * **/

//class Car {
//    var make: String
//    var model: String
//    var year: Int
//
//    fun getInfo(): String {
//        return "$make $model, year $year"
//    }
//}
//
//fun main() {
//    val myCar = Car()
//    myCar.make = "Toyota"
//    myCar.model = "Camry"
//    myCar.year = 2020
//
//    println(myCar.getInfo())
//}

/**     Kotlin program of creating multiple objects and accessing the property and member function of class:**/

//class employee {
//
//    // Constructor Declaration of Class
//
//    var name: String = ""
//    var age: Int = 0
//    var gender: Char = 'M'
//    var salary: Double = 0.toDouble()
//
//    fun insertValues(n: String, a: Int, g: Char, s: Double) {
//        name = n
//        age = a
//        gender = g
//        salary = s
//        println("Name of the employee: $name")
//        println("Age of the employee: $age")
//        println("Gender: $gender")
//        println("Salary of the employee: $salary")
//    }
//
//    fun insertName(n: String) {
//        this.name = n
//    }
//
//}
//fun main(args: Array<String>) {
//    // creating multiple objects
//    var obj = employee()
//
//    // object 2 of class employee
//    var obj2 = employee()
//
//    //accessing the member function
//    obj.insertValues("Praveen", 50, 'M', 500000.00)
//
//    // accessing the member function
//    obj2.insertName("Aliena")
//
//    // accessing the name property of class
//    println("Name of the new employee: ${obj2.name}")
//      outPut:
        //Name of the employee: Praveen
//Age of the employee: 50
//Gender: M
//Salary of the employee: 500000.0
//Name of the new employee: Aliena
//}



