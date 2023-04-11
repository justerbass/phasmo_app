package com.example.phasmophanthonhint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.phasmophanthonhint.Eng.Espiritu_ENG_Activity
import com.example.phasmophanthonhint.Eng.Wraith_ENG_Activity

class EnglishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english)

        val BtnSpirit = findViewById<AppCompatButton>(R.id.Espiritus)
        BtnSpirit.setOnClickListener {
            val spirit = Intent( this, Espiritu_ENG_Activity::class.java)
            startActivity(spirit)}

        val BtnWraith = findViewById<AppCompatButton>(R.id.Espectros)
        BtnWraith.setOnClickListener {
            val wraith = Intent( this, Wraith_ENG_Activity::class.java)
            startActivity(wraith)}
    }
}