package com.example.unittestingdemo.coroutineTest

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CUtilTest (){

    @get : Rule
    val mainCoroutineRule = MainCoroutineRule()


    //Before and after replaced by rule
 /*   val testDispatcher = StandardTestDispatcher()
    @Before
    fun start(){

        Dispatchers.setMain(testDispatcher)
    }
*/
    @Test
    fun testGuestUser(){
        val cUtil = CUtil(mainCoroutineRule.testDispatcher)
        runTest {
            cUtil.getAddress()
            //this will run the scheduled coroutine
            mainCoroutineRule.testDispatcher.scheduler.advanceUntilIdle()
        }

    }

   /* @After
    fun tearDown(){
        Dispatchers.resetMain()
    }*/
}