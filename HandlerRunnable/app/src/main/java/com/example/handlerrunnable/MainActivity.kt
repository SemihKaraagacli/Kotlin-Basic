package com.example.handlerrunnable

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.handlerrunnable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var numara = 0
    var runnable: Runnable = Runnable {}
    var handler: Handler = Handler(Looper.myLooper()!!)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun start(view: View) {
        numara = 0
        runnable = object : Runnable {
            override fun run() {
                numara=numara+1
                binding.countText.text="Count: ${numara}"
                handler.postDelayed(runnable,1000)
            }

        }
        handler.post(runnable)
    }

    fun stop(view: View) {
        handler.removeCallbacks(runnable)
        numara=0
        binding.countText.text="Count: ${numara}"
    }
}