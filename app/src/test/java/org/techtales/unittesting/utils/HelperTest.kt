package org.techtales.unittesting.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper = Helper()
    }

    @After
    fun tearDown(){

        println("After Every Test Case")
    }

    @Test
    fun isPallindrome() {

        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false, result)

    }

    @Test
    fun isPallindrome_inputString_level_expectedTrue() {

        //Act
        val result = helper.isPallindrome("a")
        //Assert
        assertEquals(true, result)

    }
}