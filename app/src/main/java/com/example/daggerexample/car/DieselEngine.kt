package com.example.daggerexample.car

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine {
    @Inject
    constructor()

    override fun start() {
        Log.d("Car", "Diesel engine started")
    }
}