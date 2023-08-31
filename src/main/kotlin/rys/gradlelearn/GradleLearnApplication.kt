package rys.gradlelearn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleLearnApplication

fun main(args: Array<String>) {
    runApplication<GradleLearnApplication>(*args)
    println("App is up")
}
