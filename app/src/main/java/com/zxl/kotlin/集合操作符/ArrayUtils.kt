package com.zxl.kotlin.集合操作符

//Kotlin创建数组大致有如下两种方式：
//
//1.使用arrayOf(), arrayOfNulls()，emptyArray()工具函数。
//
//2.使用Array(size: Int, init:(Int) -> T)
class ArrayUtils {
    fun test1() {
        //创建包含指定元素的数组----
        var arr = arrayOf("java", "kotlin")
        var arrInt = arrayOf(1, 2, 3)

        //创建指定长度，元素为null的数组
        var arr2 = arrayOfNulls<String>(2)

        arr.set(1, "hah")
        arr[0] = "hah"
    }

    //??? todo 没看懂
    fun test2() {
        var  arrInit = Array(2, arrInit())
    }
}
//个it代表什么了吧，就是代表（Int）的参数传入的值
              //参数   返回值
fun arrInit(): (Int) -> Int = { it * 2 }
