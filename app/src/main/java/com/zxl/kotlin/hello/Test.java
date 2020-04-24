package com.zxl.kotlin.hello;

public class Test {
    public void test(){
        A a = c->c*2;
    }
    interface A{
        int a(int a);
    }
    interface B{
        void b(String b);
    }
}

