package com.zxl.kotlin.架构设计模式1音乐播放器
//data class 使用 是一个 final 类，并且没有无参的构造函数
 data class User(var id:Int,var name:String,var userType:UserType=UserType.BLUE)