package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class RegistroActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_registro)

			var sexo:String=""
			val txtCorreo = findViewById<EditText>(R.id.editTexEmailAddress)
			val txtPass = findViewById<EditText>(R.id.editTextPassword)
			val btnHombre = findViewById<RadioButton>(R.id.btnH)
			val btnMujer = findViewById<RadioButton>(R.id.btnM)
			val btnBoton = findViewById<Button>(R.id.btnRegistrar)

			btnBoton.setOnClickListener {
		//verificación con if
				/*	if(btnHombre.isChecked){
				sexo = "Hombre"
			}else{
				sexo = "Mujer"
			}
*/
				//Verificación con when
		val sexo:String = when{
			btnHombre.isChecked -> "Es Hombre"
			btnMujer.isChecked -> "Es Mujer"
			else -> "No selecciono un sexo"
		}

			val correo = txtCorreo.text.toString()
			val password = txtPass.text.toString()
			var mensaje = "El correo es : $correo \n La contraseña es : $password \n El sexo es: $sexo"

			Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
		}
	}
}