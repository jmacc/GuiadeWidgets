package com.example.guiadewidgets

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TextoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texto)

        val btnMostrarDatosTexto = findViewById<Button>(R.id.bntMostrarDatosTexto)

        btnMostrarDatosTexto.setOnClickListener{

            //mal
          //  var nombre: String = txtNombre.text.toString()

            //opcion correcta
            val txtnombre = findViewById<EditText>(R.id.txtNombre)
            val txtedad = findViewById<EditText>(R.id.txtEdad)

            val nombre = txtnombre.getText().toString()
           val edad = txtedad.getText().toString()

            Toast.makeText(this,"Hola $nombre actualmente tienes $edad años", Toast.LENGTH_LONG).show()
        }
    }
}