package com.zxl.kotlin.传类的Class

class TestKt{
    //k-java
    fun test(){
        var jav = ClassKt()
        jav.test(ClassJava::class.java)
    }
    //k-kotlin
    fun test23(){
        var kt = ClassKt()
        kt.testKt(ClassKt::class.java)
    }
}