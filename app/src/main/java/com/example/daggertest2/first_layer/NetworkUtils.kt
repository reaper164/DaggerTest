package com.example.daggertest2.first_layer

import javax.inject.Inject
import javax.inject.Named

class NetworkUtils @Inject constructor(@Named("dev") val connectionManager: ConnectionManager) {
}