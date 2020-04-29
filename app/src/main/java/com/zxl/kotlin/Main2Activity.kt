package com.zxl.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zxl.kotlin.协程.sus1
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun btn(view: View){
        GlobalScope.launch(Dispatchers.Main) {
            val sus1 = sus1()
            println("----"+sus1)
            tv.setText(sus1)
        }
    }
}
