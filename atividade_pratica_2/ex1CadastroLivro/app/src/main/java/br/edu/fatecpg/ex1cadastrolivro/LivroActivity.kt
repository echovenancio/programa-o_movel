package br.edu.fatecpg.ex1cadastrolivro

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex1cadastrolivro.dao.LivroDAO

class LivroActivity : AppCompatActivity(R.layout.activity_livro) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = LivroDAO()
        val livro = dao.getLivros().last()
        val txv_nome = findViewById<TextView>(R.id.txv_nome)
        val txv_desc = findViewById<TextView>(R.id.txv_descricao)
        txv_nome.text = livro.nome
        txv_desc.text = livro.descricao
    }
}