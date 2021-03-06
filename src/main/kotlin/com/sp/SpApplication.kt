package com.sp

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.boot.context.properties.*
import org.springframework.web.reactive.config.*

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableWebFlux
class SpApplication

fun main(args: Array<String>) {
    runApplication<SpApplication>(*args)
}
