package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1Name: EditText = findViewById(R.id.p1_name)
        val p2Name: EditText = findViewById(R.id.p2_name)
        val p1TurnLabel: TextView = findViewById(R.id.p1)
        val p2TurnLabel: TextView = findViewById(R.id.p2)


        //First Row Buttons
        val zeroZero: Button = findViewById(R.id.one_one)
        val zeroOne: Button = findViewById(R.id.one_two)
        val zeroTwo: Button = findViewById(R.id.one_three)

        //Second Row Buttons
        val oneZero: Button = findViewById(R.id.two_one)
        val oneOne: Button = findViewById(R.id.two_two)
        val oneTwo: Button = findViewById(R.id.two_three)

        //Third Row Buttons
        val threeZero: Button = findViewById(R.id.three_one)
        val threeOne: Button = findViewById(R.id.three_two)
        val threeTwo: Button = findViewById(R.id.three_three)
    }
}