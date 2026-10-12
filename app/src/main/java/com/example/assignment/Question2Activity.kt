package com.example.assignment

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Question2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        findViewById<Button>(R.id.btnYellow).setOnClickListener {
            window.decorView.setBackgroundColor(Color.YELLOW)
        }

        findViewById<Button>(R.id.btnToast).setOnClickListener {
            val enteredText = findViewById<EditText>(R.id.edtMessage).text.toString()
            Toast.makeText(this, enteredText.ifBlank { "The EditText is empty" }, Toast.LENGTH_SHORT).show()
        }
    }
}
