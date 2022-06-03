package com.example.daggertest2.second_layer

import dagger.assisted.AssistedFactory

@AssistedFactory
interface ServerApiFactory {
    fun create(host : String) : ServerApi
}