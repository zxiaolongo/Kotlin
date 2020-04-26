package com.zxl.kotlin.作用域函数

data class Person3 (
        var name: String,
        var age: Int = 0
)
fun main3(args: Array<String>) {
    var person: Person? = null
    person?.also {
        println("person?.also:person=$person")
    }
    person = Person("小明",25)
    val returnValue = person.also {
        println("person.also:it=$it")
        var person = Person("小红",23)
        println("person.also:person=$person")
        it.age = 26
        person
    }
    println("main:person=$person")
    println("main:returnValue=$returnValue")
}
//person.also:it=Person(name=小明, age=25)
//person.also:person=Person(name=小红, age=23)
//main:person=Person(name=小明, age=26)
//main:returnValue=Person(name=小明, age=26)