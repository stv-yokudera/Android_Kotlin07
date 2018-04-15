package com.example.yuki.android_kotlin07.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.yuki.android_kotlin07.Models.Math
import com.example.yuki.android_kotlin07.Models.Result
import com.example.yuki.android_kotlin07.R

class MainActivity : AppCompatActivity(), Result {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val math = Math()
        math.calculate(1, 2)
    }

    override fun result(resultValue: Int) {
        Log.d("MainActivity", "resultValue is ${resultValue}")
    }
}
