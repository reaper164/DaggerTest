package com.example.daggertest2.second_layer

import javax.inject.Inject

class SecondPresenter @Inject constructor(val serverApiFactory: ServerApiFactory) {
    lateinit var serverApi: ServerApi
    init {
        serverApi = serverApiFactory.create("dev.host.com")
    }

    private fun getApi() : ServerApi = serverApi

}