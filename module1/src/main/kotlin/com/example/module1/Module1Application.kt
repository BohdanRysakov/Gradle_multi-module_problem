package com.example.module1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Module1Application

fun main(args: Array<String>) {
    runApplication<Module1Application>(*args)
    println("Module 1 is up")
}
