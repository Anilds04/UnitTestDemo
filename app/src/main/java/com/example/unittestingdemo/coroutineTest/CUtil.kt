package com.example.unittestingdemo.coroutineTest

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CUtil(val dispatcher: CoroutineDispatcher){

    suspend fun getUserName() : String{

        delay(10000)
        return "testname"
    }


    suspend fun getUser() : String{
        CoroutineScope(Dispatchers.Main).launch {
            delay(100)
        }
        return "user"
    }

    suspend fun getAddress() : String{
        withContext(Dispatchers.IO){
            delay(100)
        }

        return "testaddress"
    }
}