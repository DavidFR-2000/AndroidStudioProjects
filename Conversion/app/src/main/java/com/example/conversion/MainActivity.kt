package com.example.conversion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var monedas: ArrayList<String>
    private lateinit var spinner: Spinner
    private lateinit var convertButton: Button
    private lateinit var eurosAmountEditText: EditText
    private lateinit var resultTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById<View>(R.id.spinner) as Spinner
        convertButton = findViewById<View>(R.id.convertButton) as Button
        eurosAmountEditText = findViewById<View>(R.id.eurosAmountEditText) as EditText
        resultTextView = findViewById<View>(R.id.resultTextView) as TextView



        monedas = ArrayList()
        monedas!!.add("Dólar")
        monedas!!.add("Yen")
        monedas!!.add("Yuan")

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, monedas)

        spinner.adapter=adapter

        convertButton.setOnClickListener {
            val selectedCurrency = spinner.selectedItem.toString()
            val eurosAmountStr = eurosAmountEditText.text.toString()
            if (eurosAmountStr.isNotEmpty()) {
                val eurosAmount = eurosAmountStr.toDouble()
                val convertedAmount = convertEurosToOtherCurrency(eurosAmount, selectedCurrency)
                resultTextView.text = "Convertido: $convertedAmount $selectedCurrency"
            } else {
                Toast.makeText(this, "Por favor, ingrese una cantidad en euros", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun convertEurosToOtherCurrency(euros: Double, currency: String): Double {
        // Aquí puedes implementar la lógica de conversión real
        // Por ahora, simplemente asumimos una conversión fija para demostración
        return when (currency) {
            "Dólar" -> euros * 1.15
            "Yen" -> euros * 130.0
            "Yuan" -> euros * 7.8
            else -> euros
        }
    }
}