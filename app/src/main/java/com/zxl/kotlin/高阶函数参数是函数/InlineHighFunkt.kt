package com.zxl.kotlin.高阶函数参数是函数

class InlineHighFunkt {
    //inline将函数调用 变为语句调用  减少不必要的对象创建
    //缺点 增加编译器负担，代码块变大，查找问题困难-》一般只在高阶函数使用
    inline fun onlyIf(a:Int,block:()->Unit){}
    //函数的声明    对象::方法名
    fun test(){
        val runnable= Runnable {  }
        val function = runnable::run
        onlyIf(0,function)
    }
}