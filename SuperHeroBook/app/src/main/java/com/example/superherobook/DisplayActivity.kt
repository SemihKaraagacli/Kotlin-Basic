package com.example.superherobook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.superherobook.databinding.ActivityDisplayBinding
import com.example.superherobook.databinding.ActivityMainBinding

class DisplayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}