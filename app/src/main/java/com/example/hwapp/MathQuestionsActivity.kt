package com.example.hwapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MathQuestionsActivity : AppCompatActivity() {

    private val questions = listOf(
        "What is the value of pi?",
        "What is the formula for the area of a circle?",
        "What is the Pythagorean Theorem?"
    )

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_questions)

        val questionTextView = findViewById<TextView>(R.id.question_text_view)
        val answerEditText = findViewById<EditText>(R.id.answer_edit_text)
        val submitButton = findViewById<Button>(R.id.submit_button)
        val nextButton = findViewById<Button>(R.id.next_button)

        showQuestion()

        submitButton.setOnClickListener {
            val answer = answerEditText.text.toString()
            checkAnswer(answer)
        }

        nextButton.setOnClickListener {
            showQuestion()
        }
    }

    private fun showQuestion() {
        val questionTextView = findViewById<TextView>(R.id.question_text_view)
        questionTextView.text = questions[currentQuestionIndex]
    }

    private fun checkAnswer(answer: String) {
        val resultTextView = findViewById<TextView>(R.id.result_text_view)
        val correctAnswer = getCorrectAnswer()
        if (answer == correctAnswer) {
            resultTextView.text = "Correct!"
        } else {
            resultTextView.text = "Incorrect. The correct answer is $correctAnswer."
        }
    }

    private fun getCorrectAnswer(): String {
        return when (currentQuestionIndex) {
            0 -> "3.14159"
            1 -> "πr^2"
            2 -> "a^2 + b^2 = c^2"
            else -> ""
        }
    }
}