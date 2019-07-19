package com.example.daggerexample

import android.util.Log

class Car constructor(var engine: Engine, var wheels : Wheels) {


    fun driver(){
        Log.d("Car", "runnnnnnn")

    }
}
