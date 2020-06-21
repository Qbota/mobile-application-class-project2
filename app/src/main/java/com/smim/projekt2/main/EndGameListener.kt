package com.smim.projekt2.main

interface EndGameListener {

    fun onOWin()
    fun onXWin()
    fun onDraw()
    fun onGameEnd(winner: Int)
}