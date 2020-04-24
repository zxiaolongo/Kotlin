package com.zxl.kotlin.静态伴生对象jvmStatic注解

//kotlin中没有静态static
class CompaionKt {
    //相当java静态内部类
    companion object {
        //object 不起名字默认-Compaion
//        @JvmStatic notice 加静态注解java也可以直接调用
        var a: String? = null
        //        @JvmStatic
        fun test() {}
    }
}

// 伴生对象中定义的方法和包级别函数有什么区别？
//由于Kotlin中并没有所谓的静态方法和成员，那么独特之处就只剩下了有权访问私有构造
