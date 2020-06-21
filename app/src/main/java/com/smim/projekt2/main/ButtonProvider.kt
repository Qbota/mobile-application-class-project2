package com.smim.projekt2.main

import android.widget.Button

interface ButtonProvider {
    fun findButtonById(id: Int) : Button
}
