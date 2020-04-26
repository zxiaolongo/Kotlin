package com.zxl.kotlin.传类的Class

class TestKt{
    //k-java
    fun test(a:Int){
        var jav = ClassKt()
        jav.test(ClassJava::class.java)a:Int
    }
    //k-kotlin
    fun test23(){
        var kt = ClassKt()
        kt.testKt(ClassKt::class.java)
    }
}
