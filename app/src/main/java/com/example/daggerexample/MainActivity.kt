package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.car.Car
import com.example.daggerexample.dagger.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1 : Car
    @Inject lateinit var car2 : Car
    lateinit var component : CarComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        component = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        component.inject(this)

        car1.driver()
        car2.driver()

    }
}
