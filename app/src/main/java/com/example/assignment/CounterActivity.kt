package com.example.assignment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CounterActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val txtCount = findViewById<TextView>(R.id.txtCount)
        findViewById<Button>(R.id.btnIncrement).setOnClickListener {
            count++
            txtCount.text = count.toString()
        }
    }
}
