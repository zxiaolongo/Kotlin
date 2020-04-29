package com.zxl.kotlin.内联函数一般高阶函数时使用

import com.zxl.kotlin.作用域函数.User
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

//inline  crossline noline
//inline   lamdaz中可以中断外部函数的调用
//crossinline 不允许inline中的lamda中断外部函数
//noinline 拒绝内联
fun test() {
    lock{
        println("inline fun")
        return
    }
}
inline fun  lock( body: () -> Unit){//body 可以中断外部
    println("lamda执行前")
    body()
    println("lamda执行后")
}
//04-28 09:44:50.892 32549-32549/com.zxl.kotlin I/System.out: lamda执行前
//04-28 09:44:50.893 32549-32549/com.zxl.kotlin I/System.out: inline fun



//使用高阶函数会给运行时带来一些坏处：每个函数都是一个对象，捕获闭包（如：访问函数体内的变量），
// 内存分配（函数对象或Class），虚拟调用引入的运行过载

//lock(l){ foo() }

//l.lock()
//try {
//    foo()
//}
//finally {
//    l.unlock()
//}

//inline fun<T> lock(lock: Lock , body: () -> T): T{
//    return body()
//}