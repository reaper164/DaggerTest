package com.example.daggertest2

import android.app.Application
import com.example.daggertest2.di.AppComponent
import com.example.daggertest2.di.DaggerAppComponent
import com.example.daggertest2.di.modules.AppModule
import com.example.daggertest2.di.modules.UtilsModule
import com.example.daggertest2.first_layer.Utils

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        /*appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()*/
       /* appComponent = DaggerAppComponent
            .builder()
            //.setAppModule(AppModule(this))
            .context(this)
            .setUtilsModule(UtilsModule(Utils()))
            .buildAppComponent()*/
        appComponent = DaggerAppComponent
            .factory()
            .create(this, UtilsModule(Utils()))
    }
}