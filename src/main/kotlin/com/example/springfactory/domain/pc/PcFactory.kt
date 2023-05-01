package com.example.springfactory.domain.pc

import com.example.springfactory.domain.factory.Factory
import com.example.springfactory.domain.factory.Product

class PcFactory : Factory() {

    private val serialNumberList: MutableList<String> = mutableListOf()

    override fun createProduct(serialNumber: String): Product {
        return Pc(serialNumber)
    }

    override fun registerProduct(product: Product) {
        serialNumberList.add((product as Pc).serialNumber)
    }

    fun getSerialNumberList(): MutableList<String> {
        return serialNumberList
    }
}