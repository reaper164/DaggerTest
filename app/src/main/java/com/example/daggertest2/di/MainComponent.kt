package com.example.daggertest2.di

import com.example.daggertest2.MainActivity
import com.example.daggertest2.di.modules.MainModule
import com.example.daggertest2.second_layer.MainPresenter
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {
    fun getMainPresenter() : MainPresenter

    /*@Subcomponent.Builder
    interface Builder{
        @BindsInstance fun activity(mainActivity: MainActivity) : Builder
        fun build() : MainComponent
    }*/

    @Subcomponent.Factory
    interface MainComponentFactory{
        fun create(@BindsInstance mainActivity: MainActivity) : MainComponent
    }
}