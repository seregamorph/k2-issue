package com.example.demo

import kotlin.reflect.KClass

// separate issue https://youtrack.jetbrains.com/issue/KT-58007/K2-Unsupported-compile-time-value-GETFIELD-FIELD-PROPERTYBACKINGFIELD-when-const-value-is-default-for-annotation
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class IntegerNumberValid(
    val message: String = "Has illegal integer number value",
    val groups: Array<KClass<*>> = [],

    val minimum: Long = Long.MIN_VALUE,
    val maximum: Long = Long.MAX_VALUE
)
