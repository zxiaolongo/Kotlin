package com.zxl.kotlin.委托
//4. 标准库中的属性委托之：lazy
//使用场景：延迟val属性的初始化时机（第一次访问的时候才会去初始化）
class LazyTest {
    val lazyValue: String by lazy {
        println("I'm in lazy.")
        "lazyValue"
    }
}

fun mainT() {
    val lazyTest = LazyTest()
    println(lazyTest.lazyValue)
    println(lazyTest.lazyValue)
}
//I'm in lazy.
//lazyValue
//lazyValue