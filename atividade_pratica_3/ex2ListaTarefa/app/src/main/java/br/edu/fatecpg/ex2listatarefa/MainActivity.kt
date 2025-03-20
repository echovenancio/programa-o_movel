package br.edu.fatecpg.ex2listatarefa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex2listatarefa.dao.TarefaDao
import br.edu.fatecpg.ex2listatarefa.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = TarefaDao()
        val edt_nome = findViewById<EditText>(R.id.edt_nome_tarefa)
        val edt_categoria = findViewById<EditText>(R.id.edt_descricao_tarefa)
        val edt_prazo = findViewById<EditText>(R.id.edt_prazo_tarefa)
        val btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val fab_lista = findViewById<FloatingActionButton>(R.id.fab_lista_tarefas)
        btn_cadastrar.setOnClickListener {
            val tarefa = Tarefa(
                edt_nome.text.toString(),
                edt_categoria.text.toString(),
                edt_prazo.text.toString(),
            )
            dao.add_tarefa(tarefa)
            edt_nome.text.clear()
            edt_categoria.text.clear()
            edt_prazo.text.clear()
        }
        fab_lista.setOnClickListener {
            val intent = Intent(this, ListaTarefasActivity::class.java)
            startActivity(intent)
        }
    }
}