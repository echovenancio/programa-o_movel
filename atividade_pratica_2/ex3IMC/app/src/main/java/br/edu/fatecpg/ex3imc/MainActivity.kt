package br.edu.fatecpg.ex3imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex3imc.dao.IMCDao

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val edt_peso = findViewById<EditText>(R.id.edt_peso)
        val edt_altura = findViewById<EditText>(R.id.edt_altura)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        val dao = IMCDao()
        btn_calcular.setOnClickListener {
            dao.add_imc(edt_peso.text.toString().toDouble(), edt_altura.text.toString().toDouble())
            val intent = Intent(this, IMCActivity::class.java)
            startActivity(intent)
        }
    }
}