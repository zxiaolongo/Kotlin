package com.zxl.kotlin.作用域函数

data class Person (
        var name: String,
        var age: Int = 0
)
//with函数可以将任意对象作为上下文对象this传入，并且可以隐式的访问该对象，返回lambda结果。
// 如下使用示例：在mian函数中使用with函数创建了一个临时作用域，
// 在该作用域中可以重新定义person变量，两个person变量互无影响；
// 并且可以使用this访问上下文对象，隐式修改person的age变量值。
fun test2(args: Array<String>) {
    var person = Person("小明",25)
    val returnValue = with(person) {
        println("with:this=$this")
        var person = Person("小红",23)
        println("with:person=$person")
        age = 26
        person
    }
    println("main:person=$person")
    println("main:returnValue=$returnValue")
}
//with:this=Person(name=小明, age=25)
//with:person=Person(name=小红, age=23)
//main:person=Person(name=小明, age=26)
//main:returnValue=Person(name=小红, age=23)