package com.example.ejercicio2p

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    private var nombre: String? = ""
    private var correo: String? = ""
    private var apellido: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val boton = findViewById<ImageButton>(R.id.btnRegresar)
        val nombreR = findViewById<TextView>(R.id.txtNombre_2)
        val apellidoR =findViewById<TextView>(R.id.tmpApellido)
        val emailR = findViewById<TextView>(R.id.tmpCorreo)

        intent.extras?.let { datosNombre ->
            nombre = datosNombre.getString("nombre")
            apellido = datosNombre.getString("apellido")
            correo = datosNombre.getString("correo")
        }
        nombreR.text = "Nombre: $nombre"
        apellidoR.text = "Apellido: $apellido"
        emailR.text = "Correo: $correo"
        boton.setOnClickListener {
            finish()
        }
    }
}