package com.example.prueba_graficas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class PieCharActivity : AppCompatActivity() {

    lateinit var pieChart: PieChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_char)


        pieChart=findViewById(R.id.pie_chart)

        val list:ArrayList<PieEntry> = ArrayList()


        list.add(PieEntry(100f,100f))
        list.add(PieEntry(101f,101f))
        list.add(PieEntry(102f,102f))
        list.add(PieEntry(103f,103f))
        list.add(PieEntry(104f,104f))


        val pieDataSet=PieDataSet(list, "List")

        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)

        pieDataSet.valueTextSize=15f

        pieDataSet.valueTextColor= Color.BLACK

        val pieData= PieData(pieDataSet)

        pieChart.data= pieData

        pieChart.description.text="Pie Chart"

        pieChart.centerText= "List"

        pieChart.animateY(2000)
    }
}