package com.example.guiadewidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import android.widget.Button
//import android.widget.Toast
//import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   /*     //Primer ejemplo
        // obtenemos la referencia al boton
        val btnTexto = findViewById<Button>(R.id.btnTexto)
        // establecemos el listener
        btnTexto.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
*/
        /*
        //Segundo Ejemplo
       val btnTexto = findViewById<Button>(R.id.btnTexto)
        btnTexto.setOnClickListener{ Toast.makeText(this@MainActivity, "presionaste Texto",Toast.LENGTH_SHORT).show()}

        val btnBotones = findViewById<Button>(R.id.btnBotones)
        btnBotones.setOnClickListener{ Toast.makeText(this@MainActivity, "presionaste el boton de Botones", Toast.LENGTH_SHORT).show()}

        val btnSeleccion = findViewById<Button>(R.id.btnSeleccion)
        btnSeleccion.setOnClickListener { Toast.makeText(this@MainActivity,"Presionaste Seleccion",Toast.LENGTH_SHORT).show() }
    //----------------------------------------------------------------------------------------------------------------------
*/
// Tercer Ejemplo
    val btnTexto = findViewById<Button>(R.id.btnTexto)
        //Enviamos los datos a traves del Log
       // btnTexto.setOnClickListener { Log.d("Mensaje","Presionaste Texto") }

        //para cambiar de ventana al hacer click
        btnTexto.setOnClickListener {
            var intent = Intent(applicationContext,TextoActivity::class.java)
        startActivity(intent)
        }
//-----------------------------------------------------------------------------------------
        val btnSeleccion = findViewById<Button>(R.id.btnSeleccion)
       // btnSeleccion.setOnClickListener { Log.d("MainActivity", "Presionaste Seleccion")}
        //para cambiar de ventana al hacer click
        btnSeleccion.setOnClickListener {
            var intent = Intent(applicationContext, SeleccionActivity::class.java)
            startActivity(intent)
        }
//-----------------------------------------------------------------------------------------
        val btnBotones = findViewById<Button>(R.id.btnRegistro)
       // btnBotones.setOnClickListener { Log.d("Mensaje","Presionaste Botones") }
        //para cambiar de ventana al hacer click
        btnBotones.setOnClickListener {
            var intent = Intent(applicationContext,RegistroActivity::class.java)
            startActivity(intent)
        }
    }

}



