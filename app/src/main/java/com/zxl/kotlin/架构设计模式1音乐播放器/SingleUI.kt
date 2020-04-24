package com.zxl.kotlin.架构设计模式1音乐播放器

import android.util.Log

class SingleUI private constructor(){
    companion object{
        fun getInstance():SingleUI{
            return Holder.instance
        }
    }
    private object Holder{
        val instance = SingleUI()
    }
    //只要知道用户就可以展示相应的ui   扩展用户的时候不用改原来代码只需添加新代码
    fun showUi(user: User){
        MediaPlayerUi(getUiView(user.userType)).showView()
    }
}