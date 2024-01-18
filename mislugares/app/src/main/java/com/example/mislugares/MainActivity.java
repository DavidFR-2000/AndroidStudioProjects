package com.example.mislugares;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import  androidx.appcompat.widget.Toolbar;
import  android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }
}