package com.example.daggertest2.first_layer

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class NetworkManager @Inject constructor(@Named("prod") val connectionManager: ConnectionManager) {

    // Вызывается только если объект создается через @Inject constructor()
    @Inject
    fun postInit(repository: Repository){
        Log.e("NetworkManager", "PostInit, repository: ${repository.TAG}")
    }
}