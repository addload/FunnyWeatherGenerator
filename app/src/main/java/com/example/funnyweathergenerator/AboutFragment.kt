package com.example.funnyweathergenerator

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutFragment : Fragment() {

    lateinit var creatorRecyclerView: RecyclerView
    lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val creatorNames: List<String> = listOf("Dmitry Kazancev")

        showWebSiteButton=view.findViewById(R.id.show_web_site_button)

        creatorRecyclerView = view.findViewById(R.id.creator_recycler_view)
        creatorRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        creatorRecyclerView.adapter = CreatorAdapter(creatorNames)

        showWebSiteButton.setOnClickListener{
            val link= Uri.parse("https://www.gismeteo.ru")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }


}