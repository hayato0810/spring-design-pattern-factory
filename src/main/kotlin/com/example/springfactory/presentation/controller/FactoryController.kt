package com.example.springfactory.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/factory")
class FactoryController {

    @GetMapping
    fun getFactory(): String {
        return "Hello world"
    }
}