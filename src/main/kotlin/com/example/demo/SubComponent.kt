package com.example.demo

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
@Component
annotation class SubComponent(
    @get:AliasFor(annotation = Component::class) val value: String = "",
    val scope: String
)
