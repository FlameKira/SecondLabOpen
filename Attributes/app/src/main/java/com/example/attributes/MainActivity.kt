package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etText = findViewById<EditText>(R.id.et_text)

        val btnBlackText = findViewById<Button>(R.id.btn_black_text)
        val btnRedText = findViewById<Button>(R.id.btn_red_text)
        val btnSize8 = findViewById<Button>(R.id.btn_size_8)
        val btnSize24= findViewById<Button>(R.id.btn_size_24)
        val btnWhiteBack = findViewById<Button>(R.id.btn_white_back)
        val btnYellowBack = findViewById<Button>(R.id.btn_yellow_back)

        btnBlackText.setOnClickListener{
            etText.setTextColor(Color.BLACK)
        }

        btnRedText.setOnClickListener{
            etText.setTextColor(Color.RED)
        }

        btnSize8.setOnClickListener{
            etText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F)
        }

        btnSize24.setOnClickListener{
            etText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        }

        btnWhiteBack.setOnClickListener{
            etText.setBackgroundColor(Color.WHITE)
        }

        btnYellowBack.setOnClickListener{
            etText.setBackgroundColor(Color.YELLOW)
        }
    }
}