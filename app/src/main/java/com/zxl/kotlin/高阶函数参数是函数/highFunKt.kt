package com.zxl.kotlin.高阶函数参数是函数

class highFunKt {
    //block表示一个函数   函数作为参数返回值 Unit不能省略   内部函数实际都是生成的内部类对象
    fun onlyIf(a:Int,block:()->Unit){}
    //函数的声明    对象::方法名
    fun test(){
        val runnable= Runnable {  }
        val function = runnable::run
        onlyIf(0,function)

        //Kotlin的函数也是一等公民  有自己的类型(参数1，参数2)->返回值
        var myFun :(Int,Int)->String
//当直接访问一个函数的函数引用， 而不是调用函数时，需要函数名钱添加两个冒号，而且不能再函数后面添加圆括号-----
// 一旦添加圆括号就变成了调用函数，而不是访问函数的引用
        myFun =::highFun
    }
}
//Kotlin的函数也是一等公民，因此函数本身也具有自己的类
fun highFun(a: Int,b:Int):String{
    return "kt"
}


