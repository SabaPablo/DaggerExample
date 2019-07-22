package com.example

import com.example.daggerexample.Car
import com.example.daggerexample.MainActivity
import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}