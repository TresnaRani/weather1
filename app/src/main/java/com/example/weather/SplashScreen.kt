package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class SplashScreen : AppCompatActivity() {
  lateinit var mfusedllocation:FusedLocationProviderClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

    }

   

}


