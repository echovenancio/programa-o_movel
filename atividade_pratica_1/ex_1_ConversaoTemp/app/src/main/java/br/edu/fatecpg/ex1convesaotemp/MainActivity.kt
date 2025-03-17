package br.edu.fatecpg.ex1convesaotemp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val edt_celsius = findViewById<EditText>(R.id.edt_celsius)
        val btn_converter = findViewById<Button>(R.id.btn_converter)
        val txv_fah = findViewById<TextView>(R.id.txv_fah)
        btn_converter.setOnClickListener {
            val celsius = edt_celsius.text.toString().toFloat()
            val fah = (celsius * 1.8) + 32
            txv_fah.text = "Temperatura em Fahrenheit: F${fah}"
        }
    }
}