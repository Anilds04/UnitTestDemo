package com.example.unittestingdemo

import android.util.Log

class Helper {

    fun isPallindrome(input: String): Boolean {

        var i = 0
        var j = input.length-1
        var result = true

        while (i < j) {
            if (input[i] != input[j]) {
                result = false
                break
            }
            i++
            j--
        }
        return result
    }

    fun isReverse(number: Int): Boolean {
        var r = 0
        var rev = 0
        var num = number
        while (num > 0) {
            r = num % 10
            rev = rev * 10 + r
            num = num / 10

        }
       // Log.d("TAG", "isReverse: $rev  and $num")
        return rev == number
    }
}