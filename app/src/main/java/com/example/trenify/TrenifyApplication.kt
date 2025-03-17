package com.example.trenify

import android.app.Application
import com.example.trenify.data.AppDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TrenifyApplication : Application() {
    val database by lazy { AppDatabase.createDatabase(this) }
}