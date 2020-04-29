package com.zxl.kotlin.泛型

//1  类上使用
class Box<T>(t: T) {
    var value = t
}
fun test(){
    val box1: Box<Int> = Box<Int>(1)
   // 或者
    val box = Box(1) // 编译器会进行类型推断，1 类型 Int，所以编译器知道我们说的是 Box<Int>。
}

//2函数  Kotlin 泛型函数的声明与 Java 相同，类型参数要放在函数名的前面：
fun <T> boxIn(value: T) = Box(value)

// 以下都是合法语句
val box4 = boxIn<Int>(1)
val box5 = boxIn(1)     // 编译器会进行类型推断