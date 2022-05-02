package com.example.thisorthat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        var startbutton = findViewById<Button>(R.id.startbutton)
        var howtobutton = findViewById<Button>(R.id.howtobutton)
        var optionsbutton = findViewById<Button>(R.id.optionsbutton)

        startbutton.setOnClickListener {
            val intent = Intent(this, TOTQuestionActivity::class.java)
            startActivity(intent)
        }
        howtobutton.setOnClickListener {
            val intent = Intent(this, HowToPlayActivity::class.java)
            startActivity(intent)
        }
        optionsbutton.setOnClickListener {
            val intent = Intent(this, OptionsActivity::class.java)
            startActivity(intent)
        }
    }
}