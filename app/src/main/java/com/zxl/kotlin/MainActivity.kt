package com.zxl.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goSpecialFun(view: View) {
        runBlocking {
            val list = mutableListOf<String>()
            println("---start")
            withContext(Dispatchers.IO) {
                for (i in 1..5){
                    launch {
                        list.add(t(1))
                    }
                }
            }
            println("----end")
            tv.setText(list.toString())
        }
    }
}

suspend fun t(s: Int): String {
    delay(500)
    println("------"+Thread.currentThread().name)
    return s.toString()
}

