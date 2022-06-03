package com.example.daggertest2.di

import android.content.Context
import com.example.daggertest2.MainActivity
import com.example.daggertest2.SecondActivity
import com.example.daggertest2.di.modules.*
import com.example.daggertest2.first_layer.NetworkManager
import com.example.daggertest2.first_layer.NetworkUtils
import com.example.daggertest2.first_layer.SampleUseCase
import com.example.daggertest2.first_layer.Utils
import com.example.daggertest2.second_layer.UtilsManager
import dagger.BindsInstance
import dagger.Component
import dagger.Lazy
import javax.inject.Scope

@AppScope
@Component(modules = [NetworkModule::class, UseCaseModule::class, AppModule::class, UtilsModule::class])//DatabaseModule::class,  MainModule::class,, AppModule::class
interface AppComponent {

    //fun getDatabaseHelper() : DatabaseHelper
    //fun getNetworkUtils() : NetworkUtils
    fun injectMainActivity(mainActivity: MainActivity)
    fun injectSecondActivity(secondActivity: SecondActivity)
    fun getSampleUseCase() : Lazy<SampleUseCase>
    //fun getNetworkManager() : NetworkManager
    //fun getMainComponentBuilder() : MainComponent.MainComponentFactory//Builder

    /*@Component.Builder
    interface AppCompBuilder{
        @BindsInstance
        fun context(context: Context) : AppCompBuilder
        fun setUtilsModule(utilsModule: UtilsModule) : AppCompBuilder
        fun buildAppComponent() : AppComponent
        //fun setAppModule(appModule: AppModule) : AppCompBuilder
    }*/

    @Component.Factory
    interface AppCompFactory {
        fun create(@BindsInstance context: Context, utilsModule: UtilsModule) : AppComponent
    }
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope
