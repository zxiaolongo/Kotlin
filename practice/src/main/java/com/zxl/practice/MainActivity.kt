package com.zxl.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.njp.coroutinesdemo.bean.LoadState
import com.njp.coroutinesdemo.ui.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.math.BigDecimal
import java.math.RoundingMode


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("---TAG","--------End"+formatDouble2(1.0))
        Log.i("---TAG","--------End"+formatDouble2(1.234))
        Log.i("---TAG","--------End"+formatDouble2(1.245))
        Log.i("---TAG","--------End"+formatDouble2(1.256))
        //获取ViewModel
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        //对加载状态进行动态观察
        viewModel.loadState.observe(this, Observer {
            when (it) {
                is LoadState.Success -> button.isEnabled = true
                is LoadState.Fail -> {
                    button.isEnabled = true
                    Toast.makeText(this, it.msg, Toast.LENGTH_SHORT).show()
                }
                is LoadState.Loading -> {
                    button.isEnabled = false
                }
            }
        })

        //对图片Url数据进行观察
        viewModel.imageData.observe(this, Observer {
            //用Glide加载三张图片
            Glide.with(this)
                    .load(it[0])
                    .into(imageView1)
            Glide.with(this)
                    .load(it[1])
                    .into(imageView2)
            Glide.with(this)
                    .load(it[2])
                    .into(imageView3)
        })

        //点击刷新按钮来网络加载
        button.setOnClickListener {
            viewModel.getData()
            Log.i("---TAG","--------End")
        }
    }
    fun formatDouble2(double: Double):Double{
        var bg = BigDecimal(double).setScale(2,RoundingMode.HALF_UP)
        return bg.toDouble();
    }
}
