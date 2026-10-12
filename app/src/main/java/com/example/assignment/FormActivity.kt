package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        findViewById<Button>(R.id.btnSubmitDetails).setOnClickListener {
            val name = findViewById<EditText>(R.id.edtName).text.toString().trim()
            val phone = findViewById<EditText>(R.id.edtPhone).text.toString().trim()
            val email = findViewById<EditText>(R.id.edtEmail).text.toString().trim()

            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra(DetailsActivity.EXTRA_NAME, name)
                putExtra(DetailsActivity.EXTRA_PHONE, phone)
                putExtra(DetailsActivity.EXTRA_EMAIL, email)
            }
            startActivity(intent)
        }
    }
}
