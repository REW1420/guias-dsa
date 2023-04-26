package com.example.mvc_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),IView {

    var vistaRespuesta: TextView? = null
    var boton: Button?=null
    var fCancular: IControlador?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val salario = findViewById<EditText>(R.id.edittxtSalario)

        val nombre = findViewById<EditText>(R.id.edittxtNombre)
        boton = findViewById(R.id.btnCalcular)

        boton = findViewById(R.id.btnCalcular)
        vistaRespuesta = findViewById(R.id.txtVista)

        fCancular = Controlador(this)

        boton?.setOnClickListener {
            (fCancular as Controlador).saldoNeto(
                salario.text.toString().toDouble(),
                nombre.text.toString()
            )
        }









    }

    override fun resultado(resultado: String?) {
        vistaRespuesta?.text=resultado
    }


}