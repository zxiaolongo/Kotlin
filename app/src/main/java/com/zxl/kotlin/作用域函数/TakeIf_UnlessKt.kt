package com.zxl.kotlin.作用域函数
//以it作为在作用域上下文对象T的名称，若lambda结果为true，返回this；否则，返回null。
fun main4(args: Array<String>) {
    var count = 0
    while (count <= 10) {
        val returnValue = count.takeIf {
            count++ % 2 == 0
        }
        println(returnValue)
    }
}
//0
//null
//2
//null
//4
//null
//6
//null
//8
//null
//10

//若lambda结果为true，返回null；否则，返回this
fun main5(args: Array<String>) {
    var count = 0
    while (count <= 10) {
        val returnValue = count.takeUnless {
            count++ % 2 == 0
        }
        println(returnValue)
    }
}
//null
//1
//null
//3
//null
//5
//null
//7
//null
//9
//null