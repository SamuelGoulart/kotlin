package com.example.imc_app

fun calcularIMC(peso: Double, altura:Double) = peso / (altura * altura)

fun obterStatus(imc: Double) : List<String> {

    var resultados = emptyList<String>()

    if (imc > 18.5){
        resultados = listOf("Abaixo do Peso", "Risco de fadiga, stress e ansiedade.")
    } else if (imc > 18.5 && imc <= 25){
        resultados = listOf("Peso Ideal", "Menor risco de doenças cardíacas e vasculares.")
    }else if (imc > 25 && imc <= 30){
        resultados = listOf("Acima do Peso", "Risco de má circulação, fadiga e varizes")}
    else if (imc > 30 && imc <= 35){
        resultados = listOf("Obesidade Grau I", "Risco de diabetes, infarto e aterosclerose")
    }else if (imc > 35 && imc <= 40){
        resultados = listOf("Obesidade Grau II", "Risco de diabetes, infarto e aterosclerose.")
    }else{
        resultados = listOf("Obesidade Grau III", "Risco de refluxo, mobilidade reduzida, escaras, diabetes, infarto e AVC.")
    }

    return  resultados
}