package com.example.learndagger

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var carByLazy: Vehicle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCarComponent.builder().glass(Glass()).build().inject(this)

        with(findViewById<TextView>(R.id.textView)) {
            setOnClickListener {
                carByLazy.run()
//                with(createCarUsingParameterInjection()) {
//                    this.run()
//                }
            }
        }
    }

    /**
     * Create an instance using parameter injection.
     */
//    fun createCarUsingParameterInjection(): Vehicle {
//        return carByLazy
//    }

    /**
     * Create an instance using name qualifier.
     */
//    fun createCarUsingNameQualifier(): Car {
//        return get<Car>(qualifier = named(CAR_QUALIFIER))
//    }
}