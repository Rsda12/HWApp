package com.example.hwapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hwapp.ui.theme.HWAppTheme

class OtherQuestionsActivity : AppCompatActivity() {

    private val questions = listOf(
        "What is the capital of France?",
        "What is the highest mountain in the world?",
        "What is the largest animal in the world?"
    )

    private val answers = listOf(
        "Paris",
        "Mount Everest",
        "Blue Whale"
    )

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_questions)

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
        if (answer.equals(correctAnswer, ignoreCase = true)) {
            resultTextView.text = "Correct!"
        } else {
            resultTextView.text = "Incorrect. The correct answer is $correctAnswer."
        }
    }
}