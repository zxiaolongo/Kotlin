package com.zxl.kotlin.协程

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

/**
 * 1 async 得到异步结果
 * 2 launch 开异步线程
 * */
suspend fun sus1(): String? {
    val job1 = GlobalScope.async<String> {
        delay(500)
        println("----" + "hello")
        return@async "hello"
    }
    val job2 = GlobalScope.async<String> {
        delay(2000)
        println("----" + "world")
        return@async "world"
    }
    return job1.await() + job2.await()
}

fun test6(block: (String) -> Unit) {
    runBlocking {
        val list = mutableListOf<String>()
        println("---start")    //0
        withContext(Dispatchers.IO) {
            for (i in 1..5) {
                launch {
//                    list.add(com.zxl.kotlin.t(1))
                }

            }
        }
        println("----end")    //500    耗时500ms  不用launch耗时500ms * 5
        block(list.toString())
//        tv.setText(list.toString())  [1,2,3,4,5]
    }
}


suspend fun t(s: Int): String {
    delay(500)
    println("------" + Thread.currentThread().name)
    return s.toString()
}
