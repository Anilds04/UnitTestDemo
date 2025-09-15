package com.example.unittestingdemo.mokitotest

class UserRepository {

    val users = listOf(
        User(1, "ABC", "abc@gmail.com", "123456"),
        User(2, "EFG", "efg@gmail.com", "234567"),
        User(3, "HIJ", "hij@gmail.com", "345678")
    )

    fun loginUSer(email: String, password: String): LOGIN_STATUS {

        val user = users.find { it.email == email }

        return when{
            user == null -> LOGIN_STATUS.INVALID_USER
            user.password != password -> LOGIN_STATUS.INVALID_PASSWORD
            else -> LOGIN_STATUS.SUCCESS
        }

    }
}