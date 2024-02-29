package com.example.four_process

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.firstText
import kotlinx.android.synthetic.main.activity_main.resultText
import kotlinx.android.synthetic.main.activity_main.secondText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun sum(view: View) {
        var firstValue = firstText.text.toString().toIntOrNull()
        var secondValue = secondText.text.toString().toIntOrNull()

        if (firstValue == null || secondValue == null) {
            resultText.text = "True value enter"
        } else {
            var x = firstValue + secondValue
            resultText.text="${x}"
        }

    }

    fun eject(view: View) {
        var firstValue = firstText.text.toString().toIntOrNull()
        var secondValue = secondText.text.toString().toIntOrNull()

        if (firstValue == null || secondValue == null) {
            resultText.text = "True value enter"
        } else {
            var x = firstValue - secondValue
            resultText.text="${x}"
        }
    }

    fun multiply(view: View) {
        var firstValue = firstText.text.toString().toIntOrNull()
        var secondValue = secondText.text.toString().toIntOrNull()

        if (firstValue == null || secondValue == null) {
            resultText.text = "True value enter"
        } else {
            var x = firstValue * secondValue
            resultText.text="${x}"
        }
    }

    fun divide(view: View) {
        var firstValue = firstText.text.toString().toIntOrNull()
        var secondValue = secondText.text.toString().toIntOrNull()

        if (firstValue == null || secondValue == null) {
            resultText.text = "True value enter"
        } else {
            var x = firstValue / secondValue
            resultText.text="${x}"
        }
    }
}