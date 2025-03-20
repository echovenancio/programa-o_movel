package br.edu.fatecpg.ex3imc.dao

import br.edu.fatecpg.ex3imc.model.IMC

class IMCDao {
    companion object {
        val imcs = mutableListOf<IMC>()
    }

    fun add_imc(peso: Double, altura: Double) {
        imcs.add(IMC(peso, altura))
    }

    fun get_imc(): List<IMC> {
        return imcs
    }
}