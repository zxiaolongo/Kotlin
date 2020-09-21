package com.zxl.kotlin

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import java.net.URLEncoder

class MainActivity : BaseActivity() {
    val handler = object : Handler(){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            Log.i("---TAG","--------")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var s = URLEncoder.encode("aaa","utf-8")
        Log.i("---TAG",s)
    }

    interface A{
        fun b(index:Int):String
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}

