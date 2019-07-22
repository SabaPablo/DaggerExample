package com.example

import com.example.daggerexample.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car
}