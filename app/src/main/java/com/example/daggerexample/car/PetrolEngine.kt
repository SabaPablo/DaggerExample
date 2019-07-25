package com.example.daggerexample.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power") var horsePower: Int, @Named("engine capacity")  var engineCapacity: Int) : Engine {

    override fun start() {
        Log.d("Car", "Petrol engine started. \nHorsepower: $horsePower \nEngine Capacity: $engineCapacity")
    }
}