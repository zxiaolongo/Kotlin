package com.zxl.kotlin.匿名内部类单例;

public class Test {
    //j-kt
    public void test(){
        ObjectKt.INSTANCE.test();
        ObjectKt.INSTANCE.getA();//java调kotlin会翻译为私有 set/get
    }
}
