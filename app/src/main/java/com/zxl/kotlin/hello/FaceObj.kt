package com.zxl.kotlin.hello

class Greeter(var name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main2(args: Array<String>) {
    Greeter("World!").greet()          // 创建一个对象不用 new 关键字
}