package com.example.daggerexample.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine : Engine {
    @Inject
    constructor()

    override fun start() {
        Log.d("Car", "Petrol engine started")
    }
}