package br.edu.fatecpg.ex1listafilmes

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.ex1listafilmes.adapter.FilmeAdapter
import br.edu.fatecpg.ex1listafilmes.dao.FilmeDao

class ListaFilmesActivity : AppCompatActivity(R.layout.activity_lista_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = FilmeDao()
        val filmes = dao.get_filmes()
        Log.i("Filmes", filmes.toString())
        val rv_filmes = findViewById<RecyclerView>(R.id.rv_filmes)
        rv_filmes.layoutManager = LinearLayoutManager(this)
        rv_filmes.adapter = FilmeAdapter(filmes)
    }
}