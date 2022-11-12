package com.etermax.preguntados.kata_news.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etermax.preguntados.kata_news.databinding.ActivityMainBinding

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}