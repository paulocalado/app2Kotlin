package com.mobile.codgin.app2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var textoFrase: TextView
    lateinit var btnFrase: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setVariables()

        btnFrase.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view:View): Unit {
                gerarFrase(view)
            }
        })
    }

    fun gerarFrase(view:View) {

        var arrayFrases = arrayOf("Essa é uma frase escrota", "Essa é uma frase mais escrota ainda", "essa eu não sei oq vai rolar")
        textoFrase.setText(arrayFrases[Random().nextInt(arrayFrases.size)])
    }

    fun setVariables() {
        textoFrase = findViewById(R.id.textoFrase)
        btnFrase = findViewById(R.id.btnFrase)
    }
}
