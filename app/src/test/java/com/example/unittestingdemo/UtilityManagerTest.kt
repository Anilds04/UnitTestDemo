package com.example.unittestingdemo

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UtilityManagerTest {


    lateinit var utilityManager: UtilityManager

    @Before
    fun setUp() {
        //Arrange
        utilityManager = UtilityManager()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun isPallindrome_inputString_level_expectedTrue() {

        //Act
        val result = utilityManager.isPallindrome("level")

        //Assert
        Assert.assertEquals(true, result)

    }

    @Test
    fun isPallindrome_inputString_level_expectedFalse() {

        //Act
        val result = utilityManager.isPallindrome("hello")

        //Assert
        Assert.assertEquals(false, result)
    }
}