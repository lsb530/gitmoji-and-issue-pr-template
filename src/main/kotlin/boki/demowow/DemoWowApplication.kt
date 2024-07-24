package boki.demowow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoWowApplication

fun main(args: Array<String>) {
    println("깃모지 테스트55")
    runApplication<DemoWowApplication>(*args)
}
