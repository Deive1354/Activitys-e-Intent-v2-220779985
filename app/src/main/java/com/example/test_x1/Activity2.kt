package com.example.test_x1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nameR = intent.getStringExtra("name")
        val tName : TextView = findViewById(R.id.txtv_name)
        tName.text = "Bienvenido: $nameR"


        val btnEnv : Button = findViewById(R.id.btn_siguiente)
        val txtCiudad : EditText = findViewById(R.id.txtCiudad)

        btnEnv.setOnClickListener (){
            val ciudad = txtCiudad.text.toString()
            val intent = Intent(this, Activity3::class.java).apply {
                putExtra("name", intent.getStringExtra("name")) // Pasa el nombre nuevamente
                putExtra("ciudad", ciudad)
            }
            startActivity(intent)
        }
    }
}