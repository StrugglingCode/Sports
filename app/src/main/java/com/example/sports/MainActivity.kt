package com.example.sports

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var sportAdapter = SportAdapter(this@MainActivity )
 grid_view.adapter = sportAdapter
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
