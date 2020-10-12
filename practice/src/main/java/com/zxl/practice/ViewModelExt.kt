package com.njp.coroutinesdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
//当在ViewModel中引入协程，如果直接使用CoroutineScope，那么需要在onCleared()方法中取消协程，
// 如果忘记取消协程那么会导致出现内存泄漏等各种问题，此时需要使用ViewModel扩展属性viewModelScope来实现协程作用域。
fun ViewModel.launch(
    block: suspend CoroutineScope.() -> Unit,
    onError: (e: Throwable) -> Unit = {},
    onComplete: () -> Unit = {}
) {
    //可以看到viewModelScope是通过Kotlin的拓展属性的方式添加到ViewModel上的，
    // 并且其所处的线程是主线程，所以我们可以放心地在其中更新UI的操作。

    // ViewModel 销毁时自动地取消子协程  作用是用来取消协程的 相当于GlobalScope.launch(Main)所以不回阻塞主线程
    viewModelScope.launch(CoroutineExceptionHandler { _, e -> onError(e) }) {
        try {
            Log.i("---TAG","--------ss"+Thread.currentThread().name)
            block.invoke(this)
        } finally {
            onComplete()
        }
    }
}

