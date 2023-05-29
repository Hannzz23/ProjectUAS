package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var persegiButton: Button
    private lateinit var persegipanjangButton: Button
    private lateinit var lingkaranButton: Button
    private lateinit var segitigaButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        persegiButton = findViewById(R.id.PersegiBTN)
        persegiButton.setOnClickListener(this)

        persegipanjangButton = findViewById(R.id.PersegiPanjangBTN)
        persegipanjangButton.setOnClickListener(this)

        lingkaranButton = findViewById(R.id.LingkaranBTN)
        lingkaranButton.setOnClickListener(this)

        segitigaButton = findViewById(R.id.SegitigaBTN)
        segitigaButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.PersegiBTN -> {
                val intent1 = Intent(this@MainActivity, Fragment01::class.java)
                startActivity(intent1)
            }
        }
        when (v.id) {
            R.id.PersegiPanjangBTN -> {
                val intent2 = Intent(this@MainActivity, Fragment02::class.java)
                startActivity(intent2)
            }
        }
        when (v.id) {
            R.id.LingkaranBTN -> {
                val intent3 = Intent(this@MainActivity, Fragment03::class.java)
                startActivity(intent3)
            }
        }
        when (v.id) {
            R.id.SegitigaBTN -> {
                val intent4 = Intent(this@MainActivity, Fragment04::class.java)
                startActivity(intent4)
            }
        }
    }
}


