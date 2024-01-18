package com.example.postales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class postales : AppCompatActivity() {

    private lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postales)
        text = findViewById(R.id.textView1)
        var bundle: Bundle = intent.extras!!
        text.setText(bundle.getString("SALUDO"))
    }
}