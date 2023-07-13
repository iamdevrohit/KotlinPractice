package com.esjayit.kotlinpractice.urmi.OOPsConcept


/** Nested class: Class inside the class call a nested class
 *                  it is have a access the member  of the outer class
 *
 *   Example :-
 *   **/

 open class person {
    var name: String = ""
    var age : Int = 0
        var cantaccess= 3
   inner class student {
        var id: Int = 0
        var sub :String = ""

        // getinfo for inner class
        fun getStudentInfo() : String {
            return " id is $id  ,sub is  $sub  , name is  $name age is  $age"
        }
    }

    // getInfo for person class
    fun getInfo()  :String{
        return  "name $name, age  $age"
    }
}
fun main() {

    val myperson = person()
    myperson.name = "riya"
    myperson.age = 20
    myperson.cantaccess = 20

    val Student = myperson.student()
    Student.id = 11
    Student.sub = "android"

    println(Student.getStudentInfo())
    //OutPut :
    // id is 11  ,sub is  android  , name is  riya age is  20


}
/** Nested class can’t access the members of the outer class,
 *  but we can access the property of nested class from the outer class without creating an object for nested class.
 *
 *  Example:-
 *  */

//class  outerClass {
//    var str = "outer  class "
//
//    class nestedClass {
//        var name: String = "mena  "
//        var age: Int = 20
//    }
//}
//
//fun main() {
//    	println(outerClass.nestedClass().name)
//    println("")
//    println(outerClass.nestedClass().age)
//output:-
//    mena
//    20
//}
/** accessing nested class member function:-
 * Example :-
 * **/

//class  outerClass {
//    val str = "outer cLass"
//
//    class nestedClass{
//        val str1 = "nested class"
//
//        fun nectedfun (s2 : String) :String {
//            var str2 = str1.plus(s2)
//            return str2
//
//        }
//
//    }
//}
//
//fun main() {
//    val nested = outerClass.nestedClass()
//    val result = nested.nectedfun(" ,this is a nested class ")
//    println(result)
////out put :
//    //nested class ,this is a nested class
//}

/** inner class :When we can declare a class inside another class it's call inner class
 *              : using the keyword  with "inner"
 *              : help with the inner class we can access the  outer class property
 *              : Non-static nested classes are called inner classes.
 *    Example :-
 *    */

//class outerClass {
//
//
//    var str = "outer Class"
//    //  you dont put the key word "inner"  there is a error "Unresolved reference: str"
//   inner  class innerClass {
//             var s1 = "inner class"
//        fun innerclass(): String{
//           // can not access the outer class property str
//          //  val str = ""
//            var s2  = str
//            return s2
//        }
//    }
//}
//fun main() {
//         //obj for inner class
//     val Ineer =  outerClass().innerClass()
//     //   inner class clling by function
//    println(Ineer.innerclass())
//
//    //Output :Outer class
//
//}

