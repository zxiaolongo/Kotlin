package com.zxl.kotlin.静态伴生对象jvmStatic注解;

public class Test {
    //j-kotlin
    public void test(){
        //可以加@JvmStatic注解就能直接调用了
        CompaionKt.Companion.test();
        CompaionKt.Companion.getA();
    }
}
