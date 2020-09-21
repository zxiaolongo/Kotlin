package com.zxl.kotlin.委托
//7. map委托：
//特点：对于属性的访问，直接委托给一个map对象。
//要求：map的key要同属性名保持一致。
class User(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}


fun mainVal() {
    val user = User(mapOf(
            "name" to "David Lee",
            "age" to 25
    ))
    println(user.name)  //输出 David Lee
    println(user.age)   //输出 25

}


//对于var属性：
class Student(map: MutableMap<String, Any?>) {

    var name: String by map
    var age: Int by map
    var address: String by map
}

fun mainVar(){
    val map: MutableMap<String, Any?> = mutableMapOf(
            "name" to "Alice",
            "age" to 23,
            "address" to "beijing"
    )

    val student = Student(map)
    println(student.name)       //Alice
    println(student.age)        //23
    println(student.address)    //beijing

    println("---------------------------------")

    student.address = "hefei"
    println(student.address)    // hefei
    println(map["address"])     // hefei
}
//val的map委托的对象是Map<String, Any?>，var的map委托的对象MutableMap<String, Any?>
//对于var属性，对于MutableMap中的value的修改，会同步到属性值；反之亦然。