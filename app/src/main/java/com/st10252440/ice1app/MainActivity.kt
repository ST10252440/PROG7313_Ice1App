package com.st10252440.ice1app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnOne: Button
    private lateinit var valField1: EditText
    private lateinit var valField2: EditText
    private lateinit var resultField: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnOne = findViewById(R.id.button2)
        valField1 = findViewById(R.id.ValueAdd1)
        valField2 = findViewById(R.id.ValueAdd2)
        resultField = findViewById(R.id.textView2)

        btnOne.setOnClickListener() {
            val num1 = valField1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = valField2.text.toString().toDoubleOrNull() ?: 0.0
            val sum = num1 + num2
            resultField.text = "Result: $sum"
        }

    }
}