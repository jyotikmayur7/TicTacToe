package com.example.tictactoe
import java.lang.reflect.Array
import java.util.*

class TicTacToe {
    private val board = Array(3){Array(3) {'-'} }
    var turn = 'X'
    private var movesPlayed = 0
    var status = Status.ONGOING

    fun move(x: Int, y: Int){
        board[x][y] = turn
        movesPlayed++

        var wonInCurrentTurn = true

        // Checking for rows
        for(i in 0..2){
            wonInCurrentTurn = true
            for(j in 0..2){
                if(board[i][j] != turn){
                    wonInCurrentTurn = false
                    break
                }
            }
            if(wonInCurrentTurn){
                status = Status.WON
                toggleTurn()
                return
            }
        }

        // Checking for columns
        for(i in 0..2){
            wonInCurrentTurn = true
            for(j in 0..2){
                if(board[j][i] != turn){
                    wonInCurrentTurn = false
                    break
                }
            }
            if(wonInCurrentTurn){
                status = Status.WON
                toggleTurn()
                return
            }
        }

        //Checking for diagonals
        if(board[0][0] == turn && board[1][1] == turn && board[2][2] == turn){
            status = Status.WON
            toggleTurn()
            return
        }

        if(board[0][2] == turn && board[1][1] == turn && board[2][1] == turn){
            status = Status.WON
            toggleTurn()
            return
        }

        // If all the moves are played and no one won
        if(movesPlayed == 9){
            status = Status.DRAW
            toggleTurn()
            return
        }

        toggleTurn()

    }

    private fun toggleTurn(){
        if(turn == 'X') turn = 'O' else turn = 'X'
    }

    fun resetGame(){
        for(i in 0..2){
            for(j in 0..2){
                board[i][j] = '-'
            }
        }
        status = Status.ONGOING
        movesPlayed = 0
        turn = 'X'
    }

}