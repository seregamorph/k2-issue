package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DemoExecuteServiceTest {

    @Test
    fun test() {
        val service = DemoExecuteService()
        assertEquals("result:1", service.findOne("1"))
    }
}
