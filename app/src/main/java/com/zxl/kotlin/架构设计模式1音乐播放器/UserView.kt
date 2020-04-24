package com.zxl.kotlin.架构设计模式1音乐播放器

import android.widget.Toast

interface  UiView {
    fun showView(){}
    fun getUiButton(){}
}
//代理uiView
//class MediaPlayerUi(uiView: UiView):UiView by uiView

class GreenUiView:UiView{
    override fun showView() {
//       Toast.makeText("","绿色",)
    }

    override fun getUiButton() {
        println("绿色按钮")
    }
}

class BlueUiView:UiView{
    override fun showView() {
        println("蓝色")
    }

    override fun getUiButton() {
        println("蓝色按钮")
    }
}
const val TITLE = "标题"
const val CONTENT = "内容"
class VipView(var title:String?,var content:String?):UiView{
    init {
        title=title?: TITLE
        content=content?: CONTENT
    }
    constructor():this(TITLE,CONTENT)
    constructor(title:String?):this(title,CONTENT)

    override fun showView() {
        println("$title--$content")
    }

    override fun getUiButton() {
        super.getUiButton()
    }
}