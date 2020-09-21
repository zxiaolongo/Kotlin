package com.zxl.kotlin.委托

class RemoteRepository2(retrofit: Retrofit) : ServerApi by retrofit
///透过现象看本质：
//的确，和我们之前自己手动实现的一样：编译器会自动在
// 1 被委托类添加了一个委托类对象作为它的属性，
// 并且
// 2 在构造方法中将我们指定的委托对象赋值给了它，
// 3 然后实现了抽象方法，实现的逻辑就是委托给这个添加的委托类对象。
//*** 如果我们自己重写方法，编译器不再自动生成，执行自己实现的方法，不再执行被委托类方法  super.xxx其实是空的 不是被委托类的


class RemoteRepository3(retrofit: Retrofit) : ServerApi by retrofit{
    override fun login(username: String, password: String) {
        println("register in RemoteRepository.")
    }
}
//这样的话，login，就会执行自己的逻辑，编译器就不会再为你提供实现。
