package com.zxl.kotlin.委托

interface NewsApi {
    fun getNewsList()
}

class NewsApiImpl : NewsApi {
    override fun getNewsList() {
        println("NewsApiImpl: getNewsList()")
    }
}
//如果需要多个委托，采用这种语法就可以，一一对应。
class RemoteRepository4(retrofit: Retrofit) : ServerApi by retrofit, NewsApi by NewsApiImpl()
