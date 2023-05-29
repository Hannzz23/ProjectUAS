package com.example.projectuas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Fragment01 : AppCompatActivity() {
    private lateinit var sisiEditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_01)

        sisiEditText = findViewById(R.id.sisi)
        resultTextView = findViewById(R.id.hasilpersegi)
        convertButton = findViewById(R.id.cButton)

        convertButton.setOnClickListener {
            AreaPersegi()
        }
        }
    private fun AreaPersegi(){
        val number1 = sisiEditText.text.toString().toDouble()
        val result = number1 * number1
        resultTextView.text = "Luas Persegi : $result "
    }
}