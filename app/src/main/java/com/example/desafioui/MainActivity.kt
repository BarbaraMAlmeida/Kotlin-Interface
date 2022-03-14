package com.example.desafioui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartButton = findViewById<Button>(R.id.get_started_btn);

        getStartButton.setOnClickListener {
            val intent = Intent(this, Home::class.java);
            startActivity(intent);
        }

    }
}