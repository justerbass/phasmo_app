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

        val BtnDemon = findViewById<AppCompatButton>(R.id.Demonios)
        BtnDemon.setOnClickListener {
            val demon = Intent( this, Demon_ENG_Activity::class.java)
            startActivity(demon)}

        val BtnYurei = findViewById<AppCompatButton>(R.id.Yureis)
        BtnYurei.setOnClickListener {
            val yurei = Intent( this, Yurei_ENG_Activity::class.java)
            startActivity(yurei)}

        val BtnOni = findViewById<AppCompatButton>(R.id.Onis)
        BtnOni.setOnClickListener {
            val oni = Intent( this, Oni_ENG_Activity::class.java)
            startActivity(oni)}

        val BtnYokai = findViewById<AppCompatButton>(R.id.Yokais)
        BtnYokai.setOnClickListener {
            val yokai = Intent( this, Yokai_ENG_Activity::class.java)
            startActivity(yokai)}

        val BtnHantu = findViewById<AppCompatButton>(R.id.Hantus)
        BtnHantu.setOnClickListener {
            val hantu = Intent( this, Hantu_ENG_Activity::class.java)
            startActivity(hantu)}

        val BtnGoryo = findViewById<AppCompatButton>(R.id.Goryos)
        BtnGoryo.setOnClickListener {
            val goryo = Intent( this, Goryo_ENG_Activity::class.java)
            startActivity(goryo)}

        val BtnMyling = findViewById<AppCompatButton>(R.id.Mylings)
        BtnMyling.setOnClickListener {
            val myling = Intent( this, Myling_ENG_Activity::class.java)
            startActivity(myling)}
    }
}