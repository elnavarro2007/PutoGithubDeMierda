package com.example.superheroes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.superheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 1 - creamos la variable lateinit porque la vamos a inicializar luego

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // se trabaja a partir de aqui para introducir el codigo necesario


        val botonGuardar = findViewById<Button>(R.id.button)
        binding.button.setOnClickListener {

            val superHeroName = binding.editTextText.text.toString()
            val alterEgo = binding.alterEgoEdit.text.toString()
            val bio = binding.bioEdit.text.toString()
            val poder = binding.ratingBar.rating
            irDetailActivity(superHeroName, alterEgo, bio, poder)
        }
    }

    fun irDetailActivity(superHeroName: String, alterEgo: String, bio: String, poder: Float) {
        val intent = Intent(this, DetailActivity::class.java)

        // pasar todos los campos a la interfaz con el putExtra
        intent.putExtra("Nombre SuperHeroe", superHeroName)
        intent.putExtra("Alter ego", alterEgo)
        intent.putExtra("Biografia", bio)
        intent.putExtra("poder", poder)

        startActivity(intent)
    }


}