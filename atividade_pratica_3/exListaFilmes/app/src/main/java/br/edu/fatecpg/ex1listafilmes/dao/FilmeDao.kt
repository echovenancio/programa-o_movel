package br.edu.fatecpg.ex1listafilmes.dao

import br.edu.fatecpg.ex1listafilmes.model.Filme

class FilmeDao {
    companion object {
        val filmes = mutableListOf<Filme>()
    }

    fun add_filme(filme: Filme) {
        filmes.add(filme)
    }

    fun get_filmes(): List<Filme> {
        return filmes
    }
}