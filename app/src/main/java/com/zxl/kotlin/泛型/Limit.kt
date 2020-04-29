package com.zxl.kotlin.泛型

fun <T : Comparable<T>> sort(list: List<T>) {
    // ……
}
//where 添加多个约束 在方法体前
fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}

fun test2(){
    sort(listOf(1, 2, 3)) // OK。Int 是 Comparable<Int> 的子类型
//    sort(listOf(HashMap<Int, String>())) // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
}

