package com.example.funnyweathergenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

private const val LAST_GENERATE_IMAGE="image"
class WeatherGenerateFragment : Fragment() {

    lateinit var weatherImageView: ImageView
    lateinit var goButton: Button

    private val weatherImageList: List<Int> = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_weather_generate, container, false)

        weatherImageView = view.findViewById(R.id.weather_image_view)
        goButton = view.findViewById(R.id.go_button)

        goButton.setOnClickListener{

            weatherImageView.setImageResource(weatherImageList.random())
        }


        return view

    }



}