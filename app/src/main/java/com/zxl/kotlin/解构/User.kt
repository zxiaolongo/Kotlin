package com.zxl.kotlin.解构

class User(var name:String,var age:Int) {
    //operator 关键字 + component1...component6
    operator fun component1() = name
    operator fun component2() = age
}

fun test(){
    var user = User("name",12)
    //定义出来两个变量 变量1：name - component1()  变量2：age - component2()
    val (name,age) = user
    println("$name---$age")
}