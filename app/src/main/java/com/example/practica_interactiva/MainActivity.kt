package com.example.practica_interactiva

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practica_interactiva.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var contador: Int = 0 // Inicializamos el contador
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializamos el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializamos el texto del contador
        binding.textoContador.text = "Contador: $contador"

        // Configuramos el evento de clic para el botón
        binding.botonClick.setOnClickListener {
            contador++ // Incrementamos el contador
            binding.textoContador.text = "Has clicado $contador veces." // Actualizamos el TextView
        }
    }
}
