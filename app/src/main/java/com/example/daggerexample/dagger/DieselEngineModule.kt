package com.example.daggerexample.dagger

import com.example.daggerexample.car.DieselEngine
import com.example.daggerexample.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine) : Engine
}