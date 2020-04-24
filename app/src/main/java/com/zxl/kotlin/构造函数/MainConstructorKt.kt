package com.zxl.kotlin.构造函数

import android.content.Context
import android.util.AttributeSet
import android.view.View


class MainConstructorKt {
}
//多个构造函数需要显示声明次级构造函数
class TestView:View{
    //次级构造函数必须直接或者间接继承主构造函数 或父构造函数
    constructor(ctx:Context):super(ctx)
    constructor(ctx: Context,attributeSet: AttributeSet?):this(ctx,attributeSet,0)
    constructor(ctx: Context,attributeSet: AttributeSet?,defstyle:Int):super(ctx,attributeSet,defstyle)

}