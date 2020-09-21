package com.zxl.kotlin.协程

import android.os.AsyncTask
import android.os.Handler
import android.os.Looper
import android.provider.Contacts
import androidx.annotation.MainThread
import kotlinx.coroutines.*


/**
 * 1 runBlocking 。{}是创建一个新的协程同时阻塞当前线程，直到协程结束
 * 2 GlobalScope.launch 返回job,可以进行cancel cancle之后协程不再执行
 * 3 (async/await:Deferred)  async异步的协程任务->Deffered，Deffered.await得到协程结束时返回的结果
 * */
internal val Background = newFixedThreadPoolContext(2, "bg")
// notice:  runBlocking {}是创建一个新的协程同时阻塞当前线程，直到协程结束。
// notice 这个不应该在协程中使用，主要是为main函数和测试设计的。
//notice 在Android中一般会使用GlobalScope.async()函数和GlobalScope.launch()函数启动协程，
// 他们分别对应async()和launch()函数只是他们的协程的生命周期只受整个应用程序的生命周期限制。
// 然后再这两个函数之中可以使用上述那些函数创建子协程。而且GlobalScope.launch{}和GlobalScope.async{}新建的协程是没有父协程的。
//runBlocking
//launch
//async/launch
fun test(){
    test1()
    println("over")
}
//第一种启动方式(runBlocking:T)  协程任务会阻断当前线程，直到该协程执行结束。
fun test1() = runBlocking {
    println("------"+Thread.currentThread().name)
    repeat(10){
        println("block协程挂起---$it")
        delay(500)
    }
}
//04-28 13:43:01.325 20980-20980/com.zxl.kotlin I/System.out: 协程挂起---0
//...
//04-28 13:43:02.326 20980-20980/com.zxl.kotlin I/System.out: 协程挂起---9
//04-28 13:43:02.827 20980-20980/com.zxl.kotlin I/System.out: over

//notice 第二种启动方式(launch:Job)   最常用 返回一个Job类型的对象
//Job类型的对象实际上是一个接口 join()启动一个协程、cancel() 取消一个协程
fun test2(){
    val job = GlobalScope.launch {
        println("launch---" + Thread.currentThread().name)
        repeat(10){
            println("launch协程挂起---$it")
            delay(500)
        }
    }
//    Thread.sleep(1300)              ->0,1,2,over
//    job.cancel()
}
//04-28 13:47:37.982 22137-22137/com.zxl.kotlin I/System.out: over
//04-28 13:47:37.985 22137-22221/com.zxl.kotlin I/System.out: launch协程挂起---0
//...
//04-28 13:47:39.490 22137-22225/com.zxl.kotlin I/System.out: launch协程挂起---9

//第三种启动方式(async/await:Deferred)
//1.async和await是两个函数，这两个函数在我们使用过程中一般都是成对出现的。
//2.async用于启动一个异步的协程任务，await用于去得到协程任务结束时返回的结果，结果是通过一个Deferred对象返回的。
//3 Deferred，它是 Job 的子类
fun test3() = runBlocking {
    val deferred = GlobalScope.async() {
        println("async---" + Thread.currentThread().name)  //async---DefaultDispatcher-worker-1 ---  global    不用global是main
        delay(500)
        return@async "hello"
    }
    GlobalScope.launch (Dispatchers.Main){
        println("-----------"+deferred.await())
    }
    println("---" + Thread.currentThread().name)  //---main
}

suspend fun go(){
    delay(500)

}

