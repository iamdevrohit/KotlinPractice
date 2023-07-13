package com.esjayit.kotlinpractice.urmi.OOPsConcept

/**
 *Property :- A property in a class is declared the same as declaring a variable with val and var keywords
 * var is mutable and thus, can be changed.
 * val is innmutable and thus , can not be change .
 *
 * there are two types of property :-
 *
 *  Readable Property(val): Generates a field and a trivial getter : -
 *                        :Properties in Kotlin classes can be declared either as mutable,
 *                        :using the var keyword, or as read-only, using the val keyword.
    Writable Property(var): A getter, a setter, and a field
 *  Example :-
 *  */

//class Abc(
//    val name: String,
//    val ispassed : Boolean
//)
//
//fun main(args: Array<String>) {
//
//    val abc = Abc("Bob",true)
//    println(abc.name)
//    println(abc.ispassed)
//
//    /*
//    In Java
//    Abc abc = new Abc("Bob",true);
//    System.out.println(person.getName());
//    System.out.println(person.isMarried());
//
//    */
//}

/**Customer Accessors:-
 * */

//class Rectangle(val height: Int, val width: Int)
//{
//    val isSquare: Boolean
//        get() {
//            return height == width
//        }
//}
//
//fun main(args: Array<String>) {
//
//    val rectangle = Rectangle(41, 43) // return height == width
//    println(rectangle.isSquare)
//    //output:- false
//}

