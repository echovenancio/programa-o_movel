package br.edu.fatecpg.ex1cadastrolivro.dao

import br.edu.fatecpg.ex1cadastrolivro.model.Livro

class LivroDAO {
    companion object {
        val livros = mutableListOf<Livro>()
    }

    fun addLivro(livro: Livro) {
        livros.add(livro)
    }

    fun getLivro(index: Int): Livro {
        return livros[index]
    }

    fun getLivros(): MutableList<Livro> {
        return livros
    }
}