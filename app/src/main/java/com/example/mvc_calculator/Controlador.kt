package com.example.mvc_calculator

class Controlador (private val view: IView
):IControlador {
    override fun saldoNeto(saldo: Double?, nombre: String?) {

        val deducion = (saldo!! * 0.03) + (saldo!! * 0.04) + (saldo!! * 0.05)
        val salarioNeto = saldo - deducion

        view.resultado("salario final $salarioNeto")





    }


}