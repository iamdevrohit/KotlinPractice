package com.esjayit.kotlinpractice.urmi.OOPsConcept

/**Sealed Classes::
 *             - a class which restricts the class hierarchy
 *             - class can be declared as sealed class using "sealed" keyword before the class name.
 *             - it us when the object have one of the types from limited set, but cannot have any other type
 *             - when expression in sealed class covers all the cases and avoid to add else clause..
 *
 *   Example::
 *   **/
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
    //  object NotAShape : Shape()
}

//
fun eval(e: Shape) =

    when (e) {
        is Shape.Circle ->println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square ->println("Square area is ${e.length*e.length}")
        is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")
        //else -> "else case is not require as all case is covered above"
        //  Shape.NotAShape ->Double.NaN
    }

fun main(args: Array<String>) {

    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(4, 5)

    eval(circle)
    eval(square)
    eval(rectangle)


    //Output:
    //
    //Circle area is 78.5
    //Square area is 25
    //Rectagle area is 20
}