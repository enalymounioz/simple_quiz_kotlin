package com.elenivoreos.simplequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val textViewName : TextView = findViewById(R.id.textViewName)
        val textViewScore : TextView =findViewById(R.id.textViewScore)
        val buttonFinish : Button = findViewById(R.id.buttonFinish)

        textViewName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        textViewScore.text = "Your Score is $correctAnswers out of $totalQuestions"
        buttonFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java)) }





    }
}