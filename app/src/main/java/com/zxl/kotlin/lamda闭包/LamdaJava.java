package com.zxl.kotlin.lamda闭包;

public class LamdaJava {
    public void test(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
    //java-lamda
    public void test2(){
        Thread thread = new Thread(() -> {
        });
    }
}
