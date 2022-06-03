package com.example.daggertest2.di.modules

import com.example.daggertest2.first_layer.Utils
import com.example.daggertest2.second_layer.UtilsManager
import dagger.Module
import dagger.Provides

@Module
class UtilsModule(private val utils: Utils) {

    @Provides
    fun provideUtilsManager() : UtilsManager = UtilsManager(utils)
}