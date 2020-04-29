package com.zxl.kotlin.协程

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * 1 协程是依附于线程的，当线程都退出了，协程也不会执行了
 * */
fun main(){
    GlobalScope.launch {
        delay(1000)
        println("Coroutine done")//不执行
    }
    println("start")
    Thread.sleep(500)
    println("Thread done")
}
//0 ---start
//0.5----Thread done

//Thread.sleep(500) => Thread.sleep(2000)
//0 ---start
//1---Coroutine done
//2----Thread done
