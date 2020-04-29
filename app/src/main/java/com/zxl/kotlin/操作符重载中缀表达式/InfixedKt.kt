package com.zxl.kotlin.操作符重载中缀表达式

infix fun Int.vs(int: Int):String{
    if (this - int > 0){
        return "大于"
    }else if (this - int < 0){
        return "小于"
    }else{
        return "等于"
    }
}

fun test(){
    val a = 5
    val s = 5 vs 6
    val b = tt() cVs tt()
}

class tt{
    infix fun cVs(any: Any):Boolean{
        return true
    }
}
