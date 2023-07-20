package com.example.hwapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mathButton = findViewById<Button>(R.id.math_button)
        val englishButton = findViewById<Button>(R.id.english_button)
        val computerButton = findViewById<Button>(R.id.computer_button)
        val otherButton = findViewById<Button>(R.id.other_button)

        mathButton.setOnClickListener {
            val mathIntent = Intent(this, MathQuestionsActivity::class.java)
            startActivity(mathIntent)
        }

        englishButton.setOnClickListener {
            val englishIntent = Intent(this, EnglishQuestionsActivity::class.java)
            startActivity(englishIntent)
        }

        computerButton.setOnClickListener {
            val computerIntent = Intent(this, ComputerQuestionsActivity::class.java)
            startActivity(computerIntent)
        }

        otherButton.setOnClickListener {
            val otherIntent = Intent(this, OtherQuestionsActivity::class.java)
            startActivity(otherIntent)
        }
    }
}