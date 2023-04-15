package com.example.demo

/**
 * https://youtrack.jetbrains.com/issue/KT-58008/K2-Cannot-find-cached-type-parameter-by-FIR-symbol-T-on-suspend-function-with-generic
 */
object Retry {
    data class Builder<T>(
        private val operation: String,
        private val retries: Int,
        private val action: suspend () -> T,
    )

    fun <T> withExponentialBackoff(operation: String, retries: Int, action: () -> T): Builder<T> {
        return Builder(operation, retries, action)
    }

    fun <T> withExponentialBackoffAsync(operation: String, retries: Int, action: suspend () -> T): Builder<T> {
        return Builder(operation, retries, action)
    }
}
