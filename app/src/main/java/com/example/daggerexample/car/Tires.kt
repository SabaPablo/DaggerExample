package com.example.daggerexample.car

import android.util.Log

class Tires {
    //La clase no es nuestra y no podemos agregarle @Inject

    fun inflate() {
        Log.d("Car", "Tires inflated")
    }

}
