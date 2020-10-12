package com.njp.coroutinesdemo.bean

data class ImageDataResponseBody(var rows:List<RowsBean>){
    class RowsBean {
        var vcPicUrl: String = ""
    }
}

