package com.example.myapplication

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var ss:SwordMan

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind: ActivityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main);
        ss= SwordMan("test","哈哈")
        bind.swordman=ss

    }
}
