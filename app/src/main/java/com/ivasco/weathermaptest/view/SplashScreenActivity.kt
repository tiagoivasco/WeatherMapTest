package com.ivasco.weathermaptest.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ivasco.weathermaptest.R
import com.ivasco.weathermaptest.search.SearchActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        getSupportActionBar()?.hide()

        // Iniciando as Telas de Boas Vindas:
        Handler().postDelayed({
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }, 6000)
    }
}