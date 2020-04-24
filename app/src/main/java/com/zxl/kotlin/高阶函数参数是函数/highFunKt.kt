package com.zxl.kotlin.高阶函数参数是函数

class highFunKt {
    //block表示一个函数   函数作为参数返回值 Unit不能省略   内部函数实际都是生成的内部类对象
    fun onlyIf(a:Int,block:()->Unit){}
    //函数的声明    对象::方法名
    fun test(){
        val runnable= Runnable {  }
        val function = runnable::run
        onlyIf(0,function)
    }
}