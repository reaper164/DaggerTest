package com.example.daggertest2.di.modules

import android.content.Context
import com.example.daggertest2.MainActivity
import com.example.daggertest2.first_layer.DatabaseHelper
import com.example.daggertest2.first_layer.NetworkUtils
import com.example.daggertest2.second_layer.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun provideMainPresenter(databaseHelper: DatabaseHelper,
    networkUtils: NetworkUtils, context : Context, mainActivity: MainActivity) : MainPresenter = MainPresenter(
        databaseHelper,
        networkUtils,
        context,
        mainActivity
    )
}