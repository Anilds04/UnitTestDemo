package com.example.unittestingdemo.mokitotest

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        Mockito.`when`(userRepository.loginUSer(anyString(), anyString()))
            .thenReturn(LOGIN_STATUS.SUCCESS)
    }

    @Test
    fun testUserService(){
        val userService = UserService(userRepository)
        val result = userService.loginUser("test@gmail.com", "111111")

        Assert.assertEquals("Login Success", result)

    }

}
