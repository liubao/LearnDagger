package com.example.learndagger
interface Engine {
    fun start()
}

class CarEngine : Engine {
    override fun start() {
        println("com.example.learndagger.Car engine running")
    }
}