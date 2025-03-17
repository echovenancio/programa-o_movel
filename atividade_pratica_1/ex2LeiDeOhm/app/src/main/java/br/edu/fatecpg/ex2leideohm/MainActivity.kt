package br.edu.fatecpg.ex2leideohm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val edt_corrente = findViewById<EditText>(R.id.edt_corrente)
        val edt_tensao = findViewById<EditText>(R.id.edt_tensao)
        val edt_resistencia = findViewById<EditText>(R.id.edt_resistencia)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        val edts = arrayOf(edt_resistencia, edt_tensao, edt_corrente)
        btn_calcular.setOnClickListener {
            var tensao = edt_tensao.text.toString().toDouble()
            var corrente = edt_corrente.text.toString().toDouble()
            var resistencia = edt_resistencia.text.toString().toDouble()
            if (resistencia == 0.0) {
                edt_resistencia.setText("${tensao / corrente}")
            } else if (corrente == 0.0) {
                edt_corrente.setText("${tensao / resistencia}")
            } else {
                edt_tensao.setText("${resistencia * corrente}")
            }
        }
    }
}