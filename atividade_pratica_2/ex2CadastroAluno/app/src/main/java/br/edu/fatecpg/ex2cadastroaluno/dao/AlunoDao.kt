package br.edu.fatecpg.ex2cadastroaluno.dao

import br.edu.fatecpg.ex2cadastroaluno.model.Aluno
import kotlin.random.Random

class AlunoDao {
    companion object {
        val alunos = mutableListOf<Aluno>()
    }

    fun add_aluno(nome: String) {
        val aluno = Aluno(nome, Random.nextInt())
        alunos.add(aluno)
    }

    fun get_alunos(): List<Aluno> {
        return alunos
    }
}