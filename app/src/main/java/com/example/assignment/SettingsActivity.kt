package com.example.assignment

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val settings = arrayOf(
            "Wi-Fi",
            "Bluetooth",
            "Display",
            "Sound",
            "Notifications",
            "Privacy",
            "Battery",
            "About phone"
        )

        val listView = findViewById<ListView>(R.id.listSettings)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            settings
        )
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, settings[position], Toast.LENGTH_SHORT).show()
        }
    }
}
