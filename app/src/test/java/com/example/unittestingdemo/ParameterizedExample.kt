package com.example.unittestingdemo

import com.example.unittestingdemo.junitest.UtilityManager
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(value = Parameterized::class)
class ParameterizedExample( val inputValue : String, val expectedValue : Boolean) {

    @Test
    fun test(){
        val utilityManager = UtilityManager()
        val result = utilityManager.isPallindrome(inputValue)
        assertEquals(result,expectedValue)
    }


    companion object{

        @JvmStatic
        @get:Parameters(name = "{index} : {0} is pallindrome - {1}")
        val data = listOf<Array<Any>>(
            arrayOf("level", true),
            arrayOf("main", false),
            arrayOf("One", false),
            arrayOf("teet", true),
        )
    }
}