package com.smim.projekt2.scores

import androidx.databinding.ObservableInt

import androidx.lifecycle.ViewModel

class ScoresViewModel : ViewModel() {
    var scoreX: ObservableInt = ObservableInt(Scores.scoreX)
    var scoreO: ObservableInt = ObservableInt(Scores.scoreO)
}

