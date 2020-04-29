package com.zxl.kotlin.内联函数一般高阶函数时使用

//内联函数被其他方法调用，，lamda已经被编译成一个值，不是函数声明，需要去除内联
fun test3() {
    lock3{
        println("inline fun")
//        return   也是不允许return  编译通不过
    }
}
inline fun  lock3(noinline body: () -> Unit){//body 可以中断外部
    println("lamda执行前")
    body()
    othetFun(body)     //
    println("lamda执行后")
}
fun othetFun(body: () -> Unit){
    println("ontherFun执行")
}