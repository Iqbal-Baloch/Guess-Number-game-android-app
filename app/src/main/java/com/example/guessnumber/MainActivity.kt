package com.example.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var random:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random = Random().nextInt(1000)
    }
    fun validate(view: View){
        val lbl: TextView = findViewById(R.id.lblResults)
        val num: EditText = findViewById(R.id.inputNum)

        val number = Integer.parseInt(num.text.toString())
        if(number > random){
            lbl.text = "Too High"
        }
        else if (number < random)
            lbl.text = "too low"
        else
            lbl.text = "you guessed correctly.."
    }
}