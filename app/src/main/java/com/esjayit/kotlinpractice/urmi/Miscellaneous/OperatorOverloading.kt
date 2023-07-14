package com.esjayit.kotlinpractice.urmi.Miscellaneous

/** OperatorOverloading */

/** Unary Operators –
 *
        +x ->	x.unaryPlus()
        -x -> 	x.unaryMinus()
        !x -> 	x.not()
 * */
//Example::
//class UnaryOverload(var str:String) {
//    // overloading the function
//    operator fun unaryMinus() {
//        str = str.reversed()
//    }
//}
//// main function
//fun main(args : Array<String>) {
//    val obj = UnaryOverload("HELLO")
//    println("Initial string is ${obj.str}")y
//    //calling the overloaded function unaryMinus()
//    -obj
//    println("String after applying unary operator ${obj.str}")
//}
//Output:
//
//Initial string is HELLO
//String after applying unary operator OLLEH

/**Increment and Decrement Operators –::
 *      ++x	x.inc()
        ––x	x.dec()
 *
 * **/
//Example::

//class IncDecOverload(var str:String) {
//    // overloading increment function
//    operator fun inc(): IncDecOverload {
//        val obj = IncDecOverload(this.str)
//        obj.str = obj.str + 'a'
//        return obj
//    }
//    // overloading decrement function
//    operator fun dec(): IncDecOverload {
//        val obj = IncDecOverload(this.str)
//        obj.str = obj.str.substring(0,obj.str.length-1)
//        return obj
//    }
//
//    override fun toString(): String {
//        return str
//    }
//}
//// main function
//fun main(args: Array<String>) {
//    var obj = IncDecOverload("Hello")
//    println(obj++)
//    println(obj--)
//    println(++obj)
//    println(--obj)
//}
//Output:
//
//Hello
//Helloa
//Helloa
//Hello

/**  Binary Operators
 *              x1 + x2    	x1.plus(x2)
                x1 – x2    	x1.minus(x2)
                x1 * x2    	x1.times(x2)
                x1/ x2-     x1.div(x2)
                x1 % x2    	x1.rem(x2)
                x1..x2      x1.rangeTo(x2)–

 **/
//Example::
//class Object(var objName: String) {
//    // Overloading the function
//    operator fun plus(b: Int) {
//        objName = "Name is $objName and data is $b"
//    }
//    override fun toString(): String {
//        return objName
//    }
//}
//// main function
//fun main() {
//    val obj = Object("Chair")
//    // Calling the overloaded function
//    obj+9
//    println(obj)
//}
//Output:
//
//Name is Chair and data is 9

/**Note- The relational operators do not have any specific functions to be defined,
 * to use relational operators on instances of a user-defined type, the type must implement the Comparable interface.*/


/**  Other operators ::
 *          x1 in x2	x2.contains(x1)
            x1 !in x2	!x2.contains(x1)
            x[i]	     x.get(i)
            x[i, j]	     x.get(i, j)
            x[i] = b	 x.set(i, b)
            x[i, j] = b	 x.set(i, j, b)
            x()	         x.invoke()
            x(i)	     x.invoke(i)
            x(i, j)	     x.invoke(i, j)
            x1 += x2	x1.plusAssign(x2)
            x1 -= x2	x1.minusAssign(x2)
            x1 *= x2	x1.timesAssign(x2)
            x1 /= x2	x1.divAssign(x2)
            x1 %= x2	x1.remAssign(x2)

 * –*/
