package br.senai.sp.jandira.imc_app_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class activity_resultado_ncd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        val textViewNcd: TextView = findViewById(R.id.text_view_resultado_ncd)
        val textViewsexo: TextView = findViewById(R.id.sexo)

        val peso = intent.getDoubleExtra("pesoNcd", 3.9)
        val idade = intent.getIntExtra("idade", 0)
        val sexo = intent.getCharExtra("sexo", '?')
        val grauAtividade = intent.getCharExtra("grauAtividade", '?')

        textViewNcd.text = peso.toString();
        textViewsexo.text = grauAtividade.toString();

    }
}