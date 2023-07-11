package com.esjayit.kotlinpractice


fun main(){


    /**
    Kotlin HashMap is a collection which contains pairs of object. Kotlin Hash Table based implementation
    of the MutableMap interface. It stores the data in the form of key and value pair.
    Map keys are unique and the map holds only one value for each key.

    It is represented as HashMap<key, value> or HashMap<K, V>.

    The hash table based implementation of HashMap does not guarantees about the order of specified data of key,
    value and entries of collections.


    Kotlin HashMap provides 4 constructors and access modifier of each is public:

    HashMap() : It is the default constructor which constructs an empty HashMap instance.

    HashMap(initialCapacity: Int, loadFactor: Float = 0f) : It is used to construct a HashMap of specified capacity.
    If initialCapacity and loadFactor isn’t being used then both will get ignored.

    HashMap(initialCapacity: Int) : It is used to construct a HashMap of specified capacity.
    If initialCapacity isn’t being used then it will get ignored.

    HashMap(original: Map <out K, V> ) : It creates instance of HashMap with same mappings as specified map.


    // WORKING*/

    var map: HashMap<String, Int> = HashMap()
    map["Aman"] = 19
    map["Sunny"] = 29
    map["Ritesh"] = 39

    for(key in map.keys) {
        println("Element at key $key : ${map[key]}}")
    }


    /**
    Let's see at which index the Key, value pair will be saved into HashMap. When we call the put() method,
    then it calculates the hash code of the Key "Aman."Suppose the hash code of "Aman" is 2657860.
    To store the Key in memory, we have to calculate the index.

    INDEXING FORMULA

    map["Aman"] = 19

    Suppose the hash code of "Aman" is 2044281


    The formula you provided involves the bitwise AND operation and some arithmetic. Let's break it down step by step:

    (16-1): In this step, we subtract 1 from 16, which results in 15. This is a simple arithmetic operation.

    2044281 & 15: In this step, we perform a bitwise AND operation between the number
    2044281 and 15. The bitwise AND operation compares the corresponding bits of the two numbers
    and returns a new number where each bit is set to 1 only if the corresponding bits of both numbers are 1.

    The number 2044281 in binary representation is 0111110011000101111001,
    and 15 in binary is 01111. Performing the bitwise AND operation, we get:

    0111110011000101111001 & 01111

    The resulting binary number is 00000000000000000000000000000100, which is equal to 4 in decimal notation.

    Therefore, the final result of the formula 63281940 & (16-1) is 4.

     0111110011000101111001
                      01111
     -----------------------
     0000000000000000001001 = 9 (INDEX)  In decimal


    Hash Collision

    This is the case when the calculated index value is the same for two or more Keys.
    Let's calculate the hash code for another Key "Sunny." Suppose the hash code for
    "Sunny" is 80247031. To store the Key in the memory, we have to calculate index by using the index formula.

    Index=80247031 & (16-1) = 7


    The value 4 is the computed index value where the Key will be stored in HashMap. In this case, equals()
    method check that both Keys are equal or not. If Keys are same, replace the value with the current value. Otherwise,
    connect this node object to the existing node object through the LinkedList. Hence both Keys will be stored at index 4. */

}