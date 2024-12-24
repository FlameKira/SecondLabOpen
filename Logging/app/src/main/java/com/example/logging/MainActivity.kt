package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLog = findViewById<Button>(R.id.button_log)
        val buttonTimber = findViewById<Button>(R.id.button_timber)
        val editTextText = findViewById<EditText>(R.id.edit_text_text)

        buttonLog.setOnClickListener{
            Log.v("From EditText", editTextText.text.toString())
        }

        Timber.plant(Timber.DebugTree())

        buttonTimber.setOnClickListener{
            Timber.v(editTextText.text.toString())
        }
    }
}