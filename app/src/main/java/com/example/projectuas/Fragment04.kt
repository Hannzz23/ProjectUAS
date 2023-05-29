package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Fragment04 : AppCompatActivity() {
    private lateinit var alasEditText: EditText
    private lateinit var tinggiEditText: EditText
    private lateinit var hasilTextView: TextView
    private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_04)

        alasEditText = findViewById(R.id.alas)
        tinggiEditText = findViewById(R.id.tinggi)
        hasilTextView = findViewById(R.id.hasilsegitiga)
        convertButton = findViewById(R.id.cvrtButton)

        convertButton.setOnClickListener {
            AreaSegitiga()
        }
    }

    private fun AreaSegitiga(){
        val number1 = alasEditText.text.toString().toDouble()
        val number2 = tinggiEditText.text.toString().toDouble()

        val hasil = number1 * number2 * 0.5
        hasilTextView.text = "Luas Segitiga : $hasil"
    }
}