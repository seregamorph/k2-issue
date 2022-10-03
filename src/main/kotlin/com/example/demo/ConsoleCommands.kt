package com.example.demo

import org.springframework.stereotype.Component

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
@Component // comment @Component and compiler is fine
annotation class ConsoleCommands(
    val value: String = "",
    val scope: String
)
