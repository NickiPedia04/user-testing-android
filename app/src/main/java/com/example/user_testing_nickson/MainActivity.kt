package com.example.user_testing_nickson

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dontHaveAccountTextView: TextView = findViewById(R.id.dontHaveAccountTV)

        val usernameET: EditText = findViewById(R.id.usernameET)
        val passwordET: EditText = findViewById(R.id.passwordET)
        val logInBtn: Button = findViewById(R.id.logInBtn)

        logInBtn.setOnClickListener {
            val username = usernameET.text.toString()
            val password = passwordET.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "All fields are filled!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        dontHaveAccountTextView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}