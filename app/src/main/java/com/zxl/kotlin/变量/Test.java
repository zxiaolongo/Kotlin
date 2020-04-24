package com.zxl.kotlin.变量;

public class Test {
    //j-k
    public void test(){
        ParamKt kt = new ParamKt();
        kt.test();
        kt.setB(null);  //kt 兼容Java无null校验    kt 接受java对象时一定定义对象为xx? 可空
    }
}
