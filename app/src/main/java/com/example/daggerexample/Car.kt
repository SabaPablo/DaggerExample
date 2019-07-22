package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels : Wheels) {

    @Inject lateinit var engine :  Engine

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }


    fun driver(){
        Log.d("Car", "runnnnnnn")

    }
}
