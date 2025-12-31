package com.andersonrocha.receitasdavo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvReceitas: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvReceitas = findViewById(R.id.rv_receitas)

        val lista = listOf(
            Receita("Almôndegas", "25 min", R.drawable.almondegas),
            Receita("Bobó de camarão", "45 min", R.drawable.bobo_de_camarao),
            Receita("Bolo de carne", "30 min", R.drawable.bolo_de_carne),
            Receita("Panqueca de carne moída", "15 min", R.drawable.panquecas),
        )

        //Adapter
        rvReceitas.adapter = ReceitasAdapter()

        //Layout
        rvReceitas.layoutManager = LinearLayoutManager(this)
    }
}