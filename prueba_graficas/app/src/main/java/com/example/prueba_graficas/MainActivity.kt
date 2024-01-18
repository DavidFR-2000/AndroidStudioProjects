package com.example.prueba_graficas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var goBarChar: Button
    lateinit var goPieChart:Button
    lateinit var goRadarChart:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goBarChar = findViewById(R.id.go_bar_chart)
        goPieChart= findViewById(R.id.go_pie_chart)
        goRadarChart= findViewById(R.id.go_radar_chart)


        goBarChar.setOnClickListener(){
            startActivity(Intent(this, BarCharActivity::class.java))
        }
        goPieChart.setOnClickListener(){
            startActivity(Intent(this, PieCharActivity::class.java))
        }
        goRadarChart.setOnClickListener(){
            startActivity(Intent(this, RadarChartActivity::class.java))
        }
    }
}