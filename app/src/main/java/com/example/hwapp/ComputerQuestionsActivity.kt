package com.example.hwapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hwapp.ui.theme.HWAppTheme

class ComputerQuestionsActivity : AppCompatActivity() {

    private val questions = listOf(
        "What does HTML stand for?",
        "What is the difference between Java and JavaScript?",
        "What is a loop in programming?"
    )

    private val answers = listOf(
        "Hypertext Markup Language",
        "Java is an object-oriented programming language, while JavaScript is a scripting language",
        "A loop is a programming structure that repeats a sequence of instructions until a specific condition is met"
    )

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer_questions)

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


    }

    private fun checkAnswer(answer: String) {
        val resultTextView = findViewById<TextView>(R.id.result_text_view)
        val correctAnswer = answers[currentQuestionIndex]
        if (answer == correctAnswer) {
            resultTextView.text = "Correct!"
        } else {
            resultTextView.text = "Incorrect. The correct answer is $correctAnswer."
        }
    }
}