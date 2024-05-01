package com.bignerdranch.bootsignalgenerator_android


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private lateinit var createBotButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createBotButton = findViewById(R.id.createBot_button)

        createBotButton.setOnClickListener {
            // создаем интент для перехода на целевую активность
            val intent = Intent(this, CreateBotActivity::class.kt)
            startActivity(intent)
        }
    }
}