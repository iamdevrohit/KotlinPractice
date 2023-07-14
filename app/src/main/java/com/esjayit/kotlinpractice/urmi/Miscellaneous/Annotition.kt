package com.esjayit.kotlinpractice.urmi.Miscellaneous

/*** Annotition :
 *      -    embed supplemental information into the source file.
 *      -   does not changes the actions of the program.
 *      -    use to attech a compile time class , interface , metadata , parameters etc.
 *      -    this information is use by development and deployment
 *      -    putting the name prefixed  and @ symbol
 *      -    According  to the annotation value you can change  the  meaning of data  or program
 *      -    when somtime we pass the annotation withe other paramtrs and omit the @ sybole ,
 *          that time we use a replaceWith() keyword

 * */
/**  Some in-built annotations –
 *
 *      @Target::
 *              specifies the places where the annotated annotation can be applied such as classes, functions, constructors, type parameters, etc
 *
 *
 *        Example::
 *        **/
//@Target(AnnotationTarget.CONSTRUCTOR, AnnotationTarget.LOCAL_VARIABLE)
//annotation class AnnotationDemo2
//
//class ABC @AnnotationDemo2 constructor(val count:Int){
//    fun display(){
//        println("Constructor annotated")
//        println("Count is $count")
//    }
//}
//fun main(){
//    val obj =  ABC(5)
//    obj.display()
//    @AnnotationDemo2 val message: String
//    message = "Hello"
//    println("Local parameter annotated")
//    println(message)
//}
//Output:
//
//
//Constructor annotated
//Count is 5
//Local parameter annotated
//Hello

/** @Retention
 *              This annotation specifies the availability of the annotated annotation
 *              AnnotationRetention enumeration that has the following elements:
                        SOURCE
                        BINARY
                        RUNTIME
 *  Example;:
 *
 *  */

////Specifying an annotation with runtime policy
//@Retention(AnnotationRetention.RUNTIME)
//annotation class AnnotationDemo3
//
//@AnnotationDemo3 fun main(){
//    println("Main function annotated")
//}
//Output:
//
//
//Main function annotated

/**  @Repeatable –
This annotation allows an element to be annotated with the same annotation multiple times.
Kotlin 1.3, this annotation can only be used with the Retention Policy set to SOURCE.
 Example::
 **/
//@Repeatable
//@Retention(AnnotationRetention.SOURCE)
//annotation class AnnotationDemo4 (val value: Int)
//
//@AnnotationDemo4(4)
//@AnnotationDemo4(5)
//fun main(){
//    println("Repeatable Annotation applied on main")
//}
//Output:
//
//
//Repeatable Annotation applied on main
//