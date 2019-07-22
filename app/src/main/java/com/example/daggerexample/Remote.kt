package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class Remote {
    @Inject
    constructor()

    fun setListener(car: Car) {
        Log.d("Car", "Remote connected")
    }

}
