package com.zxl.practice.network

import com.njp.coroutinesdemo.bean.ImageDataResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("appScrollImage/getAppScrollImageLists.do")
    suspend fun getImage(@Query("type") type: String = "json"): ImageDataResponseBody
    
}