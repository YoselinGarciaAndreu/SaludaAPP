package com.pmdm.saludaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import kotlin.math.log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        val etName:AppCompatEditText = findViewById(R.id.etName)
        btnHello.setOnClickListener(){
            //Log.i("Test","pulsado")
            val name = etName.text.toString()
            Toast.makeText(this, "Hola $name!", Toast.LENGTH_LONG).show()
        }
        }
    }
