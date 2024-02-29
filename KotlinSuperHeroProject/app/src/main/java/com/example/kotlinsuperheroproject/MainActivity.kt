package com.example.kotlinsuperheroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.ageText
import kotlinx.android.synthetic.main.activity_main.jobText
import kotlinx.android.synthetic.main.activity_main.nameText
import kotlinx.android.synthetic.main.activity_main.resultView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeSuperHero(view: View) {
        var name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        var job = jobText.text.toString()

        if (age==null){
            resultView.text="Enter correct age !!"
        }else{
            val superHero = SuperHero(name, age, job)

            resultView.text = "Name: ${superHero.name} Age: ${superHero.age} Job: ${superHero.job}"
        }


    }
}