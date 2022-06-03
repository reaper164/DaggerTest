package com.example.daggertest2

import android.content.SharedPreferences
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggertest2.second_layer.SecondPresenter
import com.example.daggertest2.second_layer.UtilsManager
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences : SharedPreferences
    @Inject
    lateinit var appResources: Resources
    @Inject
    lateinit var utilsManager : UtilsManager
    @Inject
    lateinit var secondPresenter: SecondPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val appComponent = (application as BaseApplication).appComponent
        appComponent.injectSecondActivity(this)

        Log.e("SecondActivity", "secondPresenter ServerApi host: ${secondPresenter.serverApi.host}")

    }
}