package com.example.demo

class DemoExecuteService {

    fun findOne(id: String): String {
        return execute { "result:$id" }
    }

    private fun <T> execute(callback: () -> T): T {
        val name = callback.javaClass.enclosingMethod.name
        val result = callback()
        logExecution(name, result)
        return result
    }

    private fun <T> logExecution(name: String, result: T) {
        println("$name: $result")
    }
}
