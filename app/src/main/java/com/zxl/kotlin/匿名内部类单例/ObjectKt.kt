package com.zxl.kotlin.匿名内部类单例
//object  kotlin表现静态对象     java-中表现为单例模式
object ObjectKt {
    var a:String?=""
    fun test(){}
}

//public final class ObjectKt {
//    public static final ObjectKt INSTANCE;
//
//    static {
////        ObjectKt var0 = new ObjectKt();
////        INSTANCE = var0;
////    }
//}