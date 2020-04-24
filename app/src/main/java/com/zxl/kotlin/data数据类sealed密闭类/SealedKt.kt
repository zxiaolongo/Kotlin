package com.zxl.kotlin.data数据类sealed密闭类

//可以有子类  但是需要在同一个文件
sealed class SealedKt {
    object UP:SealedKt()
    object DOWN:SealedKt()
    object LEFT:SealedKt()
    object RIGHT:SealedKt()
    //一般扩展子类直接写在选项中
    class PECE(var int: Int):SealedKt()
}