package br.edu.fatecpg.ex2listatarefa

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.ex2listatarefa.adapter.TarefaAdapter
import br.edu.fatecpg.ex2listatarefa.dao.TarefaDao

class ListaTarefasActivity : AppCompatActivity(R.layout.activity_lista_tarefas) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = TarefaDao()
        val tarefas = dao.get_tarefas()
        val rv_tarefas = findViewById<RecyclerView>(R.id.rv_tarefas)
        val layout_manager = LinearLayoutManager(this)
        rv_tarefas.layoutManager = layout_manager
        rv_tarefas.adapter = TarefaAdapter(tarefas)
    }
}