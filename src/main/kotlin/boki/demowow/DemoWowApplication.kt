package boki.demowow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoWowApplication

fun main(args: Array<String>) {
    println("hungry too")
    runApplication<DemoWowApplication>(*args)
}
