package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        val textViewImc: TextView = findViewById(R.id.text_view_resultado_imc)
        val textViewStatus: TextView = findViewById(R.id.text_view_status)

        val peso = intent.getDoubleExtra("peso", 3.9)
        val altura = intent.getDoubleExtra("altura", 0.0)

        val  imc = calcularIMC(peso, altura)

        textViewImc.text = String.format("%.2f", imc)
        textViewStatus.text = obterStatus(imc)


    }
}