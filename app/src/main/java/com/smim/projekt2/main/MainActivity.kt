package com.smim.projekt2.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProviders
import com.smim.projekt2.R
import com.smim.projekt2.databinding.ActivityMainBinding
import com.smim.projekt2.menu.MenuActivity


class MainActivity : AppCompatActivity(), EndGameListener,
    ButtonProvider {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val isSingleGame = intent.getBooleanExtra("SINGLE", true)

        val binding: ActivityMainBinding = setContentView(this,
            R.layout.activity_main
        )
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.eventListener = this
        viewModel.buttonProvider = this
        viewModel.singlePlayer = isSingleGame
    }

    override fun onOWin() {
        Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show()
        refreshView()
    }

    override fun onXWin() {
        Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show()
        refreshView()
    }

    override fun onDraw() {
        Toast.makeText(this, "There is no winner here", Toast.LENGTH_LONG).show()
        refreshView()
    }

    override fun onGameEnd(winner: Int) {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

    private fun refreshView(){
        recreate()
    }

    override fun findButtonById(id : Int): Button {
        return findViewById(id)
    }

}
