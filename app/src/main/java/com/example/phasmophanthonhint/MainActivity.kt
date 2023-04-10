package com.example.phasmophanthonhint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnSpanish = findViewById<AppCompatButton>(R.id.Spanish)
        BtnSpanish.setOnClickListener {
            val intento = Intent(this, SpanishActivity::class.java)
            startActivity(intento)
        }

        val BtnEnglish = findViewById<AppCompatButton>(R.id.English)
        BtnEnglish.setOnClickListener {
            val intent = Intent(this, EnglishActivity::class.java)
            startActivity(intent)
        }

    }
}