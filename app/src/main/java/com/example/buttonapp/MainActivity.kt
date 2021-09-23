package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numberTV: TextView
    lateinit var addBT: Button
    lateinit var subBT: Button
    //private var updateResult = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTV = findViewById(R.id.numberTV)
        addBT = findViewById(R.id.addBT)
        subBT = findViewById(R.id.subBT)

        addBT.setOnClickListener { changeNumber('+') }
        subBT.setOnClickListener { changeNumber('-') }

    }

    fun changeNumber(operation: Char) {
        var updateResult = numberTV.text.toString().toInt()
        //var height=numberTV.getHeight()
        when {
            operation == '+' -> {
                updateResult += 1
                // height+=10
            }
            operation == '-' -> {
                updateResult -= 1
                //height-=10
            }
        }
        numberTV.setText(updateResult.toString())
        // numberTV.setHeight(height)
        when {
            updateResult > 0 -> {
                numberTV.setTextColor(getResources().getColor(R.color.green))
            }
            updateResult == 0 -> {
                numberTV.setTextColor(getResources().getColor(R.color.black))
            }
            updateResult < 0 -> {
                numberTV.setTextColor(getResources().getColor(R.color.red))
            }
        }

    }
}