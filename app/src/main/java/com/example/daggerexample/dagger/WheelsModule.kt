package com.example.daggerexample.dagger

import com.example.daggerexample.car.Rims
import com.example.daggerexample.car.Tires
import com.example.daggerexample.car.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {

    @JvmStatic
    @Provides
    fun provideRims() : Rims {
        return Rims()
    }

    @JvmStatic
    @Provides
    fun provideTires() : Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @JvmStatic
    @Provides
    fun provideWheels(rims: Rims, tires: Tires) : Wheels {
        return Wheels(rims, tires)
    }
}