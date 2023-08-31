package com.example.module2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Module2Application

fun main(args: Array<String>) {
    runApplication<Module2Application>(*args)
    println("Module 2 is up")
}
