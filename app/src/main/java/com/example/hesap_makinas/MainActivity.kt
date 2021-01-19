package com.example.hesap_makinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var textNum1 = 0
    var textNum2 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun topla(view:View){
        var textNum2 : Int? =  num2.text.toString().toIntOrNull()
        var textNum1 : Int? =  num1.text.toString().toIntOrNull()

        if (textNum1 == null || textNum2 == null){
            textView.text = "HaTALI Deger var duzgun yaz"
        }else{
            textView.text = "Sonuc: ${textNum1!! + textNum2!!}"
        }


    }

    fun cıkar(view:View){
        var textNum2 : Int? =  num2.text.toString().toIntOrNull()
        var textNum1 : Int? =  num1.text.toString().toIntOrNull()
        if (textNum1 == null || textNum2 == null){
            textView.text = "hatalı deger var "
        }else{
            textView.text = "Sonuc: ${textNum1!! - textNum2!!}"
        }


    }

    fun bol(view:View){
        var textNum2 : Int? =  num2.text.toString().toIntOrNull()
        var textNum1 : Int? =  num1.text.toString().toIntOrNull()
        if (textNum1 == null || textNum2 == null){
            textView.text = "hatalı deger var "
        }else {
            textView.text = "Sonuc: ${textNum1!! / textNum2!!}"
        }
    }

    fun carp(view: View){
        var textNum2 : Int? =  num2.text.toString().toIntOrNull()
        var textNum1 : Int? =  num1.text.toString().toIntOrNull()
        if (textNum1 == null || textNum2 == null){
            textView.text = "Hatalı deger var"
        }else{
            textView.text = "Sonuc: ${textNum1!! * textNum2!!}"
        }


    }




}