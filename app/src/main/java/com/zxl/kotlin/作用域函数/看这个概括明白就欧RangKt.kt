package com.zxl.kotlin.作用域函数
class User(var name:String)
class RangKt {
    //notice --返回lamda结果  run with(T)  let
    //run       ****创建了一个单独的作用域  变量，互不影响 run函数返回了lambda结果
    //with(T)   将任意对象作为上下文对象this传入，并且可以隐式的访问该对象，返回lambda结果。 隐式修改T的变量值。
    //let  T.let函数与T.run唯一的区别 上下文对象的名称不同 run-this  let-it
    //notice -- 返回this调用者
    //    //apply  T.apply和T.also唯一的区别是：上下文对象的名称不同，前者是this，后者是it，T.apply函数中可以隐式访问T对象。
    //    //also  T.also函数和T.let函数的唯一区别是：前者返回值是this（即T），后者返回值是lambda结果。

    //takeif--以it作为在作用域上下文对象T的名称，若lambda结果为true，返回this；否则，返回null。
    //takeunless-
    //let/run 都会返回闭包的作用结果
    val user=User("name")
    var letResult = user.let {
        //有参数 调用者
        user:User->"let::${user.javaClass}"
    }
    val runResult = user.run {
        "run::${this.javaClass}"
    }
}