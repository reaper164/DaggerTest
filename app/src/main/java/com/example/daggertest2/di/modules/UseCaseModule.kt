package com.example.daggertest2.di.modules

import com.example.daggertest2.di.AppScope
import com.example.daggertest2.first_layer.SampleUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @AppScope
    @Provides
    fun provideSampleUseCase() : SampleUseCase = SampleUseCase()
}