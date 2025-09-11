package com.example.unittestingdemo

class UtilityManager {


    fun isPallindrome( input : String) : Boolean{

        if(input == null){
            return false
        }

        var isPallindromeValue = true

        var left = 0
        var right = input.length -1

        while(left < right){
            if(input[left] != input[right]) {
                isPallindromeValue = false
                break
            }
            left++
            right--

        }


        return isPallindromeValue

    }
}