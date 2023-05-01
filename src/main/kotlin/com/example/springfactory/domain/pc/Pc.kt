package com.example.springfactory.domain.pc

import com.example.springfactory.domain.factory.Product

class Pc(val serialNumber: String) : Product() {

    init {
        println(serialNumber + "のPCを作ります")
    }

    override fun use() {
        println(this.serialNumber + "のPCを使います")
    }
}