package com.example.daggerexample.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(var horsePower: Int) : Engine {

    override fun start() {
        Log.d("Car", "Petrol engine started. Horsepower: $horsePower")
    }
}