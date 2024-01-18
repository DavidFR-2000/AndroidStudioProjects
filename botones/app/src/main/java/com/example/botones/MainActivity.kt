package com.example.botones

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var entrada: EditText
    private lateinit var salida: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show()
        entrada = findViewById(R.id.entrada);
        salida = findViewById(R.id.salida);
    }
    fun sePulsa0(view: View){
        entrada?.setText(entrada?.getText().toString() + view?.tag as String)
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show()
    }

    fun sePulsa(view: View){
        salida?.setText((java.lang.Float.parseFloat(
            entrada?.getText().toString()) * 2.0).toString())
    }
}