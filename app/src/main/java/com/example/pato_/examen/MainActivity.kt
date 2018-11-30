package com.example.pato_.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLibros

            .setOnClickListener {

                this.irAPantallaDeItem()
            }

        buttonUsuario

            .setOnClickListener {

                this.irAPantallaDeUsuario()
            }
    }

    fun irAPantallaDeItem() {
        // INTENT
        val intentIrAItem = Intent(this, itemActivity::class.java)
        this.startActivity(intentIrAItem)
    }

    fun irAPantallaDeUsuario() {
        // INTENT
        val intentIrAUsuario = Intent(this, UsuarioActivity::class.java)
        this.startActivity(intentIrAUsuario)
    }


}
