package br.edu.fatecpg.ex2listatarefa.dao

import br.edu.fatecpg.ex2listatarefa.model.Tarefa

class TarefaDao {
    companion object {
        val tarefas = mutableListOf<Tarefa>()
    }

    fun add_tarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }

    fun get_tarefas(): List<Tarefa> {
        return tarefas
    }
}