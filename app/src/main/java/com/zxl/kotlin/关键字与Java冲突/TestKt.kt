package com.zxl.kotlin.关键字与Java冲突

class TestKt {
    //k-java
    fun test(){
        var jav = ConflictJava()
        jav.`in`  //反引号解决关键字冲突
    }
}