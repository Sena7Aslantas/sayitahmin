package com.senaaslantas.sayitahminet2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tahmin.*
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private var rasgeleSayi=0
    private var sayac=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)
        rasgeleSayi= Random.nextInt(101)
        Log.e("Rasgele Sayı",rasgeleSayi.toString())

        TahminButton.setOnClickListener{

        sayac=sayac-1
        val tahmin=editTextTextPersonName.text.toString().toInt()
        if(tahmin==rasgeleSayi){

                   val intent=Intent(this@TahminActivity,SonucActivity::class.java)
                     intent.putExtra("sonuc",true)
                    finish()
                    startActivity(intent)
            return@setOnClickListener



        }
        if(tahmin>rasgeleSayi){
            textViewYardimci.text="Azalt"
            TextViewKalan.text="Kalan Hak:$sayac"

        }
        if(tahmin<rasgeleSayi){
            textViewYardimci.text="Arttır"
            TextViewKalan.text="Kalan Hak:$sayac"


        }
        if(sayac==0) {

                val intent = Intent(this@TahminActivity, SonucActivity::class.java)
                intent.putExtra("sonuc", false)
                finish()
                startActivity(intent)


        }
            editTextTextPersonName.setText("")

        }
    }

}