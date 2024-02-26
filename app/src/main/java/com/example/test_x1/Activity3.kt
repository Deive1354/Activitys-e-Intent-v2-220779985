package com.example.test_x1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Activity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val nameR = intent.getStringExtra("name")
        val tName : TextView = findViewById(R.id.txtv_name)
        val ciudad = intent.getStringExtra("ciudad")
        val ciud : TextView = findViewById(R.id.txtCiudad)

        tName.text = "Bienvenido $nameR"
        ciud.text = "Tu ciudad es: $ciudad"
    }
}
