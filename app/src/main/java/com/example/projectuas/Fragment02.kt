package com.example.projectuas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Fragment02 : AppCompatActivity() {
   private lateinit var panjangEditText: EditText
   private lateinit var lebarEditText: EditText
   private lateinit var hasilTextView: TextView
   private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_02)

        panjangEditText = findViewById(R.id.Ppp)
        lebarEditText = findViewById(R.id.Lpp)
        hasilTextView = findViewById(R.id.hasilpp)
        convertButton = findViewById(R.id.convertButton)

        convertButton.setOnClickListener {
        AreaPersegiPanjang()
        }
    }

    private fun AreaPersegiPanjang(){
        val number1 = panjangEditText.text.toString().toDouble()
        val number2 = lebarEditText.text.toString().toDouble()

        val hasil = number1 * number2
        hasilTextView.text = "Luas Persegi Panjang : $hasil"
    }
}