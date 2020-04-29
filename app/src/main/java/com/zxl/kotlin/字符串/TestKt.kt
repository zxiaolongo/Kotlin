package com.zxl.kotlin.字符串

class TestKt {

    //k-k   normol defalt=public   class-defalt=public final
    fun test(){
        var sk=StringKt()
        //var s:String = sk.a    // notice: k-k进行null检查
        sk.test()
        println("${sk.a}")
    }

     //k-j   normol defalt=public   class-defalt=public final
    fun testj(){
        var sk=StringJava()
        var s:String = sk.a   // notice: k-j越过null检查  String!临时兼容java,
        sk.test()
        println("$s")
    }

    //?.   ?:
    fun print(){
        var  sk= StringKt()
        var len = sk.a?.length?:0  //notice ?.可不做处理返回值为 null 或 配合?:做空判断处理
        println("${sk.a}")
    }

}