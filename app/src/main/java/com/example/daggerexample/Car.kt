package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels : Wheels) {


    fun driver(){
        Log.d("Car", "runnnnnnn")

    }
}
