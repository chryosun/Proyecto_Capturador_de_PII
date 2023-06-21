package com.example.ejercicio2p

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var send_button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //extraer objetos de la vista
        val nombre = findViewById<EditText>(R.id.txtNombre)
        val apellido = findViewById<EditText>(R.id.txtApellido)
        val correo = findViewById<EditText>(R.id.txtCorreo)
        send_button = findViewById<Button>(R.id.btnCapturar)

        send_button.setOnClickListener{
            val name_catch = nombre.text.toString().trim()
            val apellido_catch = apellido.text.toString().trim()
            val correo_catch = correo.text.toString().trim()

            if (name_catch.isEmpty() || apellido_catch.isEmpty() || correo_catch.isEmpty()){
                mostrar_snack_bar("No se han ingresado todos los datos")
            }else{
                show_data(name_catch,apellido_catch,correo_catch)
            }
        }
    }
    private fun show_data(valor_name: String, valor_apellido: String, valor_correo: String){
        val navegacion = Intent(this,ResultadoActivity::class.java)
        navegacion.putExtra("nombre", valor_name)
        navegacion.putExtra("apellido", valor_apellido)
        navegacion.putExtra("correo", valor_correo)
        startActivity(navegacion)
    }

    private fun mostrar_snack_bar(mensaje:String){
        Snackbar.make(send_button,mensaje,Snackbar.LENGTH_SHORT).show()
    }
}