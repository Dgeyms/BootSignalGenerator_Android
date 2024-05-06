package com.bignerdranch.bootsignalgenerator_android

import PoolActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private lateinit var createPoolButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createPoolButton = findViewById(R.id.createBot_button)

        createPoolButton.setOnClickListener {
            // создаем интент для перехода на целевую активность
            val intent = Intent(this, PoolActivity::class.java)
            startActivity(intent)
        }
    }
}