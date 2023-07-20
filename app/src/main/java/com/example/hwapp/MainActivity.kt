package com.example.hwapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mathQuestionsButton = findViewById<Button>(R.id.math_questions_button)
        mathQuestionsButton.setOnClickListener {
            startActivity(Intent(this, MathQuestionsActivity::class.java))
        }

        val englishQuestionsButton = findViewById<Button>(R.id.english_questions_button)
        englishQuestionsButton.setOnClickListener {
            startActivity(Intent(this, EnglishQuestionsActivity::class.java))
        }

        val computerQuestionsButton = findViewById<Button>(R.id.computer_questions_button)
        computerQuestionsButton.setOnClickListener {
            startActivity(Intent(this, ComputerQuestionsActivity::class.java))
        }

        val otherQuestionsButton = findViewById<Button>(R.id.other_questions_button)
        otherQuestionsButton.setOnClickListener {
            startActivity(Intent(this, OtherQuestionsActivity::class.java))
        }
    }
}