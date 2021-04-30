package com.example.imc_app

fun calcularIMC(peso: Double, altura:Double) = peso / (altura * altura)

fun obterStatus(imc: Double) : String {
    if (imc > 18.5){
        return "Abaixo do Peso"
    } else if (imc > 18.5 && imc <= 25){
        return "Peso ideal"
    }else if (imc > 25 && imc <= 30){
        return "Obesidade Grau I"
    }else if (imc > 35 && imc <= 40){
        return "Obesidade Grau II"
    }else{
        return "Obesidade Grau III"
    }

}