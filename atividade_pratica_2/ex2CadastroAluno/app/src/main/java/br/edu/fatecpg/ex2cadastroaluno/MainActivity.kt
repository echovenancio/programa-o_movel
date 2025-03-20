package br.edu.fatecpg.ex2cadastroaluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex2cadastroaluno.dao.AlunoDao
import br.edu.fatecpg.ex2cadastroaluno.model.Aluno

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = AlunoDao()
        val edt_nome = findViewById<EditText>(R.id.edt_nome)
        val btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        btn_cadastrar.setOnClickListener {
            dao.add_aluno(edt_nome.text.toString())
            val intent = Intent(this, AlunoActivity::class.java)
            startActivity(intent)
        }
    }
}