package br.senai.sp.jandira.imc_app_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.*

class NcdActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val buttonCalcular: Button = findViewById(R.id.button_calcular_ncd)
        val editTextPeso: EditText = findViewById(R.id.edit_Text_Peso_Ncd)
        val editTextIdade: EditText = findViewById(R.id.edit_Text_Idade_Ncd)
        val radioGroupSexo: RadioGroup = findViewById(R.id.radio_Group_Sexo)

        lateinit var radioButton: RadioButton


        buttonCalcular.setOnClickListener{


            if (editTextPeso.text.isEmpty()) {
                editTextPeso.error = "Você não me disse o seu peso!"
            } else if (editTextIdade.text.isEmpty()){
                editTextIdade.error = "Você não me disse a sua idade!"
            } else {

                val intent = Intent(this, activity_resultado_ncd::class.java)

                val selectedOption: Int = radioGroupSexo!!.checkedRadioButtonId
                radioButton = findViewById(selectedOption)

                intent.putExtra("pesoNcd", editTextPeso.text.toString().toDouble())
                intent.putExtra("idade", editTextIdade.text.toString().toInt())
                intent.putExtra("sexo", radioButton.text.toString())
                startActivity(intent)
            }

        }

    }
}