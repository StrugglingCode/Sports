package com.example.sports

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sport_details.*

class SportDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_details)

        val recieveData = intent.extras
         val sportImage = recieveData.getInt("image")
        val sportDetails = recieveData.getString("details")

        imageView3.setImageResource(sportImage)
        textView2.text = sportDetails
    }
}
