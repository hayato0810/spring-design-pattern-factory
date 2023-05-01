package com.example.springfactory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringFactoryApplication

fun main(args: Array<String>) {
	runApplication<SpringFactoryApplication>(*args)
}
