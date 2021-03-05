package br.senai.sp.jandira.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

        button_calcular.setOnClickListener {
            calcularIMC()

        }
    }
          fun calcularIMC(){

              var peso = edit_peso.text.toString().toDouble()
              var altura = edit_altura.text.toString().toDouble()

              var  imc = peso / (altura * altura)

              text_resultado.text = imc.toString()

              Toast.makeText(this, "Meu primeiro programa Android", Toast.LENGTH_SHORT).show()
          }
}
