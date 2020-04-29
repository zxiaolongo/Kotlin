package com.zxl.kotlin.内联函数一般高阶函数时使用

fun test2() {
    lock2{
        println("inline fun")
//        return   //直接编译不通过，不让retrun
    }
}
//// crossinline 不允许inline中的lamda中断外部函数
inline fun  lock2(crossinline body: () -> Unit){//body 不可以中断外部
    println("lamda执行前")
    body()
    println("lamda执行后")
}

//04-28 09:44:50.892 32549-32549/com.zxl.kotlin I/System.out: lamda执行前
//04-28 09:44:50.893 32549-32549/com.zxl.kotlin I/System.out: inline fun
//04-28 09:44:50.893 32549-32549/com.zxl.kotlin I/System.out: lamda执行后