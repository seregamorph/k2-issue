package com.example.demo

//import javax.validation.Constraint
//import javax.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
//@Constraint(validatedBy = [OptionalPercentageValueValidator::class])
@MustBeDocumented
annotation class PercentageValueValid(
    val message: String = "Expected value between 0% and 100%",
    val groups: Array<KClass<*>> = [],
//    val payload: Array<KClass<out Payload>> = [],

    val minimum: Double = 0.0,
    val maximum: Double = 100.0
)