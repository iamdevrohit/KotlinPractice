package com.esjayit.kotlinpractice.urmi.NullSafety

/**Explicit Type Casting ::
 *          -  converting data from one data type to another data type.
 *          -  In Java, we can cast both reference and primitive data types
 *          - using of this data can not be change only data type be change
 *
 *          */

/** there are two type of type casting
 *  1) Unsafe cast operator: as ( cast to  variable  to target type )
 * Example::
 */

//fun main(args: Array<String>){
//	val str1: String = "It works fine"
//	val str2: String = str1 as String	 // Works
//	println(str1)
//}
//output
// It works fine
 /**  2)safe cast operator : as? ( cast can not in target type but throws in the run time )
  *                         : if casting is not possible it returns null instead of throwing an ClassCastException exception.
 * Example::
 *  */

//
// fun main(args: Array<String>){
//
//     var str1: Any = "Safe casting"
//     val str2: String? = str1 as? String     // it works
//     str1 = 11
//     // type casting not possible so returns null to str3
//     val str3: String? = str1 as? String
//     val str4: Int? = str1 as? Int          // it works
//     println(str2)
//     println(str3)
//     println(str4)
// }
//Output:
//
//
//Safe casting
//null
//11
//

/** Hence, we have to use target type also as nullable String so that type casting throws no exception.


fun main(args: Array<String>){
val str1: String? = null
val str2: String? = str1 as String?      // throw exception
println(str1)
}
Output:


null */