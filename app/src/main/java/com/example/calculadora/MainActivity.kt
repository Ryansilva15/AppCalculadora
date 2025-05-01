package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var edit_primeiroNumero: EditText
    private lateinit var edit_segundoNumero: EditText
    private lateinit var btn_calcular: Button
    private lateinit var text_resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        edit_primeiroNumero = findViewById(R.id.edit_primeiroNumero)
        edit_segundoNumero = findViewById(R.id.edit_segundoNumero)
        btn_calcular = findViewById(R.id.btn_calcular)
        text_resultado = findViewById(R.id.text_resultado)


        btn_calcular.setOnClickListener {
            matematica()
        }
    }

    private fun matematica() {
        val num1 = edit_primeiroNumero.text.toString().toDoubleOrNull()
        val num2 = edit_segundoNumero.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null) {
            val resultado = num1 + num2
            text_resultado.text = "Resultado: $resultado"
        } else {
            text_resultado.text = "Por favor, insira números válidos."
        }
    }
}
