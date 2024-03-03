package com.example.keepusername

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.keepusername.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    var getUsername: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.main)

        //SharedPreferences

        sharedPreferences = this.getSharedPreferences("com.example.keepusername", MODE_PRIVATE)

        getUsername = sharedPreferences.getString("user", "")
        if (getUsername != null) {
            binding.saveUsername.text = "Save Username: ${getUsername}"
        }
    }

    fun save(view: View) {
        val userName = binding.editText.text.toString()
        if (userName == "") {
            Toast.makeText(this, "please, enter a value?", Toast.LENGTH_LONG).show()
        } else {
            sharedPreferences.edit().putString("user", userName).apply()
            binding.saveUsername.text = "Save username: ${userName}"
        }
    }

    fun delete(view: View) {
        getUsername=sharedPreferences.getString("user","")
        if (getUsername!=null){
            binding.saveUsername.text="Save Username: "
            sharedPreferences.edit().remove("user").apply()
        }
    }
}