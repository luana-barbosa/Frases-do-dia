package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "Que o dia comece bem e termine ainda melhor.",
        "Nem todos os dias são bons, mas há algo bom em cada dia.",
        "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
        "Que os dias ruins se tornem raros e os bons virem rotina.",
        "Seja a mudança que você deseja ver no mundo."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.textofrase)
    }

    fun gerarFrase(view: View){

val totalIntensArray = frases.size
        val numeroAleatorio = Random.nextInt(totalIntensArray)
        texto.setText( frases [numeroAleatorio])
    }
}