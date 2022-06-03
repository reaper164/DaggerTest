package com.example.daggertest2

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.daggertest2.di.MainComponent
import com.example.daggertest2.di.modules.AppModule
import com.example.daggertest2.first_layer.DatabaseHelper
import com.example.daggertest2.first_layer.NetworkManager
import com.example.daggertest2.first_layer.NetworkUtils
import com.example.daggertest2.first_layer.SampleUseCase
import com.example.daggertest2.second_layer.MainPresenter
import com.example.daggertest2.second_layer.UtilsManager
import dagger.Lazy
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    /*@Inject
    lateinit var databaseHelper: DatabaseHelper
    @Inject
    lateinit var networkUtils: NetworkUtils*/
    //@Inject
    lateinit var mainPresenter: MainPresenter
    @Inject
    lateinit var sampleUseCase: Lazy<SampleUseCase>
    @Inject
    lateinit var networkManager: NetworkManager
    @Inject
    lateinit var sharedPreferences: SharedPreferences
    @Inject
    lateinit var appResources: Resources
    @Inject
    lateinit var utilsManager : UtilsManager
    @Inject
    lateinit var mainComponentFactory : MainComponent.MainComponentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as BaseApplication).appComponent
        //databaseHelper = appComponent.getDatabaseHelper()
        //networkUtils = appComponent.getNetworkUtils()
        appComponent.injectMainActivity(this)
        sampleUseCase = appComponent.getSampleUseCase()

        //val mainComponent = appComponent.getMainComponentBuilder().activity(this).build()
        //val mainComponent = appComponent.getMainComponentBuilder().create(this)
        val mainComponent = mainComponentFactory.create(this)
        mainPresenter = mainComponent.getMainPresenter()

        val useCase = sampleUseCase.get()

        Log.e("MainActivity", "${mainPresenter.networkUtils.connectionManager.TAG}")
        Log.e("MainActivity", "${networkManager.connectionManager.TAG}")


        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            //finish()
        }

    }
}