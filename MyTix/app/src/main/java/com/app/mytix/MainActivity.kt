package com.app.mytix

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ambil Card dari XML
        val cardExo = findViewById<CardView>(R.id.cardExo)
        val cardBts = findViewById<CardView>(R.id.cardBts)

        // Klik EXO
        cardExo.setOnClickListener {
            val intent = Intent(this, ConcertDetailActivity::class.java)
            intent.putExtra("ID", 1)
            startActivity(intent)
        }

        // Klik BTS
        cardBts.setOnClickListener {
            val intent = Intent(this, ConcertDetailActivity::class.java)
            intent.putExtra("ID", 2)
            startActivity(intent)
        }
    }
}