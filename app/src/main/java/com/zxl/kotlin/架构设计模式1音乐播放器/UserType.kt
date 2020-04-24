package com.zxl.kotlin.架构设计模式1音乐播放器

sealed class UserType {
    object GREEN:UserType()
    object BLUE:UserType()
    //extend
    class VIP(var title:String?,var content:String?):UserType()
}
fun getUiView(type: UserType)=when(type){
    UserType.GREEN->GreenUiView()
    UserType.BLUE->BlueUiView()
    //extend
    is UserType.VIP->VipView(type.title,type.content)
}
