package com.example.comunicacionactividades1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombre: EditText
        nombre = findViewById(R.id.nombre)
        val boton = findViewById(R.id.boton) as Button
        val intent = Intent(this, condiciones::class.java)

        boton.setOnClickListener{
                intent.putExtra("nombre", nombre.text)
                startActivity(intent)
            }
        }

        }

