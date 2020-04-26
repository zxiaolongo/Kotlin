package com.zxl.kotlin.解构

class MapUtils {
    fun test(){
        var map = mapOf<String, String>("key" to "key", "value" to "value")
        for((k,v) in map){ //Entry 对象就行解构
            println("$k---$v")
        }
    }
}


//Kotlin提供了如下函数来创建Map集合：
//
//mapOf()：该函数返回不可变的Map集合。该函数可接受0个或多个key-value对，这些key-value对将作为Map的元素。
//mutableMapOf()：该函数返回可变的MutableMap集合。该函数可接受0个或多个key-value对，这些key-value对将作为Map的元素。
//hashMapOf()：该函数返回可变的HashMap集合。该函数可接受0个或多个key-value对，这些key-value对将作为Map的元素。
//linkedMapOf()：该函数返回可变的LinkedHashMap集合。该函数可接受0个或多个key-value对，这些key-value对将作为Map的元素。
//sortedMapOf()：该函数返回可变的TreeMap集合。该函数可接受0个或多个key-value对，这些key-value对将作为Map的元素。
