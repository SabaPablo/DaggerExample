package com.example.daggerexample.dagger

import com.example.daggerexample.car.DieselEngine
import com.example.daggerexample.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private var horsePower: Int) {



    @Provides
    fun provideHorsePower() : Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine) : Engine {
        return engine
    }

}