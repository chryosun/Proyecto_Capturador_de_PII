package com.example.ejercicio2p

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class participantes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participantes)

        val btnRegresar = findViewById<Button>(R.id.btnReg)

        btnRegresar .setOnClickListener{
            finish()
        }
    }
}