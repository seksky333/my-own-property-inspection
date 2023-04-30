package xyz.seksky333.myownpropertytracker.main

import android.app.Application
import timber.log.Timber
import timber.log.Timber.Forest.plant


class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        plant(Timber.DebugTree())
    }
}