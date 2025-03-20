package br.edu.fatecpg.ex1listafilmes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex1listafilmes.dao.FilmeDao
import br.edu.fatecpg.ex1listafilmes.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val edt_nome = findViewById<EditText>(R.id.edt_nome)
        val edt_categoria = findViewById<EditText>(R.id.edt_categoria)
        val edt_nota = findViewById<EditText>(R.id.edt_nota)
        val fab_lista = findViewById<FloatingActionButton>(R.id.fab_lista)
        val btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val dao = FilmeDao()
        btn_cadastrar.setOnClickListener {
            val filme = Filme(
                edt_nome.text.toString(),
                edt_categoria.text.toString(),
                edt_nota.text.toString().toDouble()
            )
            dao.add_filme(filme)
            edt_nome.text.clear()
            edt_categoria.text.clear()
            edt_nota.text.clear()
        }
        fab_lista.setOnClickListener {
            val intent = Intent(this, ListaFilmesActivity::class.java)
            startActivity(intent)
        }
    }
}