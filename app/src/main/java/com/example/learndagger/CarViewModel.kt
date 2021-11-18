package com.example.learndagger

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarViewModel : ViewModel() {

    val carLiveData = MutableLiveData<Car>()

}