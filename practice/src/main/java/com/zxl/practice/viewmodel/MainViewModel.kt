package com.njp.coroutinesdemo.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.njp.coroutinesdemo.bean.LoadState
import com.njp.coroutinesdemo.launch
import com.njp.coroutinesdemo.network.NetworkService
import kotlinx.coroutines.*

class MainViewModel : ViewModel() {

    val imageData = MutableLiveData<List<String>>()
    val loadState = MutableLiveData<LoadState>()

    fun getData() {
        launch(
                {
                    loadState.value = LoadState.Loading()
                    val data1 = async { NetworkService.apiService.getImage() }
                    val data2 = async { NetworkService.apiService.getImage() }
                    val data3 = async { NetworkService.apiService.getImage() }
                    imageData.value = listOf(data1.await(), data2.await(), data3.await()).map {
                        it.rows.get(0).vcPicUrl
                    }
                    loadState.value = LoadState.Success()
                },
                {
                    loadState.value = LoadState.Fail(it.message ?: "加载失败")
                }
        )
    }

    fun getData2() {
        //viewModelScope是通过Kotlin的拓展属性的方式添加到ViewModel上的，并且其所处的线程是主线程，
        // 所以我们可以放心地在其中更新UI的操作。
        // 并且其与ViewModel的声明周期绑定，我们在这个协程范围内的耗时操作会在其生命周期结束时自动取消
        // ，不用担心内存泄漏之类的性能问题。
        viewModelScope.launch(CoroutineExceptionHandler { _, e ->
            //加载失败的状态
            loadState.value = LoadState.Fail(e.message ?: "加载失败")
        }) {
            //更新加载状态
            loadState.value = LoadState.Loading()

            //并发请求三张图片的数据
            val data1 = async { NetworkService.apiService.getImage() }
            val data2 = async { NetworkService.apiService.getImage() }
            val data3 = async { NetworkService.apiService.getImage() }
            //通过为LiveData设置新的值来触发更新UI
            imageData.value = listOf(data1.await(), data2.await(), data3.await()).map {
                it.rows.get(0).vcPicUrl
            }

            //更新加载状态
            loadState.value = LoadState.Success()
        }
    }
}
