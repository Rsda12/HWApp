package com.example.hwapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EnglishQuestionsActivity : AppCompatActivity() {

    private val questions = listOf(
        "What is the past tense of 'go'?",
        "What is the comparative form of 'good'?",
        "What is a synonym for 'happy'?"
    )

    private val answers = listOf(
        "went",
        "better",
        "joyful"
    )

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_questions)

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
        val correctAnswer = answers[currentQuestionIndex]
        if (answer == correctAnswer) {
            resultTextView.text = "Correct!"
        } else {
            resultTextView.text = "Incorrect. The correct answer is$correctAnswer."
        }
    }
}