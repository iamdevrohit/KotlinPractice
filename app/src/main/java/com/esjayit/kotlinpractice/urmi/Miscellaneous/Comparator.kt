package com.esjayit.kotlinpractice.urmi.Miscellaneous

import android.os.Build
import androidx.annotation.RequiresApi

/** Comparator::
 *  `       Comparator<T> Creates a comparator comparing values after the primary comparator defined them equal
 *
 *  Function –
compare:
       - This function compares two instance of a type and returns zero if both are equal,
       - a negative number if second instance is bigger otherwise returns a positive number.

 *            [[abstract fun compare(a: T, b: T): Int]]
 *Extension Functions –
 *              -  a member function of a class that is defined outside the class
 *              [[fun <T> Comparator<T>.reversed(): Comparator<T>]]
 *         Example::
*/

// A simple class to represent a name
//class Name(val firstName: String,val lastName: String){
//       override fun toString(): String {
//              return """$firstName $lastName"""
//       }
//}
//
//// A comparator to compare first names of Name
//class ComparatorOne: Comparator<Name>{
//       override fun compare(o1: Name?, o2: Name?): Int {
//              if(o1 == null || o2 == null){
//                     return 0;
//              }
//              return o1.firstName.compareTo(o2.firstName)
//       }
//}
//
//// A comparator to compare last names of Name
//class AnotherComparator: Comparator<Name>{
//       override fun compare(o1: Name?, o2: Name?): Int {
//              if(o1 == null || o2 == null)
//                     return 0
//              return o1.lastName.compareTo(o2.lastName)
//       }
//}
//
//@RequiresApi(Build.VERSION_CODES.N)
//fun main(){
//       val list = ArrayList<Name>()
//       list.add(Name("Steve","Waugh"))
//       list.add(Name("Steve","Smith"))
//       list.add(Name("Virat","Kohli"))
//       list.add(Name("Kane","Williamson"))
//       list.add(Name("Joe","Root"))
//
//       println("The list is:")
//       println(list)
//
//       val comparatorOne = ComparatorOne()
//       // Sorting list according to first names
//       list.sortWith(comparatorOne)
//       println("List sorted according to first name")
//       println(list)
//
//       val anotherComparator = AnotherComparator()
//       val finalComparator = comparatorOne.then(anotherComparator)
//       // Sorting list according to first name then by last name
//       list.sortWith(finalComparator)
//       println("List sorted according to first name and last name")
//       println(list)
//
//       val reverseComparator = finalComparator.reversed()
//       // Reverse sorting the list
//       list.sortWith(reverseComparator)
//       println("List reverse sorted")
//       println(list)
//}
//output:
//The list is:
//[Steve Waugh, Steve Smith, Virat Kohli, Kane Williamson, Joe Root]
//List sorted according to first name
//[Joe Root, Kane Williamson, Steve Waugh, Steve Smith, Virat Kohli]
//List sorted according to first name and last name
//[Joe Root, Kane Williamson, Steve Smith, Steve Waugh, Virat Kohli]
//List reverse sorted
//[Virat Kohli, Steve Waugh, Steve Smith, Kane Williamson, Joe Root]

/**ome function::
 *
 * thenByDescending: This function returns a descending comparator
 *                   which converts a value into an instance of type Comparable and then compares the instances.
 *
 *     inline fun <T> Comparator<T>.thenByDescending(
       crossinline selector: (T) -> Comparable<*>?): Comparator<T>
 -----------------------------------------------------------------------------------------------
 * thenComparator: This function returns a Comparator which uses the primary Comparator along with a function to perform a comparison.
 *
 * * fun <T> Comparator<T>.thenComparator(
       comparison: (a: T, b: T) -> Int): Comparator<T>
 -----------------------------------------------------------------------------------------------------


 **/