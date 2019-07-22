package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.CarComponent
import com.example.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    lateinit var car : Car
    lateinit var component : CarComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component = DaggerCarComponent.create()

        car = component.getCar()

        car.driver()

    }
}
