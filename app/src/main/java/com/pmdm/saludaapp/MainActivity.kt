package com.pmdm.saludaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar
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
            //Toast.makeText(this, "Hola $name!", Toast.LENGTH_LONG).show()
            if (name.isNotEmpty()) {
                Snackbar.make(btnHello, "Hola $name!", Snackbar.LENGTH_LONG)
                    .setAnchorView(btnHello)
                    .setAction("NEXT") {
                        val intentGA = Intent(this, GreetingActivity::class.java)
                        intentGA.putExtra("EXTRA_NAME", name)
                        startActivity(intentGA)
                    }
                        .show()
            }else {
                Toast.makeText(this, "Introduce tu nombre", Toast.LENGTH_LONG).show()

            }
        }
        }
    }
