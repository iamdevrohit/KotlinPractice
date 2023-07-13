package com.esjayit.kotlinpractice.urmi.OOPsConcept

/**extension function:
 *                  - addmore functionality in class
 *                  - without inheriting  them
 *  */

//// A sample class to demonstrate extension functions
//class Circle (val radius: Double){
//    // member function of class
//    fun area(): Double{
//        return Math.PI * radius * radius;
//    }
//}
//fun main(){
//    // Extension function created for a class Circle
//    fun Circle.perimeter(): Double{
//        return 2*Math.PI*radius;
//    }
//    // create object for class Circle
//    val newCircle = Circle(2.5);
//    // invoke member function
//    println("Area of the circle is ${newCircle.area()}")
//    // invoke extension function
//    println("Perimeter of the circle is ${newCircle.perimeter()}")
//}
//output:
//Area of the circle is 19.634954084936208
//Perimeter of the circle is 15.707963267948966





/**Extensions are resolved statically**/
// Open class created to be inherited
open class A(val a:Int, val b:Int){
}

// Class B inherits A
//class B():A(5, 5){}
//
//fun main(){
//
//    // Extension function operate defined for A
//    fun A.operate():Int{
//        return a+b
//    }
//
//    // Extension function operate defined for B
//    fun B.operate():Int{
//        return a*b;
//    }
//
//    // Function to display static dispatch
//    fun display(a: A){
//        print(a.operate())
//    }
//
//    // Calling display function
//    display(B())
//    //Output:
//    //
//    //10
//}
 /**  Nullable Receiver */

// A sample class to display name name
// class AB(val name: String){
//     override fun toString(): String {
//         return "Name is $name"
//     }
// }
//
//fun main(){
//    // An extension function as a nullable receiver
//    fun AB?.output(){
//        if(this == null){
//            println("Null")
//        }else{
//            println(this.toString())
//        }
//    }
//
//    val x = AB("Charchit")
//
//    // Extension function called using an instance
//    x.output()
//    // Extension function called on null
//    null.output()
//    //Output:
//    //
//    //Name is Charchit
//    //Null
//}
/**Companion Object Extensions
 * "create an object of a class inside a factory method and
 * later we can just call that method using the reference of the class name."
            -If a class contains a companion object,
            -  then we can also define extension functions and properties for the companion object.
            -   Companion object declaration –  */
//class MyClass {
//    companion object {
//        // member function of companion object
//        fun display(str :String) : String{
//            return str
//        }
//    }
//}
//// extension function of companion object
//fun MyClass.Companion.abc(){
//    println("Extension function of companion object")
//}
//fun main(args: Array<String>) {
//    val ob = MyClass.display("Function declared in companion object")
//    println(ob)
//    // invoking the extension function
//    val ob2 = MyClass.abc()
//}
//Output:
//
//Function declared in companion object
//Extension function of companion object