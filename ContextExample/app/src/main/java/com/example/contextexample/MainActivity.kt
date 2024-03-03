package com.example.contextexample

import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityManagerCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.contextexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, "You are welcome", Toast.LENGTH_LONG).show()

    }
    fun showMessage(view: View){
        val alertMessage= AlertDialog.Builder(this@MainActivity)
        alertMessage.setTitle("Password Error!")
        alertMessage.setMessage("you did not enter a password. would you like to try again?")

        alertMessage.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this, "You try again. ", Toast.LENGTH_LONG).show()
        })
        alertMessage.setNegativeButton("No"){dialog,which ->
            Toast.makeText(this, "you choose no, you don't try", Toast.LENGTH_LONG).show()
        }
        alertMessage.show()
    }
}