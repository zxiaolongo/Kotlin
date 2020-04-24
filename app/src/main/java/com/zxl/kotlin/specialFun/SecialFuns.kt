package com.zxl.kotlin.specialFun

//1 表达式作为函数体，返回类型自动推断：
fun sum(a: Int, b: Int) = a + b

//2 public 方法则必须明确写出返回类型  void 不用写
public fun sum2(a: Int, b: Int): Int = a + b
public fun sum3(a: String, b: Int)="${a+b}" //h好像也没毛病
fun haha(a:Int,b: Int){
    var a1:String
    a1 = "${a+b}"
}
//3 可变长参数函数
fun vars(vararg v:Int):String{
    var string=""
    for(vt in v){
        string+=vt
    }
    return string
}


class a{
    fun sun(){}
    fun sun2()=""
}

