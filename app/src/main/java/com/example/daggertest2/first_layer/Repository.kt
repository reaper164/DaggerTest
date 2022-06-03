package com.example.daggertest2.first_layer

import android.util.Log
import javax.inject.Inject

class Repository @Inject constructor() {
    val TAG = this::class.java.simpleName

    @Inject
    fun postInit(){
        Log.e("Repository", "postInit()")
    }
}