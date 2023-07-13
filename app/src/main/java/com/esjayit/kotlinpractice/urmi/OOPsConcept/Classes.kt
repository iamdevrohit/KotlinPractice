package com.esjayit.kotlinpractice.urmi.OOPsConcept

/** Enum class::
 *         -      represents a group of constant
 *         -  enum has its own specialized type, indicating that something has a number of possible values
 *
 *
 *   Some important points about enum classes in kotlin –

              -  Enum constants aren’t just mere collections of constants- these have properties, methods etc
              -  Each of the enum constants acts as separate instances of the class and separated by commas.
              -  Enums increases readability of your code by assigning pre-defined names to constants.
              -  An instance of enum class cannot be created using constructors.

 *Properties –

1)ordinal: This property stores the ordinal value of the constant, which is usually a zero-based index.
2)name: This property stores the name of the constant.

**Methods –

1)values: This method returns a list of all the constants defined within the enum class.
2)valueOf: This methods returns the enum constant defined in enum, matching the input string.
If the constant, is not present in the enum, then an IllegalArgumentException is thrown.

 Example ::

 */
//enum class DAYS {
//    SUNDAY,
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY
//}
//fun main()
//{
//    // A simple demonstration of properties and methods
//    for (day in DAYS.values()) {
//        println("${day.ordinal} = ${day.name}")
//    }
//    println("${DAYS.valueOf(" WEDNESDAY ")}")
//}
//Output:
//
//0 = SUNDAY
//1 = MONDAY
//2 = TUESDAY
//3 = WEDNESDAY
//4 = THURSDAY
//5 = FRIDAY
//6 = SATURDAY
//WEDNESDAY