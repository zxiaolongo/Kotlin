package com.zxl.kotlin.lamda闭包

class LamdaKt {
    //kt声明--{}包起来的闭包
    fun test(){
        //参数->lamda体
        var thread = Thread({->})
    }
    fun test2(){
        //无参数可省箭头
        var thread = Thread({})
    }
    fun test3(){
        //lamda是最后一个参数可以放到（）外边
        var thread = Thread(){}
    }
    fun test4(){
        //只有一个参数可以省（）
        var thread = Thread{}
    }
}