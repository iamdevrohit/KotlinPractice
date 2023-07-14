package com.esjayit.kotlinpractice.urmi.Miscellaneous

/** Equality Evaluation
 *         -  The two types of equality are –
 *         -  For a string, the structural equality compares the contents.
 *         -  When (x == null) then automatically
 *              it will be converted to referential equality (x === null) so no need of code optimization here.

                1)Structural Equality::
                        - Structural equality is checked through the == operator
                        -  inverse != operator
                        - two objects have equivalent content
                2)Referential Equality
                            - checked through the === operator and its inverse !== operator.
                            - This equality returns true only if both the instances of a type point to the same location in memory.
                            - when the pointers of the two objects are the same or when the operators are the same object instance.
 * Example::
 * */
//class Square(val side: Int) {
//	override fun equals(other: Any?): Boolean {
//		if(other is Square){
//			return other.side == side
//		}
//		return false
//	}
//}
//// main function
//fun main(args :Array<String>) {
//	val square1 = Square(5)
//	val square2 = Square(5)
//	// structural equality
//	if(square1 == square2) {
//		println("Two squares are structurally equal")
//	}
//	// referential equality
//	if(square1 !== square2) {
//		println("Two squares are not referentially equal")
//	}
//}
//Output:
//
//
//Two squares are structurally equal
//Two squares are not referentially equal