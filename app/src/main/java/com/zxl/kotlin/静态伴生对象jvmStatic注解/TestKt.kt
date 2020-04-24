package com.zxl.kotlin.静态伴生对象jvmStatic注解

class TestKt {
    //kt-java
    fun test(){
       CompaionJava.a
       CompaionJava.test()
    }
    //kt-kt
    fun test2(){
        //第一种
        CompaionKt.Companion.test()
        CompaionKt.Companion.a
        //第二种 推荐
        CompaionKt.a
        CompaionKt.test()
    }
}