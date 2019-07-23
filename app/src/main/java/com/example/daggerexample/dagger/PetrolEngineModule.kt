package com.example.daggerexample.dagger

import com.example.daggerexample.car.Engine
import com.example.daggerexample.car.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule(private var horsePower: Int) {

    @Provides
    fun provideEngine() : Engine {
        return PetrolEngine(horsePower)
    }
}