package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Exibir nome do aplicativo
        title = "RadioGroup in Kotlin"

        // Atribuindo id de RadioGroup
        val button: Button = findViewById(R.id.submitButton)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup1)
        // Atribuindo id do botão Enviar


        // Ações a serem realizadas
        // quando o botão Enviar é clicado
        button.setOnClickListener {

             // Obtendo o id do botão de opção verificado
            // do grupo de rádio
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId

            // Atribuindo id do botão de opção marcado
            radioButton = findViewById(selectedOption)

            // Exibindo o texto do botão de opção marcado na forma de brinde
            Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()
        }
    }
}