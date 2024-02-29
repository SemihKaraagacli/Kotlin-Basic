package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.textView2
import kotlinx.android.synthetic.main.activity_main.view.textView2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        println("Hello Kotlin")
//        println(5 * 25)
//
//        //Variables
//
//        var a = 5
//        println("a: " + a)
//        a = 9
//        println("a: " + a)
//
//        val b = 6
//        println("b: " + b)
//        //b=7                       UNCHANCED VARIABLES TYPE
//        //println("b: " + b)
//
//
//        val dTypes = listOf("Ali", 5, 3000000000, 1L, 1, 3.14, 2.7182818284f, true)
//
//        for (i in dTypes) {
//
//            println("Index of: " + i + " -->" + "data Type: > " + i::class.simpleName)
//        }
//
//        var ex = 3.13
//        println("ex before data type: " + ex::class.simpleName)
//        var exAfter = ex.toString()
//        println("ex after data type: " + exAfter::class.simpleName)
//
//
//        var myArray = arrayOf("Semih Karaağaçlı", "Konya", "Toyota", "Delta")
//        var boolArray = booleanArrayOf(true, false)
//        var doubleArray = doubleArrayOf(0.2, 5.2, 8.9)
//        var intArray = intArrayOf(1, 2, 3, 4, 5, 6)
//
//        val nameList = arrayListOf("Semih", "Karaağaçlı", "Ali", "Rusya", "Tokyo")
//        nameList.add(5, "Osman")
//        println(nameList[5])
//        val mixArray = arrayListOf<Any>("s", 5, 6.1, true)
//
//
//        val eatCalorieMap = HashMap<String, Int>()
//        eatCalorieMap.put("Apple", 100)
//        eatCalorieMap.put("Pear", 300)
//        eatCalorieMap.put("Chicken", 200)
//
//        val newMap = HashMap<String, Int>()
//        newMap.put("ali", 5)
//
//        val newMap1 = hashMapOf<String, Int>("Veli" to 5, "Ayşe" to 10)
//
//        var finalGrade = 4
//        var finalGradeString = ""
//
//        when (finalGrade) {
//            0 -> finalGradeString = "Invalid note"
//            1 -> finalGradeString = "weak"
//            2 -> finalGradeString = "bad"
//            3 -> finalGradeString = "medium"
//            4 -> finalGradeString = "good"
//            else -> finalGradeString = "very good"
//        }
//        println(finalGradeString)
//        firstFunction()
//        subraction(25, 3)
//        var x = addition(100, 40)
//        textView2.text = "Result: ${x}"
        //classWorking()

    }

//    fun firstFunction() {
//        println("First Function")
//
//    }
//
//    fun subraction(x: Int, y: Int) {
//        textView2.text = "Result: ${x - y}"
//    }
//
//    fun addition(a: Int, b: Int): Int {
//        return a + b
//    }
/*
    fun classWorking(){
//        var superman=SuperHero()
//        superman.name="Superman"
//        superman.age=50
//        superman.job="journalist"
//        textView2.text="Age:  ${superman.age}"

        var superman=SuperHero("Superman",50,"Journalist")

        button.setOnClickListener {
            textView2.text="Age: ${superman.age}"
        }
    }*/

    
}