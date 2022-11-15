package com.elenivoreos.simplequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart : Button = findViewById(R.id.buttonStart)
        val editTextName: EditText = findViewById(R.id.editTextName)

        buttonStart.setOnClickListener {

            //if name is empty will prompt a message to enter Name
            if (editTextName.text.isEmpty()) {
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_LONG).show()

                //if name is entered will move you to next activity
            }else {
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editTextName.text.toString())

                startActivity(intent) // action: Go from this activity to the next activity
            // without closing this one
                finish()// action: Closes this activity so back button is clicked it closes the application
            }
        }


    }
}