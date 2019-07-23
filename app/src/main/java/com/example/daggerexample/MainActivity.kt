package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.car.Car
import com.example.daggerexample.dagger.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car : Car
    lateinit var component : CarComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        component = DaggerCarComponent.builder()
            .petrolEngineModule(PetrolEngineModule(100))
            .build()

        component.inject(this)

        car.driver()

    }
}
