package com.example.daggertest2.second_layer

import com.example.daggertest2.first_layer.NetworkUtils
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class ServerApi @AssistedInject constructor (val networkUtils: NetworkUtils, @Assisted val host : String) {
}