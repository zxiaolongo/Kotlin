package com.zxl.kotlin

import android.content.Context
import android.content.Intent

import com.zxl.kotlin.specialFun.SpecialFunActivity

class JavaTest {
    fun jump(context: Context) {
        context.startActivity(Intent(context, SpecialFunActivity::class.java))
    }
}
