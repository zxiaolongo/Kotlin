package com.zxl.kotlin.传类的Class

class TestKt{
    //k-java
    fun test(){
        var jav = ClassKt()
        jav.test(ClassJava::class.java)
    }
    //k-kotlin
    fun test2(a:Int){
        var kt = ClassKt()
        kt.testKt(ClassKt::class.java)
    }
}
