package br.edu.fatecpg.ex2cadastroaluno

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex2cadastroaluno.dao.AlunoDao

class AlunoActivity : AppCompatActivity(R.layout.activity_aluno) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = AlunoDao()
        val aluno = dao.get_alunos().last()
        val txv_nome = findViewById<TextView>(R.id.txv_nome)
        val txv_matricula = findViewById<TextView>(R.id.txv_matricula)
        txv_nome.text = aluno.nome
        txv_matricula.text = aluno.matricula.toString()
    }
}