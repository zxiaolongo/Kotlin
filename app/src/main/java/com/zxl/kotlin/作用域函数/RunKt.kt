package com.zxl.kotlin.作用域函数
//run函数创建了一个单独的作用域，在该作用域中重新定义了一个word变量，
// 两次打印使用的是各自作用域中的word变量，互不影响；并且，run函数返回了lambda结果。
//1 run
fun test(args: Array<String>) {
    var word = "我是小明"
    val returnValue = run {
        var word = "我是小红"
        println("run:$word")
        word
    }
    println("main:$word")
    println("returnValue:$returnValue")
}
//run:我是小红
//main:我是小明
//returnValue:我是小红

//2 T.run
data class Person2 (
        var name: String,
        var age: Int = 0
)
fun main2(args: Array<String>) {
    var person: Person? = null
    // T?.run当T为null时不调用run函数
    person = Person("小明",25)
    val returnValue = person.run {
        println("person.run:this=$this")
        var person = Person("小红",23)
        println("person.run:person=$person")
        age = 26
        person
    }
    println("main:person=$person")
    println("main:returnValue=$returnValue")
}
//person.run:this=Person(name=小明, age=25)
//person.run:person=Person(name=小红, age=23)
//main:person=Person(name=小明, age=26)
//main:returnValue=Person(name=小红, age=23)