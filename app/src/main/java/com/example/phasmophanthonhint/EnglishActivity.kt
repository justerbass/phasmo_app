package com.example.phasmophanthonhint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.phasmophanthonhint.Eng.*

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

        val BtnPhanton = findViewById<AppCompatButton>(R.id.Entes)
        BtnPhanton.setOnClickListener {
            val phanton = Intent( this, Phanton_ENG_Activity::class.java)
            startActivity(phanton)}

        val BtnPoltergeist = findViewById<AppCompatButton>(R.id.Poltergeists)
        BtnPoltergeist.setOnClickListener {
            val poltergeist = Intent( this, Poltergeist_ENG_Activity::class.java)
            startActivity(poltergeist)}

        val BtnBanshee = findViewById<AppCompatButton>(R.id.Banshees)
        BtnBanshee.setOnClickListener {
            val banshee = Intent( this, Banshee_ENG_Activity::class.java)
            startActivity(banshee)}

        val BtnJinn = findViewById<AppCompatButton>(R.id.Jims)
        BtnJinn.setOnClickListener {
            val jinn = Intent( this, Jinn_ENG_Activity::class.java)
            startActivity(jinn)}

        val BtnMare = findViewById<AppCompatButton>(R.id.Pesadillas)
        BtnMare.setOnClickListener {
            val mare = Intent( this, Mare_ENG_Activity::class.java)
            startActivity(mare)}

        val BtnRevenant = findViewById<AppCompatButton>(R.id.Revenants)
        BtnRevenant.setOnClickListener {
            val revenant = Intent( this, Revenant_ENG_Activity::class.java)
            startActivity(revenant)}

        val BtnShade = findViewById<AppCompatButton>(R.id.Sombras)
        BtnShade.setOnClickListener {
            val shade = Intent( this, Shade_ENG_Activity::class.java)
            startActivity(shade)}
    }
}