package com.example.daggertest2.di.modules

import com.example.daggertest2.first_layer.ConnectionManager
import com.example.daggertest2.first_layer.NetworkUtils
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NetworkModule {
    @Named("prod")
    @Provides
    fun provideConnectionManager() : ConnectionManager = ConnectionManager("prod.server.com")

    @Named("dev")
    @Provides
    fun provideConnectionManagerDev() : ConnectionManager = ConnectionManager("dev.server.com")

    /*@Provides
    fun provideNetworkUtils(@Named("dev") connectionManager: ConnectionManager) : NetworkUtils = NetworkUtils(connectionManager)*/
}