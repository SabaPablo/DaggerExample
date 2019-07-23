package com.example.daggerexample.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine : Engine, val wheels : Wheels) {



    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }


    fun driver(){
        engine.start()
        Log.d("Car", "driving...")

    }
}
