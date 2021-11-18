package com.example.learndagger

import dagger.Component

@Component(modules = [CarModule::class], dependencies = [Glass::class])
interface CarComponent {
    fun inject(activity: MainActivity)
}