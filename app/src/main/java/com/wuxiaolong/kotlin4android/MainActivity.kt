package com.wuxiaolong.kotlin4android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

//冒号表示继承
class MainActivity : AppCompatActivity() {
    //问号表示该变量可以为空
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
