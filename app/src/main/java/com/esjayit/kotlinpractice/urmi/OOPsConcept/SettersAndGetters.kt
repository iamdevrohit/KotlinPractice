package com.esjayit.kotlinpractice.urmi.OOPsConcept

import java.util.Locale

/**  Getter abd Setter Method :-
 *
 *  Set Method :-
 *              set the any value of any variable
 *   Get Method :-
 *                get the value of variable
 *
 *   --get the value. Getters and Setters are auto-generated in the code.
 *   field: -  storing the property value in memory possible
 *   value;-  value parameter contains the value that a property is assigned (s.name )
 * **/

//class student {
//    var name: String = ""
//        get() = field        // getter
//        set(value) {         // setter
//            field = value
//         }
//}
//
//fun main() {
//    val s = student()
//    s.name = "abc"
//    println(s.name)// output : -abc
//}
/**Private Modifier:-
 *  set the value by using a method inside a class.
 *  Example : -
 *  **/

//class student {
//    var name: String = "abc "
//        private  set
//     fun myfun(n : String){ name = n }
//}
//fun main() {
//    // call with the class
//     var s = student()
//    println("name of student is : ${s.name }")
//    //call with the function
//    s.myfun("mno")
//    println("name of student is : ${s.name}")
//    //output :  name of student is : abc  //name of student is  mno
//}
/** Custom Setter and Getter : - */

class  Student (emai: String , pwd : Int , age : Int) {
     val emai : String = emai

         get (){
             return field.lowercase(Locale.ROOT)
         }
    var pwd :Int = pwd
        set (value){
            field = if (value  > 6 ) value else
                 throw IllegalAccessException("password is small")
        }

    var age : Int = age

        set(value) {
            field = if (value > 18) value  else throw IllegalAccessException("age must be  18")
        }
}
fun main() {
    // info is right
     var stu = Student ("UU12@GMAIL.COM" ,12345678, 9 )
        println("${stu.emai}")
        println("${stu.pwd}")
        println("${stu.age}")
    //output:-
    //uu12@gmail.com
    //12345678
    //19
}