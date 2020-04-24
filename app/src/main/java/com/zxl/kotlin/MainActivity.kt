package com.zxl.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.zxl.kotlin.specialFun.SpecialFunActivity
import com.zxl.kotlin.架构设计模式1音乐播放器.SingleUI
import com.zxl.kotlin.架构设计模式1音乐播放器.User
import com.zxl.kotlin.架构设计模式1音乐播放器.UserType


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goSpecialFun(view: View){
        val user = User(1,"刘德华",UserType.VIP("大大标题","显示内容"))
        SingleUI.getInstance().showUi(user)
    }
}
