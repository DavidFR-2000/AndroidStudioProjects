package com.example.postales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

     lateinit var but: Button
     lateinit var edt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         but = findViewById(R.id.button1)
         edt = findViewById(R.id.editText1)

        but.setOnClickListener {
            val intent = Intent(this@MainActivity, postales::class.java)
            val bundle = Bundle()
            bundle.putString("SALUDO", edt.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}