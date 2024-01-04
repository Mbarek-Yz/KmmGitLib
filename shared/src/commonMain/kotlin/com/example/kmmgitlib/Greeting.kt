package com.example.kmmgitlib

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun showHelloWorldToast(message : String , context : Any?) {
        getToast(message,context)
    }
}