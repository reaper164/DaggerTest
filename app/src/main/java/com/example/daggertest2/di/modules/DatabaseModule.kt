package com.example.daggertest2.di.modules

import com.example.daggertest2.first_layer.DatabaseHelper
import com.example.daggertest2.first_layer.Repository
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {
    /*@Provides
    fun provideRepository() : Repository = Repository()*/

    /*@Provides
    fun provideDatabaseHelper(repository: Repository) : DatabaseHelper = DatabaseHelper(repository)*/
}