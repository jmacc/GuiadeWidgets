package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class BotonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)
    }

    fun mostrar(widget: android.view.View) {
        var mensaje = ""
        var tag = widget.tag

        when(tag){
            "saludar"->{ mensaje = "Presionaste boton normal"}
            "email"->{ mensaje = "Presionaste el image button"}
        }
        Toast.makeText(applicationContext,mensaje,Toast.LENGTH_LONG).show()
    }
}