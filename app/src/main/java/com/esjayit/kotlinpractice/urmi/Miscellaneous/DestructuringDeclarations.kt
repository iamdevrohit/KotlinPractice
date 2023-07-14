package com.esjayit.kotlinpractice.urmi.Miscellaneous

/** Destructuring Declarations ::
 *           -   A destructuring declaration is the one that creates and initializes multiple variables at once.
 *           -   Like:: val (emp_id,salary) = employee
 *           -   The destructing declaration works on the concept of component() functions
 *           -   The component function definitions must be preceded by the operator keyword if to be used in a destructuring declaration.
 *           -   put an underscore in place of its name..
 *                      In this case, the component function for the given variable isn’t invoked.
 *                     map.mapValues { (_,value) -> "${value}" }

 *              Example::
 *              */
//// A sample data class
//data class Data(val name:String,val age:Int)
//
//// A function returning two values
//fun sendData():Data{
//    return Data("Jack",30)
//}
//
//fun main(){
//    val obj = sendData()
//    //  Using instance to access properties
//    println("Name is ${obj.name}")
//    println("Age is ${obj.age}")
//
//    // Creating two variables using  destructing declaration
//    val (name,age) = sendData()
//    println("Name is $name")
//    println("Age is $age")
//
//}
//Output:
//
//Name is Jack
//Age is 30
//Name is Jack
//Age is 30

/**  Destructuring declaration in lambdas::
 *   If a lambda parameter has a parameter of Pair type or some other type that declares component functions
 *          then we can introduce new parameters by putting them in parenthesis
 *
 *          Example::
 *          */
//fun main(){
//    val map = mutableMapOf<Int,String>()
//    map.put(1,"Ishita")
//    map.put(2,"Kamal")
//    map.put(3,"Kanika")
//    map.put(4,"Minal")
//    map.put(5,"Neha")
//    map.put(6,"Pratyush")
//    map.put(7,"Shagun")
//    map.put(8,"Shashank")
//    map.put(9,"Uday")
//    map.put(10,"Vandit")
//    println("Initial map is")
//    println(map)
//    // Destructuring a map entry into key and values
//    val newmap = map.mapValues { (key,value) -> "Hello ${value}" }
//    println("Map after appending Hello")
//    println(newmap)
//}
//Output:
//
//Initial map is
//{1=Ishita, 2=Kamal, 3=Kanika, 4=Minal, 5=Neha, 6=Pratyush, 7=Shagun, 8=Shashank, 9=Uday, 10=Vandit}
//Map after appending Hello
//{1=Hello Ishita, 2=Hello Kamal, 3=Hello Kanika, 4=Hello Minal, 5=Hello Neha,
// 6=Hello Pratyush, 7=Hello Shagun, 8=Hello Shashank, 9=Hello Uday, 10=Hello Vandit}