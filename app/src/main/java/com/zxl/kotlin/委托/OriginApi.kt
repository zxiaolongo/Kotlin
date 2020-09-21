package com.zxl.kotlin.委托

interface ServerApi {
    fun login(username: String, password: String)
}


class Retrofit : ServerApi {

    /*类比登录操作
    */
    override fun login(username: String, password: String) {
        println("login successfully.")
    }
}

class RemoteRepository : ServerApi {

    private val serverApi: ServerApi = Retrofit()

    override fun login(username: String, password: String) {
        serverApi.login(username, password)
    }
}

fun main() {

    val repository = RemoteRepository()
    repository.login("David", "123456") //输出 login successfully.
}