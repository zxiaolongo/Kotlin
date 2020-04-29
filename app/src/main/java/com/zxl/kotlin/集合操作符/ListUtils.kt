package com.zxl.kotlin.集合操作符
//他只是提供了HashSet， LinkedHashSet， ArrayList这三个常见的实现类，
//
//如果开发者需要使用TreeSet， LinkedList集合实现类依然可以使用java集合框架提供的类。
class ListUtils {
    fun test(){
        var list = listOf<String>("1","2")
        println(list.toString())//[1,2]
        var maplist = list.map {
            it+it
        }
        println(maplist.toString())//[11,22]
        var filterlist = list.filter {
            it.contains("1")
        }
        println(filterlist.toString())//[1]
    }
    var list = arrayListOf<String>("1","2")
    var a = list.map {
        "$it---map"
    }.filter {
        it.length>2
    }.find {
        //findlast
        it.contains("1")
    }.also {
//        最终结果
    }




    //reduce 表示合并两个 参数
}