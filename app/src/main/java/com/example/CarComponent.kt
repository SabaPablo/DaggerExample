package com.example

import com.example.daggerexample.Car
import com.example.daggerexample.MainActivity
import com.example.daggerexample.WheelsModule
import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}