package com.pmdm.saludaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        btnHello.setOnClickListener(){
            Log.i("Test","pulsado")
        }

        }
    }
}