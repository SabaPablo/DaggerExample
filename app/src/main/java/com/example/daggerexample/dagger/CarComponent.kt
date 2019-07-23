package com.example.daggerexample.dagger

import com.example.daggerexample.*
import com.example.daggerexample.car.Car
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}