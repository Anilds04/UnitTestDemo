package com.example.unittestingdemo

fun main(){

    strReverse("ANil")
}

fun strReverse(input : String) {

    val reverseStr : StringBuilder = StringBuilder()

    for (i in input.length-1 downTo 0)
    {
        println(input[i])
        reverseStr.append(input[i])
    }
    println(reverseStr.toString())
}


