package com.example.fragmentdeneme

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentdeneme.databinding.Fragment1Binding
import com.google.android.material.snackbar.Snackbar

class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=Fragment1Binding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
//            Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
//            binding.textView.text="Nasılsın"

            val urun= Urunler(100,"TV")
            val gecis=Fragment1Directions.actionFragment1ToFragment2(urun=urun,ad="Ahmet", yas = 23,boy= 1.78f, bekar = false)
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam döngüsü","onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam döngüsü","onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam döngüsü","onResume")
    }

}