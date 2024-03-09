package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v4.os.IResultReceiver2.Default
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
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val selectHeroName = intent.getStringExtra("superHeroName")
        binding.textView.text=selectHeroName

        val selectHeroVisual=intent.getIntExtra("superHeroVisual",0)
        val bitmap= BitmapFactory.decodeResource(applicationContext.resources,selectHeroVisual)
        binding.imageView.setImageBitmap(bitmap)
        /*
        val selectHeroVisual=SingletonClass.selectHero
        val selectVisual=selectHeroVisual.visual
        binding.imageView.setImageBitmap(selectVisual)*/


    }
}

