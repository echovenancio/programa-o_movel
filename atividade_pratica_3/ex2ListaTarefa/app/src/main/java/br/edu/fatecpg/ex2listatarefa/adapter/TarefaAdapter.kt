package br.edu.fatecpg.ex2listatarefa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.ex2listatarefa.R
import br.edu.fatecpg.ex2listatarefa.model.Tarefa

class TarefaAdapter(private val tarefas: List<Tarefa>):
    RecyclerView.Adapter<TarefaAdapter.ViewHolder>() {
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val txv_item_nome = itemView.findViewById<TextView>(R.id.txv_item_nome)
            val txv_item_descricao = itemView.findViewById<TextView>(R.id.txv_item_descricao)
            val txv_item_prazo = itemView.findViewById<TextView>(R.id.txv_item_prazo)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarefa, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tarefa = tarefas[position]
        holder.txv_item_nome.text = tarefa.nome
        holder.txv_item_descricao.text = tarefa.descricao
        holder.txv_item_prazo.text = tarefa.prazo
    }
}