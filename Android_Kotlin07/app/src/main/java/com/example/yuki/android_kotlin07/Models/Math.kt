package com.example.yuki.android_kotlin07.Models

import android.util.Log
import com.example.yuki.android_kotlin07.Activities.MainActivity

class Math: Result by MainActivity() {

    fun calculate(a: Int, b: Int) {
        result(a + b)
    }
}