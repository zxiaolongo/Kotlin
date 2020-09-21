package com.zxl.kotlin.委托

import kotlin.properties.Delegates
//3. 属性委托（delegated property）
//5. 标准库的属性委托之：observable/vetoable
//我们关注by后面的部分就可以了，调用了Delegates.observable()，将它的返回值作为委托对象：
class Person {
    var name: String by Delegates.observable("<no name>") { property, oldValue, newValue ->
        println("property'name is ${property.name}, oldValue = $oldValue, newValue = $newValue")
    }
}

fun mainTest() {
    val person = Person()
    person.name = "Alice"
    person.name = "Bob"
}
//property'name is name, oldValue = <no name>, newValue = Alice
//property'name is name, oldValue = Alice, newValue = Bob




//同observable委托有相同功能的还有一个：vetoable。
//发现它的lambda会要求一个返回值，这个返回值有什么作用呢？
// 这与observable和vetoable的回调时机不同有关：
//*** observable的回调时机是在属性值修改之后，vetoable的回调时机在属性值被修改之前。
// 如果返回值为true，属性值就会被修改成新值；如果返回值为false，此次修改就会直接被丢弃。

class Adult {
    var age: Int by Delegates.vetoable(18) { property, oldValue, newValue ->
        println("----property'name is ${property.name}, oldValue = $oldValue, newValue = $newValue")
        newValue >= 18
    }
}

fun mainTTT(){
    val adult = Adult()
    adult.age = 25
    println("----adult.age = ${adult.age}")
    adult.age = 16
    println("----adult.age = ${adult.age}")
}
//当adult.age = 25时，属性值被成功修改；adult.age = 16，修改操作被丢弃，修改失败，属性值还是原来的。
// ----property'name is age, oldValue = 18, newValue = 25
// ----adult.age = 25
// ----property'name is age, oldValue = 25, newValue = 16
//----adult.age = 25