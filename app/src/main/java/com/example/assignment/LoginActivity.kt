package com.example.assignment

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            Toast.makeText(this, "Login button pressed", Toast.LENGTH_SHORT).show()
        }
        // No in-app Back button is required. Android's system Back returns to MainActivity.
    }
}
