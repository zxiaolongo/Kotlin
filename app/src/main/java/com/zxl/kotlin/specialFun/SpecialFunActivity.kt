package com.zxl.kotlin.specialFun

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.zxl.kotlin.BaseActivity
import com.zxl.kotlin.R

class SpecialFunActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_fun)
    }
    fun btn1(view: View){
        var s:String;
       if (sum(1,1) is Int){ //智能转换  --true后自动转换为Int
           s = "Int"
       }else{
           s = "not Int"
       }
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
    }


    fun btn2(view: View){
        var string:String
        string = sum3("1",2)
        Toast.makeText(this,string,Toast.LENGTH_SHORT).show()
    }
    fun btn3(view: View){}
}
