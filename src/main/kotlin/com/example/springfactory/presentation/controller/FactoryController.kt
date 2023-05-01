package com.example.springfactory.presentation.controller

import com.example.springfactory.domain.factory.Product
import com.example.springfactory.domain.pc.PcFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/factory")
class FactoryController {

    @GetMapping
    fun getFactory(): MutableList<String> {
        val factory = PcFactory()

        val pc1: Product = factory.create("A001")
        val pc2: Product = factory.create("A002")
        val pc3: Product = factory.create("A003")

        pc1.use()
        pc2.use()
        pc3.use()

        return factory.getSerialNumberList()
    }
}