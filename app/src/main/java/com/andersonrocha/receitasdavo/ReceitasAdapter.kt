package com.andersonrocha.receitasdavo

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter

class ReceitasAdapter : Adapter<ReceitasAdapter.ReceitaViewHolder>() {

    private val listaReceitas = listOf<Receita>()

    inner class ReceitaViewHolder(itemView: View) : ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReceitaViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: ReceitaViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}