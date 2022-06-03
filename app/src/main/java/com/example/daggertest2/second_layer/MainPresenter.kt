package com.example.daggertest2.second_layer

import android.content.Context
import com.example.daggertest2.MainActivity
import com.example.daggertest2.first_layer.DatabaseHelper
import com.example.daggertest2.first_layer.NetworkUtils
import javax.inject.Inject

class MainPresenter(
    val databaseHelper : DatabaseHelper,
    val networkUtils: NetworkUtils,
    val context: Context,
    val mainActivity: MainActivity
) {


}