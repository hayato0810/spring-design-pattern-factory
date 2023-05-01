package com.example.springfactory.domain.factory

abstract class Factory {

    fun create(serialNumber: String): Product {

        // Productの生成
        var product = createProduct(serialNumber)

        // Productの登録
        registerProduct(product)

        return product
    }

    // Productを生成する抽象メソッド
    protected abstract fun createProduct(serialNumber: String): Product

    // Productを登録する抽象メソッド
    protected abstract fun registerProduct(product: Product)
}