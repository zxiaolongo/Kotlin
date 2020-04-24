package com.zxl.kotlin.data数据类sealed密闭类

//方式 data  class  name(...)
//2. data class 使用的坑  是一个 final 类，并且没有无参的构造函数
data class Data(var int: Int,var name:String) {
    //默认生成一下方法
    //publuc void  getter/setter
    //toString
    //hashcode
    //equesls
    //copy
}