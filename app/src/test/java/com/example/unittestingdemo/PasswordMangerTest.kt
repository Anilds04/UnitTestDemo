package com.example.unittestingdemo

import com.example.unittestingdemo.junitest.PasswordManger
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PasswordMangerTest {
    private lateinit var passwordManger: PasswordManger
    @Before
    fun setUp() {
        //ARRANGE
        passwordManger = PasswordManger()
    }

    @After
    fun tearDown() {
    }

  /*  @Test
    fun validatePassword() {
        //ACT
        val result =  passwordManger.validatePassword("Anilds04")
        //ASSERT
        Assert.assertEquals("valid",result)
    }
*/


    @Test
    fun reverseString_validstr(){
        val result = passwordManger.reverseString("dera")
        Assert.assertEquals("ared", result)
    }

    @Test
    fun reverseString_singlechar(){
        val result = passwordManger.reverseString("q")
        Assert.assertEquals("q", result)
    }


    @Test
    fun reverseString_empty(){
        val result = passwordManger.reverseString("")
        Assert.assertEquals("", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun reverseString_nullable(){
        val result = passwordManger.reverseString(null)
    }
}