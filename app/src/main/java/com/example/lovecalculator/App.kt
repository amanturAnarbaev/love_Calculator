package com.example.lovecalculator

import android.app.Application
import androidx.room.Room

class App : Application() {
    companion object {
       lateinit var api:CalculatorApi
       lateinit var appDataBase: AppDataBase
    }

    override fun onCreate() {
        super.onCreate()
        val retrofit =RetrofitService()
        api= retrofit.getApi()

        appDataBase= Room.databaseBuilder(applicationContext ,AppDataBase::class.java,
        "history").allowMainThreadQueries().build()
    }
}