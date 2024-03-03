package com.example.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.activity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent= intent
        val getData=intent.getStringExtra("sendData")
        binding.textView2.text=getData
    }
}