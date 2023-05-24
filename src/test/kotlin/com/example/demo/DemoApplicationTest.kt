package com.example.demo

import org.mockito.kotlin.inOrder
import org.mockito.kotlin.mock
import org.junit.jupiter.api.Test

class DemoApplicationTest {

    @Test
    fun testMockLambda() {
        val separator = mock<() -> Unit>()

        separator()
        inOrder(separator) {
            verify(separator)()
        }
    }
}
