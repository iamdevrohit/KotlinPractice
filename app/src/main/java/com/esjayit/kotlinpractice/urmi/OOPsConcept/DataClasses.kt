package com.esjayit.kotlinpractice.urmi.OOPsConcept

/**Data Classess::
 *              -used to hold the data only and it does not provide any other functionality apart from holding data.
 *              -he primary constructor needs to have at least one parameter.
                -All primary constructor parameters need to be marked as val or var.
                -Data classes cannot be abstract, open, sealed or inner.
                -Data classes may only implement interfaces.*/

/**
 * toString()
This function returns a string of all the parameters defined in the data class .
 *  Example ::
 *  **/
//fun main(args: Array<String>)
//{
//    //declaring a data class
//    data class man(val roll: Int,val name: String,val height:Int)
//
//    //declaring a variable of the above data class
//    //and initializing values to all parameters
//
//    val man1=man(1,"man",50)
//
//    //printing all the details of the data class
//    println(man1.toString());
//    //Output:
//    //
//    //man(roll=1, name=man, height=50)
//}


/**copy()::
 * Sometimes we need to copy an object, with some change in some of its properties keeping all others unchanged.
 * It copies all arguments or members defined in primary constructor
    Two objects can have same primary parameter values and different class body values if defined

 * Example::
 * **/
//fun main(args: Array<String>)
//{
//    //declaring a data class
//    data class man(val name: String, val age: Int)
//    {
//        //property declared in class body
//        var height: Int = 0;
//    }
//
//    val man1 = man("manish",18)
//
//    //copying details of man1 with change in name of man
//    val man2 = man1.copy(name="rahul")
//
//    //copying all details of man1 to man3
//    val man3 = man1.copy();
//
//    //declaring heights of individual men
//    man1.height=100
//    man2.height=90
//    man3.height=110
//
//    //man1 & man3 have different class body values,
//    //but same parameter values
//
//    //printing info all 3 men
//    println("${man1} has ${man1.height} cm height")
//    println("${man2} has ${man2.height} cm height")
//    println("${man3} has ${man3.height} cm height")
////Output:
////
////man(name=manish, age=18) has 100 cm height
////man(name=rahul, age=18) has 90 cm height
////man(name=manish, age=18) has 110 cm height
//}

/**hashCode() and equals()
           - hashCode() function returns a hash code value for the object.
            -equals() method return true if two objects have same contents and it works similar to “==”,
            - but works different for Float and Double values
            -Two hash codes declared two times on same object will be equal.
 Example::

 */
//fun main(args: Array<String>)
//{
//    //declaring a data class
//    data class man(val name: String, val age: Int)
//
//    val man1 = man("manish",18)
//    val man2 = man1.copy(name="rahul")
//    val man3 = man1.copy();
//
//    val hash1=man1.hashCode();
//    val hash2=man2.hashCode();
//    val hash3=man3.hashCode();
//
//    println(hash1)
//    println(hash2)
//    println(hash3)
//
//    //checking equality of these hash codes
//    println("hash1 == hash 2 ${hash1.equals(hash2)}")
//    println("hash2 == hash 3 ${hash2.equals(hash3)}")
//    println("hash1 == hash 3 ${hash1.equals(hash3)}")
////output::
//    //hash1 == hash 2 false
//    //hash2 == hash 3 false
//    //hash1 == hash 3 true
//}

