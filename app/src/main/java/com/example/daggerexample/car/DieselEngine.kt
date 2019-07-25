package com.example.daggerexample.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(var horsePower: Int) : Engine {

    override fun start() {
        Log.d("Car", "Diesel engine started, Horsepower : $horsePower")
    }
}