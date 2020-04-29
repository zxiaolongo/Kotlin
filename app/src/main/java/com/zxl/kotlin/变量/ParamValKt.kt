package com.zxl.kotlin.变量

import java.util.*

//val不可变对象  也是可以改变的，通过get重写
//const 不可变常量  只能在1 object类 companion object伴生对象使用
                         //2 顶级leve中，，file中
class ParamValKt(var birthday:Int){
    val age:Int
    get() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthday
    }
    fun oneYearLater(){
        birthday--
    }
}

//class a{
//    val aa:Int
//    get() {
//        return 2
//    }
//    val bb:Int
//    get() {
//        return 3
//    }
//}