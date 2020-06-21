package com.smim.projekt2

import com.smim.projekt2.main.GameLogic
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class GameLogicUnitTests {

    @Test
    fun noWinnerForEmptyBoard(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fullBoardWithoutWinnerEndsAsDraw(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        for(i in 1..100){
            if( i in 1..20){
                if(i % 2 == 0)
                    player1.add(i)
                else
                    player2.add(i)
            }
            else if(i in 21..40){
                if(i % 2 == 0)
                    player2.add(i)
                else
                    player1.add(i)
            }
            else if(i in 41..60){
                if(i % 2 == 0)
                    player1.add(i)
                else
                    player2.add(i)
            }
            else if(i in 61..80){
                if(i % 2 == 0)
                    player2.add(i)
                else
                    player1.add(i)
            }
            else{
                if(i % 2 == 0)
                    player1.add(i)
                else
                    player2.add(i)
            }
        }
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInAColumnResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(1,11,21,31,41))
        assertEquals(1, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInARowResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(33,34,35,36,37))
        assertEquals(1, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInAColumnResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(1,11,21,31,41))
        assertEquals(2, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInARowResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(33,34,35,36,37))
        assertEquals(2, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInADescendingDiagonalResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(2,13,24,35,46))
        assertEquals(1, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInAnAscendingDiagonalResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(5,14,23,32,41))
        assertEquals(1, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInADescendingDiagonalResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(2,13,24,35,46))
        assertEquals(2, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveInARowInAnAscendingDiagonalResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(5,14,23,32,41))
        assertEquals(2, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInAColumnResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(1,11,21,31,51))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInARowResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(31,34,35,36,37))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInAColumnResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(1,11,61,31,41))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInARowResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(33,34,35,36,39))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInADescendingDiagonalResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(2,13,24,35,57))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInAnAscendingDiagonalResultWinForPlayer1(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player1.addAll(listOf(5,14,23,32,50))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInADescendingDiagonalResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(2,13,24,35,57))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

    @Test
    fun fiveNotInARowInAnAscendingDiagonalResultWinForPlayer2(){
        val player1 = ArrayList<Int>()
        val player2 = ArrayList<Int>()
        player2.addAll(listOf(5,14,23,32,50))
        assertEquals(null, GameLogic.checkForWinner(player1, player2))
    }

}
