package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val game = TicTacToe()

    @SuppressLint("ResourceAsColor")
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


        zeroZero.setOnClickListener{
            game.move(0,0)
            zeroZero.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

    }

    fun displayResult(player1Name: String, player2Name: String){
        val playerName: String = if(game.turn == 'X') player1Name else player2Name

        if(game.status == Status.WON){
            Toast.makeText(this, "$playerName won the game", Toast.LENGTH_LONG).show()
        }
        else if(game.status == Status.DRAW){
            Toast.makeText(this, "Draw: no more legal moves can be played", Toast.LENGTH_LONG).show()
        }
    }
}