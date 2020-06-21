package com.smim.projekt2.main

import android.graphics.Color
import android.view.View
import android.widget.Button
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import com.smim.projekt2.scores.Scores
import java.util.*
import kotlin.collections.ArrayList

class MainViewModel : ViewModel(){

    var scoreX: ObservableInt = ObservableInt(0)
    var scoreO: ObservableInt = ObservableInt(0)
    var currentPlayer: Int = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var eventListener: EndGameListener? = null
    var buttonProvider: ButtonProvider? = null
    var singlePlayer = true

    fun onButtonClick(view: View){
        val button = view as Button
        val cellId = GameLogic.getCellIdFrom(button)
        playGame(cellId, button)
        if(singlePlayer)
            botPlay()
    }

    private fun playGame(cellId: Int, button: Button){
        if(currentPlayer == 1){
            button.text = "X"
            button.setBackgroundColor(Color.RED)
            button.isEnabled = false
            player1.add(cellId)
        }else {
            button.text = "O"
            button.setBackgroundColor(Color.GREEN)
            button.isEnabled = false
            player2.add(cellId)
        }
        checkForPossibleWinner()
        changeCurrentPlayer()
    }

    private fun botPlay(){
        val  possibleMoves = ArrayList<Int>()
        for(cellId in 1..100){
            if(!player1.contains(cellId) && !player2.contains(cellId)){
                possibleMoves.add(cellId)
            }
        }
        val random = Random()
        val moveIndex = random.nextInt(possibleMoves.size)
        val cellId = possibleMoves[moveIndex]
        val buttonId = GameLogic.getButtonIdFrom(cellId)
        val button = buttonProvider!!.findButtonById(buttonId)
        playGame(cellId, button)
    }

    private fun checkForPossibleWinner(){
        val winner = GameLogic.checkForWinner(player1, player2)
        if(winner != null){
            if(winner == 1)
                raisePlayer1WinnerEvent()
            else
                raisePlayer2WinnerEvent()
        }
        else if(player1.size + player2.size == 100){
            raiseDrawEvent()
        }
    }

    private fun raiseDrawEvent() {
        resetGame()
        eventListener!!.onDraw()
    }

    private fun addPointToX(){
        val current = scoreX.get()
        scoreX.set(current + 1)
    }

    private fun addPointToO(){
        val current = scoreO.get()
        scoreO.set(current + 1)
    }

    private fun changeCurrentPlayer(){
        if(currentPlayer == 1)
            currentPlayer = 0
        else if(currentPlayer == 0)
            currentPlayer = 1
    }

    private fun raisePlayer1WinnerEvent() {
        addPointToX()
        resetGame()
        Scores.scoreX++
        eventListener!!.onXWin()
    }

    private fun raisePlayer2WinnerEvent() {
        addPointToO()
        resetGame()
        Scores.scoreO++
        eventListener!!.onOWin()
    }

    private fun resetGame(){
        player1 = ArrayList()
        player2 = ArrayList()
    }


}