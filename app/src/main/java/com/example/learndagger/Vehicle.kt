package com.example.learndagger

interface Vehicle {
    fun run()
}

class  Car (private val engine: Engine) : Vehicle {
    override fun run() {
        engine.start()
    }

}