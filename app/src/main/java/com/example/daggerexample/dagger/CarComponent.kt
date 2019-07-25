package com.example.daggerexample.dagger

import com.example.daggerexample.*
import com.example.daggerexample.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower:Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int) : Builder

        fun build(): CarComponent
    }
}