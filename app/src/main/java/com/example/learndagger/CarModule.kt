package com.example.learndagger

import dagger.Module
import dagger.Provides

@Module
class CarModule {

    @Provides
    fun provideVehicle(engine: Engine): Vehicle {
        return Car(engine)
    }

    @Provides
    fun provideEngine(): Engine {
        return CarEngine()
    }
}