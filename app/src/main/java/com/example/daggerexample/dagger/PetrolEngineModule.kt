package com.example.daggerexample.dagger

import com.example.daggerexample.car.Engine
import com.example.daggerexample.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine) : Engine

}