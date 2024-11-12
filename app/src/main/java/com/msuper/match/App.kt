package com.msuper.match

import android.app.Application
import android.content.Context
import com.msuper.match.ui.di.components.AppComponent
import com.msuper.match.ui.di.components.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

val Context.app : App
    get() = applicationContext as App