package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast

class SeleccionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)
    }

	fun validaSeleccion(view: View) {
		if(view is CheckBox){
			if (view.isChecked){
				Toast.makeText(applicationContext,"Esta realizando un checbox",Toast.LENGTH_LONG).show()
			}else{
				Toast.makeText(applicationContext,"No este seleccionado el checbox",Toast.LENGTH_LONG).show()
			}

		}else if(view is Switch){
			if(view.isChecked){
				Toast.makeText(applicationContext,"Esta realizando un Switch",Toast.LENGTH_LONG).show()
			}else{
				Toast.makeText(applicationContext,"No este seleccionado el checbox",Toast.LENGTH_LONG).show()
			}
		}
			else if(view is RadioButton){
				when(view.id){
					R.id.radio1 -> {
						Toast.makeText(applicationContext,"Esta seleccionando un Radio1",Toast.LENGTH_LONG).show()
					}
					R.id.radio2 -> {
						Toast.makeText(applicationContext,"Esta seleccionando un Radio2",Toast.LENGTH_LONG).show()
					}
				}
			}
	}
}