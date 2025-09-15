package com.example.unittestingdemo.mokitotest

import android.util.Log

class UserService (private val userRepository: UserRepository){

    fun loginUser(email :String,password : String) : String{

        val loginStatus = userRepository.loginUSer(email,password)

        return when(loginStatus){
            LOGIN_STATUS.SUCCESS -> "Login Success"
            LOGIN_STATUS.INVALID_USER -> "Invalid user"
            LOGIN_STATUS.UNKNOWN_ERROR -> "Unknown User"
            LOGIN_STATUS.INVALID_PASSWORD -> "Password error"
        }
    }
}