package com.zxl.kotlin.变量
/**
 * 1 String? --可空
 * 2 ！！--不必Null判断
 * 3 kotlin java互调->Null(类型)检查失效
 * */
class ParamKt {
    var a:String?=null
    var b:String=""

    fun test(){
        //String!  兼容类型  kotlin java互调->Null检查失效
    }

//    @Nullable
//    private String a;
//    @NotNull
//    private String b = "";
//    @NotNull
//    public final String getB() {
//        return this.b;
//    }

//    public final void setB(@NotNull String var1) {
////        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
//        this.b = var1;
//    }
}