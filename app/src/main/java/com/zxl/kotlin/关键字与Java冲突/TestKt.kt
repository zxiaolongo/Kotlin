package com.zxl.kotlin.关键字与Java冲突

class TestKt {
    //k-java
    fun test(){
        var jav = ConflictJava()
        jav.`in`  //反引号解决关键字冲突
    }
    //反斜杠的作用 还可以使非法变成合法   class `123`{}  只有kotlin可调用Java不能
}