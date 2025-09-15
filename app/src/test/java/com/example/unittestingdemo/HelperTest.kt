package com.example.unittestingdemo

import com.example.unittestingdemo.junitest.Helper
import org.junit.After
import org.junit.Test

import org.junit.Assert.assertEquals
import org.junit.Before

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setup(){

        println("Before Test")
        helper = Helper()
    }


    @After
    fun tearDown(){
        println("After test case")
    }
    @Test
    fun isPallindrome_inputString_level_expectedTrue(){
        //Arrange

        //Act
        val result = helper.isPallindrome("level")
        //Assert
        assertEquals(true,result)
    }

    @Test
    fun isPallindrome_inputString_text_expectedTrue(){

        val result = helper.isPallindrome("text")
        assertEquals(false,result)
    }

    @Test
    fun isReverse_121_level_expectedTrue(){
       

        val result = helper.isReverse(121)
        assertEquals(true,result)
    }
}