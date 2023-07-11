package com.esjayit.kotlinpractice

fun main(){


    //here we have created an empty map using mapOf()
    val mutableMap2: MutableMap<String, String> = mutableMapOf<String, String>()
    mutableMap2.put("name", "Ashu")
    mutableMap2.put("city", "Delhi")
    mutableMap2.put("department", "Development")
    mutableMap2.put("hobby", "Playing")
    mutableMap2.put("hobby", "Playing2")

    println("${mutableMap2}")


}