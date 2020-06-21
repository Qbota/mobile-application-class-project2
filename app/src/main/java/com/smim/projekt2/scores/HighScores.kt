package com.smim.projekt2.scores

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil.setContentView
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModelProviders
import com.smim.projekt2.R
import com.smim.projekt2.databinding.ActivityHighScoresBinding
import com.smim.projekt2.main.MainViewModel
import com.smim.projekt2.menu.MenuActivity


class HighScores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityHighScoresBinding = setContentView(this, R.layout.activity_high_scores)
        val viewModel = ViewModelProviders.of(this).get(ScoresViewModel::class.java)
        binding.viewmodel = viewModel
    }

    fun onBackToMenuClick(view: View){
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }


}
