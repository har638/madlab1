package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnIntentDemo).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        findViewById<Button>(R.id.btnQuestion2).setOnClickListener {
            startActivity(Intent(this, Question2Activity::class.java))
        }
        findViewById<Button>(R.id.btnSettings).setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
        findViewById<Button>(R.id.btnCounter).setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
        findViewById<Button>(R.id.btnForm).setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }
    }
}
