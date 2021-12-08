package com.example.funnyweathergenerator

import android.view.View
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class CreatorViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    private val creatorNameTextView: TextView = itemView.findViewById(R.id.creator_name_text_view)

    fun bind(name: String) {
        creatorNameTextView.text = name
    }

}