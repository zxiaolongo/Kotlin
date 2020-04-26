package com.zxl.kotlin.for循环

class ForKt {

}
fun test(){
    for (i in 1..10){
        //取代for(int i=0;i<10;++i)    [1,10]
    }

    for (i in 1 until 10){
        //[1,10)
    }

    for (i in 10 downTo 1){
        //取代for(int i=0;i<10;i++)
        //[10,1]
    }

    for (i in 1..10 step 2){
        //取代for(int i=0;i<10;i+=2)    1,3,5,7,9
    }

    repeat(10){
        //取代for(int i=0;i<10;i++)   it=i
    }

    for (s in listOf<String>("1","2")){

    }

    for ((index,s) in listOf<String>("1","2").withIndex()){//解构
        println("$index---$s")
    }

}