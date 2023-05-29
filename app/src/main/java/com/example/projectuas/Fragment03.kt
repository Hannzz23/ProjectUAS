package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Fragment03 : AppCompatActivity() {
    private lateinit var jarijariEditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_03)

        jarijariEditText = findViewById(R.id.jariJari)
        resultTextView = findViewById(R.id.hasillingkaran)
        convertButton = findViewById(R.id.cvButton)

        convertButton.setOnClickListener {
            AreaLingkaran()
        }
    }
    private fun AreaLingkaran(){
        val number = jarijariEditText.text.toString().toDouble()
        val result = number * number * 3.14
        resultTextView.text = "Hasil Luas Lingkaran : $result "
    }
}