package com.zxl.kotlin.变量



class TestKt {
    //kt-kt
    fun test(){
       var kt = ParamKt()
        kt.a    //kt调kt展现的是public
        kt.test()
    }
    //kt-java
    fun test2(){
        var jav= ParamJava()
        var kt = ParamKt()
        kt.b = jav.a   //kt兼容Java  null不校验l  使用会有null异常
    }
}