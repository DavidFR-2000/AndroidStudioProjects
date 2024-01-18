package com.example.comunicacionactividades1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class condiciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condiciones)
        val extras = intent.extras
        val nombre = extras?.getString("name")?:"Sin nombre"
        val campo = findViewById(R.id.textView2) as textView
        val nuevoCampo = campo.text.toString().replace("fulanito", nombre)
        campo.setText(nuevoCampo)
        val botonAceptar = findViewById(R.id.aceptar) as Button
        val botonRechazar = findViewById(R.id.rechazar) as Button
        botonAceptar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("resultado","Condiciones aceptadas")
            setResult(RESULT_OK, intent)
            startActivity(intent)
        }
        botonRechazar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("resultado","Condiciones rechazadas")
            setResult(RESULT_CANCELED, intent)
            startActivity(intent)
        }
    }
}
tiene menú contextual