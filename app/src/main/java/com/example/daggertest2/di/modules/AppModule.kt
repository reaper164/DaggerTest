package com.example.daggertest2.di.modules

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import com.example.daggertest2.di.MainComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainComponent::class])
class AppModule() { //private val context: Context
    @Provides
    fun getPreferences(context : Context) : SharedPreferences = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

    @Provides
    fun getResources(context: Context) : Resources = context.resources

   /* @Provides
    fun provideContest() : Context = context*/
}