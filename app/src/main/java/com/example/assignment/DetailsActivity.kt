package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "com.example.assignment.EXTRA_NAME"
        const val EXTRA_PHONE = "com.example.assignment.EXTRA_PHONE"
        const val EXTRA_EMAIL = "com.example.assignment.EXTRA_EMAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val name = intent.getStringExtra(EXTRA_NAME).orEmpty()
        val phone = intent.getStringExtra(EXTRA_PHONE).orEmpty()
        val email = intent.getStringExtra(EXTRA_EMAIL).orEmpty()

        findViewById<TextView>(R.id.txtDetails).text =
            "Name: $name\nPhone: $phone\nE-mail: $email"

        findViewById<Button>(R.id.btnEditDetails).setOnClickListener {
            finish() // Return to the form activity.
        }

        findViewById<Button>(R.id.btnDetailsHome).setOnClickListener {
            val homeIntent = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            startActivity(homeIntent)
            finish()
        }
    }
}
