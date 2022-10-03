package com.example.demo

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NullableAssertionTest {

    @Test
    fun test() {
        val entity = entity()
        Assertions.assertThat(entity.value).isNull()
    }

    private fun entity(): Entity<Any> {
        return Entity()
    }
}
