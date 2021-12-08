package com.example.funnyweathergenerator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CreatorAdapter(private val creatorNames: List<String>) :
    RecyclerView.Adapter<CreatorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreatorViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.creator_list_item, parent, false)
        return CreatorViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CreatorViewHolder, position: Int) {
        val name = creatorNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return creatorNames.size
    }

}