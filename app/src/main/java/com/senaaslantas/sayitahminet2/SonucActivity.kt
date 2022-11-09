package com.senaaslantas.sayitahminet2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sonuc.*

class SonucActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)
        val sonuc=intent.getBooleanExtra("sonuc",false)
        if(sonuc){
            Sonuc.text="KAZANDINIZ"
            imageView2.setImageResource(R.drawable.mutlu_resim)

        }else{

            Sonuc.text="KAYBETTİNİZ"
            imageView2.setImageResource(R.drawable.uzgun_resim)

        }
        sonucButton.setOnClickListener{
            val intent=Intent(this@SonucActivity,TahminActivity::class.java)
            finish()
            startActivity(intent)

        }
    }
}