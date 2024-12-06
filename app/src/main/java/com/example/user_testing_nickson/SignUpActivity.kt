package com.example.user_testing_nickson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val haveAccountTV: TextView = findViewById<TextView>(R.id.haveAccountTV)

        val usernameET: EditText = findViewById(R.id.usernameET)
        val passwordET: EditText = findViewById(R.id.passwordET)
        val emailET: EditText = findViewById(R.id.emailET)
        val logInBtn: Button = findViewById(R.id.logInBtn)

        logInBtn.setOnClickListener {
            val username = usernameET.text.toString()
            val password = passwordET.text.toString()
            val email = emailET.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty() && email.isNotEmpty()) {
                Toast.makeText(this, "All fields are filled!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        haveAccountTV.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}