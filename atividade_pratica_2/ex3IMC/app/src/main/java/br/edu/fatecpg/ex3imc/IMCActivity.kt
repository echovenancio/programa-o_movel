package br.edu.fatecpg.ex3imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.ex3imc.dao.IMCDao

class IMCActivity : AppCompatActivity(R.layout.activity_imcactivity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = IMCDao()
        val dado = dao.get_imc().last()
        val imc = dado.peso/(dado.altura*dado.altura)
        val txv_imc = findViewById<TextView>(R.id.txv_imc)
        val txv_desc = findViewById<TextView>(R.id.txv_desc)
        txv_imc.text = imc.toString()
        if (imc < 18.45) {
            txv_desc.text = "Baixo peso"
        } else if (imc < 24.9) {
            txv_desc.text = "Peso normal"
        } else if (imc < 29.9) {
            txv_desc.text = "Sobrepeso"
        } else {
            txv_desc.text = "Obesidade"
        }
    }
}