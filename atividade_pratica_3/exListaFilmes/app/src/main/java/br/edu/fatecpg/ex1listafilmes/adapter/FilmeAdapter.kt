package br.edu.fatecpg.ex1listafilmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.ex1listafilmes.R
import br.edu.fatecpg.ex1listafilmes.model.Filme

class FilmeAdapter(private val filmes: List<Filme>):
    RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val txv_view_nome = itemView.findViewById<TextView>(R.id.txv_item_nome_filme)
            val txv_view_categoria = itemView.findViewById<TextView>(R.id.txv_categoria_filme)
            val txv_view_nota = itemView.findViewById<TextView>(R.id.txv_item_nota)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filme, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = filmes[position]
        holder.txv_view_nome.text = filme.nome
        holder.txv_view_categoria.text = filme.categoria
        holder.txv_view_nota.text = filme.nota.toString()
    }

    override fun getItemCount(): Int {
        return filmes.size
    }
}