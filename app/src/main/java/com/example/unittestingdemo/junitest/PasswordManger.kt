package com.example.unittestingdemo.junitest

class PasswordManger {

    fun validatePassword(input: String) = when {

        input.isBlank() -> {
            "Password is empty"
        }

        input.length < 6 -> {
            "Password length should be greater than 6"
        }

        input.length > 15 -> {
            "Password length should be less than 15"
        }

        else -> {
            "valid"
        }
    }

    fun reverseString(input: String?): String {
        if(input ==null){
            throw IllegalArgumentException("Input string is null")
        }
        val reverseStr: StringBuilder = StringBuilder()

        for (i in input.length - 1 downTo 0) {
            println(input[i])
            reverseStr.append(input[i])
        }
        return reverseStr.toString()
    }
}