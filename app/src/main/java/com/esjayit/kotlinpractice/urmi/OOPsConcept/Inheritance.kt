package com.esjayit.kotlinpractice.urmi.OOPsConcept

import android.app.Person

/** Inheritans :
 *              -define a new class based on an existing class.
 *              -The existing class is known as the superclass or base class,
 *              -the new class is known as the subclass or derived class.
 *              -nheritance enables code re-usability,
 *              -it allows all the features from an (base class) to be inherited by (derived class).
 *   Example :-
 *
 *   **/
//
//open class  person (){
//    val name : String = "mno "
//    val age : Int = 20
//    var city : String = "rajkot"
//    fun abc(){
//        println("based class")
//        println(city)
//    }
//}
//class student () :person(){
//    fun cba(){
//        println(name)
//        println(age)
//        println("derived class")
//    }
//}
//
//fun main() {
//    var Person = student()
//    Person.abc()
//    Person.cba()
//}
//output:
//based class
//rajkot
//mno
//20
//derived class
/**Exampl :-
 **/
//open class  person ( name : String , age : Int , city :String){
//
//
//     init {
//         println("my name is $name , my age is $age, my city is $city")
//     }
//}
//class student (name : String , age : Int , city :String) :person( name , age , city ){
//    fun sub (){
//        println(" i am student ")
//    }
//}
//class student2 (name : String , age : Int , city :String) :person( name , age , city ){
//    fun sub2 (){
//        println(" ")
//    }
//}
//
//fun main() {
//    var stu = student("urmi" , 20, "rajkot")
//    stu.sub()
//    var stu2 = student2("abc" , 25, "rajkot")
//    stu2.sub2()
//   //Output:
//    //my name is urmi , my age is 20, my city is rajkot
//    // i am student
//    //my name is abc , my age is 25, my city is rajkot
//    //
//}
/**Kotlin program of overriding the member function ::
 *
 * Exaample
 * **/
//open class  person (){
//    val name : String = "mno "
//    val age : Int = 20
//    var city : String = "rajkot"
//    open fun abc(){
//        println("based class")
//        println(city)
//    }
//}
//class student () :person(){
//  override  fun abc(){
//        println(name)
//        println(age)
//        println("derived class")
//    }
//}
//
//fun main() {
//    var s= student()
//    s.abc()
//
//}
//output
//mno
//20
//derived class
/**Calling the superclass implementation::
 *         -We can also call the base class member functions or properties from the derived class using the super keyword.
 *
 * Example::**/


//open class  person (){
//    val name : String = "abhi "
//    val age :Int =20
//
//     fun abc(name :String){
//        println("Student name is : $name")
//
//    }
//}
//class student () :person(){
//    fun bca(){
//        println("ahe is :" + super.age)
//        super.abc("aashi")
//    }
//}
//
//fun main() {
//    val s = student()
//    s.bca()
//}
//output
//ahe is :20
//Student name is : aashi