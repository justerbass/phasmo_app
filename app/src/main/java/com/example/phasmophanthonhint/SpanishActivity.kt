package com.example.phasmophanthonhint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.phasmophanthonhint.Esp.*

class SpanishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spanish)

        val BtnEspiritu = findViewById<AppCompatButton>(R.id.Espiritu)
        BtnEspiritu.setOnClickListener {
            val espiritu = Intent(this, Espiritu_ESP_Activity::class.java)
            startActivity(espiritu)}

        val BtnPolter = findViewById<AppCompatButton>(R.id.Poltergeist)
        BtnPolter.setOnClickListener {
            val polter = Intent(this, Poletr_ESP_Activity::class.java)
            startActivity(polter)}

        val BtnPesadilla = findViewById<AppCompatButton>(R.id.Pesadilla)
        BtnPesadilla.setOnClickListener {
            val pesadilla = Intent(this, Pesadilla_ESP_Activity::class.java)
            startActivity(pesadilla)}

        val BtnDemonio = findViewById<AppCompatButton>(R.id.Demonio)
        BtnDemonio.setOnClickListener {
            val demonio = Intent(this, Demonio_ESP_Activity::class.java)
            startActivity(demonio)}

        val BtnYokai = findViewById<AppCompatButton>(R.id.Yokai)
        BtnYokai.setOnClickListener {
            val yokai = Intent(this, Yokai_ESP_Activity::class.java)
            startActivity(yokai)}

        val BtnMyling = findViewById<AppCompatButton>(R.id.Myling)
        BtnMyling.setOnClickListener {
            val myling = Intent(this, Myling_ESP_Activity::class.java)
            startActivity(myling)}

        val BtnRaiju = findViewById<AppCompatButton>(R.id.Raiju)
        BtnRaiju.setOnClickListener {
            val raiju = Intent(this, Raiju_ESP_Activity::class.java)
            startActivity(raiju)}

        val BtnMoroi = findViewById<AppCompatButton>(R.id.Moroi)
        BtnMoroi.setOnClickListener {
            val moroi = Intent(this, Moroi_ESP_Activity::class.java)
            startActivity(moroi)}

        val BtnEspectro = findViewById<AppCompatButton>(R.id.Espectro)
        BtnEspectro.setOnClickListener {
            val espectro = Intent(this, Espectro_ESP_Activity::class.java)
            startActivity(espectro)}

        val BtnBanshee = findViewById<AppCompatButton>(R.id.Banshee)
        BtnBanshee.setOnClickListener {
            val banshee = Intent(this, Banshee_ESP_Activity::class.java)
            startActivity(banshee)}

        val BtnRevenant = findViewById<AppCompatButton>(R.id.Revenant)
        BtnRevenant.setOnClickListener {
            val revenant = Intent(this, Revenant_ESP_Activity::class.java)
            startActivity(revenant)}

        val BtnYurei = findViewById<AppCompatButton>(R.id.Yurei)
        BtnYurei.setOnClickListener {
            val yurei = Intent(this, Yurei_ESP_Activity::class.java)
            startActivity(yurei)}
    }
}