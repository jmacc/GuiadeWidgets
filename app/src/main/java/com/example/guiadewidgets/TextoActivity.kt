package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class TextoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texto)

        val btnMostrarDatosTexto = findViewById<Button>(R.id.bntMostrarDatosTexto)
        btnMostrarDatosTexto.setOnClickListener{
            var nombre = txtnombre.text.toString()
            var edad = txtEdad.text.toString()
            Toast.makeText(this,"Hola $nombre actualmente tienes $edad años", Toast.LENGTH_LONG).show()
        }
    }
}