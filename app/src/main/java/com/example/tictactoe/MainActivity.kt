package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

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
        val twoZero: Button = findViewById(R.id.three_one)
        val twoOne: Button = findViewById(R.id.three_two)
        val twoTwo: Button = findViewById(R.id.three_three)

        val buttonArray = arrayOf(zeroZero, zeroOne, zeroTwo, oneZero, oneOne, oneTwo, twoZero, twoOne, twoTwo)

        var x = 0
        var y = 0
//        for(btn in buttonArray){
//            btn.setOnClickListener{
//                game.move(x,y)
//                y++
//                if(y==3){
//                    x++
//                    y=0
//                }
//                setText(btn)
//                btn.isEnabled = false
//                displayResult(p1Name.text.toString(), p2Name.text.toString())
//            }
//        }

        zeroZero.setOnClickListener{
            game.move(0,0)
            setText(zeroZero)
            zeroZero.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        zeroOne.setOnClickListener{
            game.move(0,1)
            setText(zeroOne)
            zeroOne.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        zeroTwo.setOnClickListener{
            game.move(0,2)
            setText(zeroTwo)
            zeroTwo.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        oneZero.setOnClickListener{
            game.move(1,0)
            setText(oneZero)
            oneZero.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        oneOne.setOnClickListener{
            game.move(1,1)
            setText(oneOne)
            oneOne.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        oneTwo.setOnClickListener{
            game.move(1,2)
            setText(oneTwo)
            oneTwo.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        twoZero.setOnClickListener{
            game.move(2,0)
            setText(twoZero)
            twoZero.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        twoOne.setOnClickListener{
            game.move(2,1)
            setText(twoOne)
            twoOne.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

        twoTwo.setOnClickListener{
            game.move(2,2)
            setText(twoTwo)
            twoTwo.isEnabled = false
            displayResult(p1Name.text.toString(), p2Name.text.toString())
        }

    }

    private fun displayResult(player1Name: String, player2Name: String){
        val playerName: String = if(game.turn == 'X') player2Name else player1Name

        if(game.status == Status.WON){
            disableAllButtons()
            Toast.makeText(this, "$playerName won the game", Toast.LENGTH_LONG).show()
        }
        else if(game.status == Status.DRAW){
            disableAllButtons()
            Toast.makeText(this, "Draw: no more legal moves can be played", Toast.LENGTH_LONG).show()
        }
    }

    private fun setText(btn: Button){
        btn.text = if(game.turn.toString() == "X") "0" else "X"
    }

    private fun disableAllButtons(){}
}