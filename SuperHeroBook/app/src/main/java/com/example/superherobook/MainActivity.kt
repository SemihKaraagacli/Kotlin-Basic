package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superherobook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var superHeroName=ArrayList<String>()
        superHeroName.add("Batman")
        superHeroName.add("Superman")
        superHeroName.add("Iron Man")
        superHeroName.add("Aquaman")
        superHeroName.add("Spiderman")

        //Verimsiz tanımlamalar
        /*
        val batmanBitMap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitMap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitMap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitMap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitMap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var superHeroVisuals=ArrayList<Bitmap>()
        superHeroVisuals.add(batmanBitMap)
        superHeroVisuals.add(supermanBitMap)
        superHeroVisuals.add(ironmanBitMap)
        superHeroVisuals.add(aquamanBitMap)
        superHeroVisuals.add(spidermanBitMap)
         */
        //Verimli Tanımlamalar
        val batmanDrawableId=R.drawable.batman
        var supermanDrawableId=R.drawable.superman
        val ironmanDrawableId=R.drawable.ironman
        var aquamanDrawableId=R.drawable.aquaman
        val spidermanDrawableId=R.drawable.spiderman

        val superHeroDrawableList=ArrayList<Int>()
        superHeroDrawableList.add(batmanDrawableId)
        superHeroDrawableList.add(supermanDrawableId)
        superHeroDrawableList.add(ironmanDrawableId)
        superHeroDrawableList.add(aquamanDrawableId)
        superHeroDrawableList.add(spidermanDrawableId)

        //Adapter
        val layoutManager=LinearLayoutManager(this)
        binding.recyclerView.layoutManager=layoutManager

        var adapter=RecyclerAdapter(superHeroName,superHeroDrawableList)
        binding.recyclerView.adapter=adapter
    }
}