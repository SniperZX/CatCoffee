package com.wan.catcoffee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        MainScope().launch {
            delay(1000L)
            Intent().apply {
                setClass(this@SplashActivity, MainActivity::class.java)
            }.apply {
                startActivity(this)
            }
        }

    }
}