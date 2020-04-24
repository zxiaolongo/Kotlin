package com.zxl.kotlin.单例推荐

class Singlekt private constructor(){
    //1.object:静态对象
    //2.companion object：伴生对象，一个类中只能有一个。
    // 类似于java中的静态方法 Java 中使用类访问静态成员，静态方法
    // 静态方法
    companion object{
        fun get():Singlekt=Holder.instanse
    }
    //静态匿名内部类 object添加就是个单例
    private object Holder{
        var instanse = Singlekt()
    }
}