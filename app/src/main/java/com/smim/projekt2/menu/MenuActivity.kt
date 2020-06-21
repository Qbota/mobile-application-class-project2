package com.smim.projekt2.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.smim.projekt2.R
import com.smim.projekt2.main.MainActivity
import com.smim.projekt2.scores.HighScores

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun onSingleStart(view: View){
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("SINGLE", true)
        }
        startActivity(intent)
    }

    fun onMultiStart(view: View){
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("SINGLE", false)
        }
        startActivity(intent)
    }
    fun onScoresClick(view: View){
        val intent = Intent(this, HighScores::class.java)
        startActivity(intent)
    }
    fun onExitClick(view: View){
        finishAffinity()
    }
}
