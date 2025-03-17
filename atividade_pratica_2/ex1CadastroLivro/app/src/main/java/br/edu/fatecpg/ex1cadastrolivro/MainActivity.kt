package br.edu.fatecpg.ex1cadastrolivro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex1cadastrolivro.dao.LivroDAO
import br.edu.fatecpg.ex1cadastrolivro.model.Livro

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = LivroDAO()
        val edt_nome = findViewById<EditText>(R.id.edt_nome)
        val edt_desc = findViewById<EditText>(R.id.edt_desc)
        val btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        btn_cadastrar.setOnClickListener {
            val livro = Livro(edt_nome.text.toString(), edt_desc.text.toString())
            val intent = Intent(this, LivroActivity::class.java)
            setIntent(intent)
        }
    }
}